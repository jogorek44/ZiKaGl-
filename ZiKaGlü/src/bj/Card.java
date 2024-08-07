package bj;

public record Card(char suit, int value) {
	public Card {
		// if (value < 1 || value > 13)
		// 	throw new InvalidCardValueException(value);
		// if (suit != 'H' && suit != 'S' && suit != 'D' && suit != 'C')
		// 	throw new InvalidCardSuitException(suit);
	}
}
