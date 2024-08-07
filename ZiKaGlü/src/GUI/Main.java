package GUI;

import BlackJack.*;

public class Main {

	static Menu[] menus;
	static Menu p1;
	static Menu p2;
	static Menu p3;
	static Menu p4;
	private static Deck deck;
	private static Dealer dealer = new Dealer();
	private static boolean active = false;
	private static boolean activePlayers;
	private static boolean change = false;

	public static void main(String[] args) {
		init();
		startGame();
	}

	public static void init() {
		p1 = new Menu(1);
		p1.setVisible(true);
		p1.getBlackjack().betTime();

		p2 = new Menu(2);
		p2.setVisible(true);
		p2.getBlackjack().betTime();

		p3 = new Menu(3);
		p3.setVisible(true);
		p3.getBlackjack().betTime();

		p4 = new Menu(4);
		p4.setVisible(true);
		p4.getBlackjack().betTime();
		menus = new Menu[4];
		menus[0] = p1;
		menus[1] = p2;
		menus[2] = p3;
		menus[3] = p4;
		
		deck = new Deck();
		
	}

	public void shuffle() throws InvalidDeckPositionException, InvalidCardSuitException, InvalidCardValueException {
		deck.shuffle();
	}

	public static void getBets(int count) {
		for (int i = 0; i < 4; i++) 
			menus[i].getBlackjack().startTimer(count);
		try {
			Thread.sleep(16000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			for (int i = 0; i < 4; i++) {
				System.out.println(menus[i].getBlackjack().getAmountToBet());
				if(!menus[i].getBlackjack().getAmountToBet().isEnabled()){
					menus[i].getPlayer().setBet(Integer.parseInt(menus[i].getBlackjack().getAmountToBet().getText()));
					menus[i].getBlackjack();
				}				
		}
	}

	public static void startGame() {
		getBets(15);
		System.out.print("Wetten eingesammelt");
	}
}
