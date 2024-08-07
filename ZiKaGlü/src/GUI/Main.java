package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {
	
	static Menu p1;
	static Menu p2;
	static Menu p3;
	static Menu p4;
	
	public static void main(String[] args) {
		init();
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
	}

	/*public static void setPos(Menu temp, int pos) {
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
	}*/
}
