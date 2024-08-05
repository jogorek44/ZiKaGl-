package Exceptions;


public class InvalidDeckPosException extends Exception {

	private int posIdentifier = 0;

	public InvalidDeckPosException(int inValidPosition) {
		posIdentifier = inValidPosition;
		System.out.println("Invalid Position is" + inValidPosition);
	}

	public int getPosVal() {
		return posIdentifier;
	}
}