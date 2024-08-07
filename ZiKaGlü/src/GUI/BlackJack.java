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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BlackJack {

	JFrame frame;
	private JTextField dealersCards;
	private JTextField playerCards;
	private JTextField balance;
	private JTextField amountToBet;
	private JTextField winOrLoss;
	TransparentButton shop_button;
	TransparentButton menu_button;
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
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
 
		menu_button = new TransparentButton("Menu");
		menu_button.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		menu_button.setBounds(6, 13, 117, 32);
		menu_button.setBackground(new Color(150, 150, 150, 128));
		panel.add(menu_button);

		TransparentButton hit = new TransparentButton("Hit");
		hit.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		hit.setBounds(329, 370, 130, 70);
		panel.add(hit);

		TransparentButton bet = new TransparentButton("Bet");
		bet.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		bet.setBounds(184, 477, 117, 32);
		panel.add(bet);

		TransparentButton split = new TransparentButton("Split");
		split.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		split.setBounds(619, 370, 130, 70);
		panel.add(split);

		shop_button = new TransparentButton("Shop");
		shop_button.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		shop_button.setBounds(6, 57, 117, 32);
		panel.add(shop_button);
		
<<<<<<< HEAD
		TransparentButton menuButton= new TransparentButton("Menu");
		menuButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		menuButton.setBounds(6, 13, 117, 32);
		menuButton.setBackground(new Color (150, 150, 150, 128));
		menuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				frame.dispose();
				}
		});
		panel.add(menuButton);
		
		
		TransparentButton drawACardButton = new TransparentButton("Draw a Card");
		drawACardButton.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		drawACardButton.setBounds(324, 372, 193, 70);
		panel.add(drawACardButton);
		
		
		TransparentButton betButton = new TransparentButton("Bet");
		betButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		betButton.setBounds(174, 479, 117, 32);
		panel.add(betButton);
		
		
		TransparentButton splitButton = new TransparentButton("Split");
		splitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		splitButton.setBounds(693, 372, 117, 70);
		panel.add(splitButton);
		
		
		TransparentButton testButton = new TransparentButton("Test");
		testButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Shop shop = new Shop();
	                shop.setVisible(true);
	                frame.dispose();
	            }
		});
		testButton.setText("Shop");
		testButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		testButton.setBounds(6, 57, 117, 32);
		panel.add(testButton);
		
		
=======

>>>>>>> 9e7e18a98fd803d1a66e1369d5ee81d52ab1d091
		dealersCards = new JTextField();
		dealersCards.setHorizontalAlignment(SwingConstants.CENTER);
		dealersCards.setEditable(false);
		dealersCards.setForeground(Color.WHITE);
		dealersCards.setText("<Card>");
		dealersCards.setBounds(184, 76, 130, 157);
		dealersCards.setBackground(new Color(150, 150, 150, 128));
		dealersCards.setColumns(10);
		panel.add(dealersCards);
<<<<<<< HEAD
		
		
		playerCards = new JTextField();
		playerCards.setHorizontalAlignment(SwingConstants.CENTER);
		playerCards.setEditable(false);
		playerCards.setForeground(Color.WHITE);
		playerCards.setBackground(new Color (150, 150, 150, 128));
		playerCards.setText("<Card>");
		playerCards.setBounds(680, 76, 130, 169);
		playerCards.setColumns(10);
		panel.add(playerCards);
		
		
=======

		yourCards = new JTextField();
		yourCards.setHorizontalAlignment(SwingConstants.CENTER);
		yourCards.setEditable(false);
		yourCards.setForeground(Color.WHITE);
		yourCards.setBackground(new Color(150, 150, 150, 128));
		yourCards.setText("<Karte>");
		yourCards.setBounds(680, 76, 130, 169);
		yourCards.setColumns(10);
		panel.add(yourCards);

>>>>>>> 9e7e18a98fd803d1a66e1369d5ee81d52ab1d091
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
		balance.setText("<amount>");
		balance.setEditable(false);
		balance.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		balance.setBounds(860, 43, 130, 32);
		balance.setBackground(new Color(150, 150, 150, 128));
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
		amountToBet.setBounds(313, 476, 130, 32);
		amountToBet.setBackground(new Color(150, 150, 150, 128));
		amountToBet.setColumns(10);
		panel.add(amountToBet);
<<<<<<< HEAD
		
		
		TransparentButton allInButton = new TransparentButton("All In");
		allInButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		allInButton.setBounds(174, 523, 117, 32);
		panel.add(allInButton);
		
		
		TransparentButton standButton = new TransparentButton("Stand");
		standButton.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		standButton.setBounds(192, 372, 117, 70);
		panel.add(standButton);
		
		
		TransparentButton doubleButton = new TransparentButton("Double");
		doubleButton.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		doubleButton.setBounds(529, 372, 152, 70);
		panel.add(doubleButton);
		
		
		winOrLoss = new JTextField("Play!");
=======

		TransparentButton btnNewButton_4 = new TransparentButton("All In");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_4.setBounds(184, 521, 117, 32);
		panel.add(btnNewButton_4);

		TransparentButton stand = new TransparentButton("Stand");
		stand.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		stand.setBounds(184, 370, 130, 70);
		panel.add(stand);

		TransparentButton doub = new TransparentButton("Double");
		doub.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		doub.setBounds(474, 370, 130, 70);
		panel.add(doub);

		winOrLoss = new JTextField("Loss!");
>>>>>>> 9e7e18a98fd803d1a66e1369d5ee81d52ab1d091
		winOrLoss.setFont(new Font("Lucida Grande", Font.PLAIN, 70));
		winOrLoss.setHorizontalAlignment(SwingConstants.CENTER);
		winOrLoss.setEditable(false);
		winOrLoss.setForeground(Color.BLACK);
		// winOrLoss.setOpaque(false); Später Kommentar entfernen Damit Feld nicht
		// sichtbar ist
		// winOrLoss.setBorder(null);
		winOrLoss.setBounds(358, 216, 275, 86);
		winOrLoss.setColumns(10);
		panel.add(winOrLoss);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, -14, 1024, 600);
		Image img = new ImageIcon(this.getClass().getResource("/Blackjack1.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		panel.add(lblNewLabel_3);
	}

	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}

}
