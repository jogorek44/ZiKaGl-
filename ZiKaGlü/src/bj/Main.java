package bj;

public final class Main {
	public static void main(String[] args) {
		var players = new Player[] {
				new Player(1,  100),
				new Player(2,  10),
		};
		var mygame = new BlackjackGame(players, 8);
		mygame.bet(1, 20);
		mygame.bet(2, 1);
		mygame.startSplitting();
		mygame.setDoneSplitting(1);
		// mygame.setDoneSplitting(2);
		mygame.startHitting();
		mygame.hit(1, 0);
		mygame.hit(1, 0);
		mygame.setDoneHitting(1);
		mygame.setDoneHitting(2);
		var players2 = mygame.endGame();
		for (var p : players2)
			System.out.println();
	}
}
