package bj;

public final class Player {
	private final int id;
	private int bank;

	public Player(int id, int bank) {
		this.id = id;
		this.bank = bank;
	}

	public int getId() { return id; }

	public int getBank() {
		return bank;
	}

	public void setBank(int bank) {
		this.bank = bank;
	}
}