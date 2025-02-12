package GUI;

import bj.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Main {

	static Menu[] menus;
	static Menu p1;
	static Menu p2;
	static Menu p3;
	static Menu p4;
	static AdminView a;
	private static boolean[] activePlayers;

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
	}


	public static void getBets(int count) {
		for (int i = 0; i < 4; i++) {
			menus[i].getBlackjack().betTime();
			menus[i].getBlackjack().startTimer(count);
		}
		sleepymeepy(count);
		for (int i = 0; i < 4; i++) {
			//System.out.println(menus[i].getBlackjack().getAmountToBet());
			if(!menus[i].getBlackjack().getAmountToBet().isEnabled()){
				menus[i].setBet(Integer.parseInt(menus[i].getBlackjack().getAmountToBet().getText()));
			}		
			else menus[i].getBlackjack().afk();
		}
	}

	
	public static void sleepymeepy(int a){
		try {
			Thread.sleep(a*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void startGame() {
		getBets(10);
		var p = Arrays.stream(menus).filter(m->!m.getBlackjack().isAfk()).map(Menu::getPlayer).toArray(Player[]::new);
		var g = new BlackjackGame(p, 10);
		for(var pl : p){
			g.bet(pl.getId(), menus[pl.getId()-1].getBet());
		}
		g.startSplitting();
		for(var pl : p)
			g.setDoneSplitting(pl.getId());
		g.startHitting();
		for(var pl : p){
			menus[pl.getId()-1].getBlackjack().roundstart(g, pl);
		}
		while(!g.isEveryoneDoneHitting());
		for(var pl : g.endGame()){
			menus[pl.getId()-1].getPlayer().setBank(pl.getBank());
		}
		for(int i = 0; i <4; i++){menus[i].getBlackjack().getBalance().setText(String.valueOf(menus[i].getPlayer().getBank()));
			menus[i].getBlackjack().dealersCards.setText(BlackJack.cardsString(g.getDealerCards()));
		}
		startGame();
	}
}
