package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Settings {

	JFrame frame;
	TransparentButton menu_button;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings window = new Settings();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Settings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		menu_button = new TransparentButton("Menu");
		
		menu_button.setBounds(6, 6, 117, 29);
		panel.add(menu_button);

		TransparentButton btnNewButton_1 = new TransparentButton("Accessebility Mode");
		btnNewButton_1.setBounds(418, 39, 187, 29);
		panel.add(btnNewButton_1);

		JTextPane txtpnHierStehtDie = new JTextPane();
		txtpnHierStehtDie.setEditable(false);
		txtpnHierStehtDie.setBackground(new Color(150, 150, 150, 128));
		txtpnHierStehtDie.setText(
				"Blackjack Rules\n\nObjective:\nAchieve a hand value closer to 21 than the dealer without exceeding 21.\n\nGameplay:\n\n\t1.\tBet:\n\t\t• Place a wager before the cards are dealt.\n\t2.\tDealing:\n\t\t• Each player and the dealer receive two cards. One of the dealer’s cards is face down.\n\t3.\tPlayer Options:\n\t\t• Draw a Card: Take additional cards to increase the value of your hand.\n\t\t• Stand: End your turn and keep your current hand.\n\t\t• Double: Double your bet and receive one additional card.\n\t  \t• Split: If you have two cards of the same value, split them into two separate hands and \t\t                     play each hand individually.\n\t\t• All In: Wager all your chips on one hand.\n\t4.\tDealer’s Play:\n\t\t• The dealer reveals their face-down card and draws until they reach at least 17 points.");
		txtpnHierStehtDie.setBounds(120, 80, 783, 443);
		panel.add(txtpnHierStehtDie);
	}

	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}

}
