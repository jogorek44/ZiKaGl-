package bj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Decks {
	private final List<Card> cards;

	public Decks(int nDecks) {
		if (nDecks < 1)
			throw new IllegalArgumentException("nDecks not positive");
		cards = new ArrayList<>(nDecks * 52);
		for (int i = 0; i < nDecks; i++)
			for (int value = 1; value <= 13; value++)
				for (var suit : "HSCD".toCharArray())
					cards.add(new Card(suit, value));
		Collections.shuffle(cards);
	}

	public Card drawCard() {
		return cards.remove(cards.size() - 1);
	}
}