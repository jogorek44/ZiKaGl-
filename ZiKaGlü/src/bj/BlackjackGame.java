package bj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public final class BlackjackGame {
	private final PlayerData[] data;
	private final ArrayList<Card> dealerCards = new ArrayList<>();
	private final Decks decks;
	private int phase = 0;

	public BlackjackGame(Player[] players, int nDecks) {
		data = Arrays.stream(players).map(PlayerData::new).toArray(PlayerData[]::new);
		decks = new Decks(nDecks);
	}

	public int getPlayerGameN(int id) {
		return data[getIndexOf(id)].games.size();
	}

	public Card[] getCards(int id, int gameN) {
		return data[getIndexOf(id)].games.get(gameN).cards.toArray(new Card[0]);
	}

	public Card[] getDealerCards() {
		return dealerCards.toArray(new Card[0]);
	}

	private int getIndexOf(int id) {
		return IntStream.range(0, data.length).filter(i -> data[i].player.getId() == id).findFirst().orElseThrow();
	}

	private void assertBettingPhase() {
		if (phase != 0) throw new IllegalStateException("betting phase is over");
	}

	private void assertSplittingPhase() {
		if (phase != 1) throw new IllegalStateException("not in splitting phase");
	}

	private void assertHittingPhase() {
		if (phase != 2) throw new IllegalStateException("not in hitting phase");
	}

	private int getGameSum(GameData gd) {
		return Utility.getSum(gd.cards.stream().mapToInt(Card::value));
	}

	public boolean hasEveryoneBet() {
		assertBettingPhase();
		return Arrays.stream(data).noneMatch(pd -> pd.games.isEmpty());
	}

	public boolean hasPlayerBet(int id) {
		assertBettingPhase();
		return !data[getIndexOf(id)].games.isEmpty();
	}

	public void bet(int id, int amt) {
		if (amt < 1) throw new IllegalArgumentException("amount must be positive");
		if (hasPlayerBet(id)) throw new IllegalArgumentException("player already bet");
		var pd = data[getIndexOf(id)];
		if (pd.player.getBank() < amt) throw new IllegalArgumentException("player doesn't have enough money");
		pd.games.add(new GameData(amt));
		pd.player.setBank(pd.player.getBank() - amt);
	}

	public void startSplitting() {
		if (!hasEveryoneBet()) throw new IllegalStateException("not everyone has bet");
		++phase;
		for (var pd : data) {
			pd.games.get(0).cards.add(decks.drawCard());
			pd.games.get(0).cards.add(decks.drawCard());
		}
		dealerCards.add(decks.drawCard());
	}

	public boolean isEveryoneDoneSplitting() {
		assertSplittingPhase();
		return Arrays.stream(data).allMatch(pd -> pd.splittingDone || pd.games.stream().allMatch(g -> g.cards.get(0) != g.cards.get(1)));
	}

	public int[] getPossibleSplits(int id) {
		assertSplittingPhase();
		var pd = data[getIndexOf(id)];
		if (pd.splittingDone) throw new IllegalStateException("player already done splitting");
		return IntStream.range(0, pd.games.size()).filter(i -> pd.games.get(i).cards.get(0) == pd.games.get(i).cards.get(1)).toArray();
	}

	public void setDoneSplitting(int id) {
		assertSplittingPhase();
		var pd = data[getIndexOf(id)];
		if (pd.splittingDone) throw new IllegalStateException("player already done splitting");
		pd.splittingDone = true;
	}

	public void split(int id, int gameN) {
		if (!Utility.contains(getPossibleSplits(id), gameN)) throw new IllegalArgumentException("game cannot be split");
		var pd = data[getIndexOf(id)];
		var games = pd.games;
		if (pd.player.getBank() < games.get(gameN).bet)
			throw new IllegalArgumentException("player doesn't have enough money");
		games.add(new GameData(games.get(gameN).bet));
		pd.player.setBank(pd.player.getBank() - games.get(gameN).bet);
		var cards = games.get(gameN).cards;
		games.get(games.size() - 1).cards.add(cards.remove(1));
		games.get(games.size() - 1).cards.add(decks.drawCard());
		cards.add(decks.drawCard());
	}

	public void startHitting() {
		if (!isEveryoneDoneSplitting()) throw new IllegalStateException("not everyone is done splitting");
		++phase;
	}

	public boolean isEveryoneDoneHitting() {
		assertHittingPhase();
		return Arrays.stream(data).allMatch(pd -> pd.hittingDone || pd.games.stream().allMatch(g -> getGameSum(g) >= 21));
	}

	public int[] getPossibleHits(int id) {
		assertHittingPhase();
		var pd = data[getIndexOf(id)];
		if (pd.hittingDone) throw new IllegalArgumentException("player already done hitting");
		return IntStream.range(0, pd.games.size()).filter(i -> getGameSum(pd.games.get(i)) < 21).toArray();
	}

	public void setDoneHitting(int id) {
		assertHittingPhase();
		var pd = data[getIndexOf(id)];
		if (pd.hittingDone) throw new IllegalArgumentException("player already done hitting");
		pd.hittingDone = true;
	}

	public void hit(int id, int gameN) {
		if (!Utility.contains(getPossibleHits(id), gameN))
			throw new IllegalStateException("player cannot hit that game");
		data[getIndexOf(id)].games.get(gameN).cards.add(decks.drawCard());
	}

	public Player[] endGame() {
		if (!isEveryoneDoneHitting()) throw new IllegalStateException("not everyone is done hitting");
		++phase;
		int dealerSum;
		do {
			dealerCards.add(decks.drawCard());
			dealerSum = Utility.getSum(dealerCards.stream().mapToInt(Card::value));
		} while (dealerSum < 17);
		for (var pd : data) {
			var bank = pd.player.getBank();
			for (var game : pd.games) {
				var sum = getGameSum(game);
				if (sum > 21) continue;
				if (sum < dealerSum && dealerSum <= 21) continue;
				if (sum == dealerSum) bank += game.bet;
				else if (sum == 21 && pd.games.size() == 1) bank += game.bet * 5 / 2;
				else bank += 2 * game.bet;
			}
			pd.player.setBank(bank);
		}
		return Arrays.stream(data).map(pd -> pd.player).toArray(Player[]::new);
	}

	private final static class GameData {
		final ArrayList<Card> cards = new ArrayList<>();
		int bet;

		GameData(int bet) {
			this.bet = bet;
		}
	}

	private final static class PlayerData {
		final Player player;
		final ArrayList<GameData> games = new ArrayList<>();
		boolean splittingDone;
		boolean hittingDone;

		PlayerData(Player player) {
			this.player = new Player(player.getId(), player.getBank());
		}
	}
}