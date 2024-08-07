package GUI;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

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
		getBets(15);
		System.out.print("Wetten eingesammelt");
	}

	public static void init() {
		p1 = new Menu(1);
		p1.setVisible(true);
		System.out.print("p1 ");

		p2 = new Menu(2);
		p2.setVisible(true);
		System.out.print("p2 ");

		p3 = new Menu(3);
		p3.setVisible(true);
		System.out.print("p3 ");

		p4 = new Menu(4);
		p4.setVisible(true);
		System.out.print("p4 ");
		
		deck = new Deck();
		menus = new Menu[4];
		menus[0] = p1;
		menus[1] = p2;
		menus[2] = p3;
		menus[3] = p4;
	}

	public void shuffle() throws InvalidDeckPositionException, InvalidCardSuitException, InvalidCardValueException {
		deck.shuffle();
	}

	public static void getBets(int count) {
		for (int i = 0; i < 4; i++) {
			menus[i].getBlackjack().startTimer(count);
		}
		while (!menus[0].getBlackjack().isTimerFinished())
			;
		if (menus[0].getBlackjack().isTimerFinished()) {
			for (int i = 0; i < 4; i++) {
				menus[i].getPlayer().setBet(Double.valueOf(menus[i].getBlackjack().getAmountToBet()));
			}
		}
	}

	public static void startGame() {
		System.out.print("Schleife beendet");
		getBets(15);
		System.out.print("Wetten eingesammelt");
	}
}
