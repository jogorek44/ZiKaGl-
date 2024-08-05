package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {

	public static void main(String[] args) {
		init();
	}
	public static void init() {
		Menu p1 = new Menu();
		p1.setVisible(true);
		System.out.print("p1 ");
		setPos(p1, 1);
		Menu p2 = new Menu();
		p2.setVisible(true);
		System.out.print("p2 ");
		setPos(p2, 2);
		Menu p3 = new Menu();
		p3.setVisible(true);
		System.out.print("p3 ");
		setPos(p3, 3);
		Menu p4 = new Menu();
		p4.setVisible(true);
		System.out.print("p4 ");
		setPos(p4, 4);
	}

	public static void setPos(Menu temp, int pos) {
		switch (pos) {
		case 1:
			temp.frame.setLocation(0, 0);
		case 2:
			temp.frame.setLocation(1620, 0);
		case 3:
			temp.frame.setLocation(0, 880);
		case 4:
			temp.frame.setLocation(1620, 880);
		}
	}
}
