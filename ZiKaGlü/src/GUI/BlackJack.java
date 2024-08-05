package GUI;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class BlackJack {

	private JFrame frame;
	private JTextField dealersCards;
	private JTextField yourCards;
	private JTextField balance;
	private JTextField amountToBet;
	private JTextField winOrLoss;
	private Menu menu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJack window = new BlackJack();
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
	public BlackJack() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("BLACKJACK");
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu = new Menu();
		menu.setVisible(false);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		TransparentButton btnNewButton_8= new TransparentButton("Menu");
		btnNewButton_8.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_8.setBounds(6, 13, 117, 32);
		btnNewButton_8.setBackground(new Color (150, 150, 150, 128));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(true);
				menu.btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						  frame.setVisible(true);
			              frame.dispose();
					 }
				});
				menu.setVisible(true);
				frame.setVisible(false);
				}
		});
		panel.add(btnNewButton_8);
		
		
		TransparentButton btnNewButton_1 = new TransparentButton("Draw a Card");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_1.setBounds(324, 372, 193, 70);
		panel.add(btnNewButton_1);
		
		
		TransparentButton btnNewButton_2 = new TransparentButton("Bet");
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_2.setBounds(174, 479, 117, 32);
		panel.add(btnNewButton_2);
		
		
		TransparentButton btnNewButton_3 = new TransparentButton("Split");
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_3.setBounds(693, 372, 117, 70);
		panel.add(btnNewButton_3);
		
		
		TransparentButton btnNewButton_6 = new TransparentButton("Test");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Shop shop = new Shop();
	                shop.setVisible(true);
	                frame.dispose();
	            }
		});
		btnNewButton_6.setText("Shop");
		btnNewButton_6.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_6.setBounds(6, 57, 117, 32);
		panel.add(btnNewButton_6);
		
		
		dealersCards = new JTextField();
		dealersCards.setHorizontalAlignment(SwingConstants.CENTER);
		dealersCards.setEditable(false);
		dealersCards.setForeground(Color.WHITE);
		dealersCards.setText("<Karte>");
		dealersCards.setBounds(184, 76, 130, 157);
		dealersCards.setBackground(new Color (150, 150, 150, 128));
		dealersCards.setColumns(10);
		panel.add(dealersCards);
		
		
		yourCards = new JTextField();
		yourCards.setHorizontalAlignment(SwingConstants.CENTER);
		yourCards.setEditable(false);
		yourCards.setForeground(Color.WHITE);
		yourCards.setBackground(new Color (150, 150, 150, 128));
		yourCards.setText("<Karte>");
		yourCards.setBounds(680, 76, 130, 169);
		yourCards.setColumns(10);
		panel.add(yourCards);
		
		
		JLabel lblNewLabel = new JLabel("Dealer's Cards");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(174, 32, 213, 49);
		panel.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Your Cards");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(660, 32, 165, 49);
		panel.add(lblNewLabel_1);
		
		
		balance = new JTextField();
		balance.setForeground(Color.WHITE);
		balance.setText("<Zahl>");
		balance.setEditable(false);
		balance.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		balance.setBounds(860, 43, 130, 32);
		balance.setBackground(new Color (150, 150, 150, 128));
		balance.setColumns(10);
		panel.add(balance);
		
		
		JLabel lblNewLabel_2 = new JLabel("Balance");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(845, 7, 130, 38);
		panel.add(lblNewLabel_2);
		
		
		amountToBet = new JTextField();
		amountToBet.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		amountToBet.setForeground(Color.WHITE);
		amountToBet.setBounds(303, 478, 130, 32);
		amountToBet.setBackground(new Color (150, 150, 150, 128));
		amountToBet.setColumns(10);
		panel.add(amountToBet);
		
		
		TransparentButton btnNewButton_4 = new TransparentButton("All In");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_4.setBounds(174, 523, 117, 32);
		panel.add(btnNewButton_4);
		
		
		TransparentButton btnNewButton_5 = new TransparentButton("Stand");
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_5.setBounds(192, 372, 117, 70);
		panel.add(btnNewButton_5);
		
		
		TransparentButton btnNewButton_7 = new TransparentButton("Double");
		btnNewButton_7.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_7.setBounds(529, 372, 152, 70);
		panel.add(btnNewButton_7);
		
		
		winOrLoss = new JTextField("Loss!");
		winOrLoss.setFont(new Font("Lucida Grande", Font.PLAIN, 70));
		winOrLoss.setHorizontalAlignment(SwingConstants.CENTER);
		winOrLoss.setEditable(false);
		winOrLoss.setForeground(Color.BLACK);
		//winOrLoss.setOpaque(false);   Später Kommentar entfernen Damit Feld nicht sichtbar ist
		//winOrLoss.setBorder(null);
		winOrLoss.setBounds(358, 216, 275, 86);
		winOrLoss.setColumns(10);
		panel.add(winOrLoss);
		
		
		JLabel lblNewLabel_3= new JLabel("");
		lblNewLabel_3.setBounds(0, -14, 1024, 600);		
		Image img = new ImageIcon(this.getClass().getResource("/Blackjack1.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		panel.add(lblNewLabel_3);
	}

	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}

}
