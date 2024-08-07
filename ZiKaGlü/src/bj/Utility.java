package bj;

import java.util.Arrays;
import java.util.stream.IntStream;

public final class Utility {
	private Utility() {
	}

	public static String getSuitName(char suit) {
		return switch (suit) {
			case 'H' -> "Hearts";
			case 'S' -> "Spades";
			case 'C' -> "Clubs";
			case 'D' -> "Diamonds";
			default -> "<unknown>";
		};
	}

	public static String getValueName(int value) {
		var names = new String[]{
				"<unknown>",
				"Ace",
				"Two",
				"Three",
				"Four",
				"Five",
				"Six",
				"Seven",
				"Eight",
				"Nine",
				"Ten",
				"Jack",
				"Queen",
				"King",
		};
		return names[value];
	}

	public static int getSum(IntStream values) {
		var vals = values.sorted().boxed().toList();
		int nAces = 0;
		while (nAces < vals.size() && vals.get(nAces) == 1)
			++nAces;
		var sum = 11 * nAces + vals.stream().mapToInt(x -> x).sum();
		for (int i = 0; sum > 21 && i < nAces; i++)
			sum -= 10;
		return sum;
	}

	public static boolean contains(int[] arr, int val) {
		return Arrays.stream(arr).anyMatch(x -> x == val);
	}
}
