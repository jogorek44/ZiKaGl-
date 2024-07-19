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
import javax.swing.JButton;
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
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		TransparentButton btnNewButton_8= new TransparentButton("Menu");
		btnNewButton_8.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_8.setBounds(6, 13, 117, 32);
		btnNewButton_8.setBackground(new Color (150, 150, 150, 128));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				}
		});
		panel.add(btnNewButton_8);
		
		TransparentButton btnNewButton_1 = new TransparentButton("Draw a Card");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_1.setBounds(327, 245, 193, 70);
		panel.add(btnNewButton_1);
		
		TransparentButton btnNewButton_2 = new TransparentButton("Bet");
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_2.setBounds(174, 380, 117, 32);
		panel.add(btnNewButton_2);
		
		TransparentButton btnNewButton_3 = new TransparentButton("Split");
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_3.setBounds(732, 160, 117, 70);
		panel.add(btnNewButton_3);
		
		TransparentButton btnNewButton_6 = new TransparentButton("Test");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Shop shop = new Shop();
	                shop.setVisible(true);
	            }
		});
		btnNewButton_6.setText("Shop");
		btnNewButton_6.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_6.setBounds(6, 57, 117, 32);
		panel.add(btnNewButton_6);
		
		dealersCards = new JTextField();
		dealersCards.setEditable(false);
		dealersCards.setForeground(Color.WHITE);
		dealersCards.setText("<Karte>");
		dealersCards.setBounds(228, 70, 130, 26);
		dealersCards.setBackground(new Color (150, 150, 150, 128));
		panel.add(dealersCards);
		dealersCards.setColumns(10);
		
		yourCards = new JTextField();
		yourCards.setEditable(false);
		yourCards.setForeground(Color.WHITE);
		yourCards.setBackground(new Color (150, 150, 150, 128));
		yourCards.setText("<Karte>");
		yourCards.setBounds(585, 70, 130, 26);
		panel.add(yourCards);
		yourCards.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dealer's Cards");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(228, 54, 117, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your Cards");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(585, 54, 96, 16);
		panel.add(lblNewLabel_1);
		
		balance = new JTextField();
		balance.setForeground(Color.WHITE);
		balance.setText("<Zahl>");
		balance.setEditable(false);
		balance.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		balance.setBounds(875, 49, 130, 32);
		balance.setBackground(new Color (150, 150, 150, 128));
		panel.add(balance);
		balance.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Balance");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		lblNewLabel_2.setBounds(822, 2, 183, 38);
		panel.add(lblNewLabel_2);
		
		amountToBet = new JTextField();
		amountToBet.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		amountToBet.setForeground(Color.WHITE);
		amountToBet.setBounds(303, 380, 130, 32);
		amountToBet.setBackground(new Color (150, 150, 150, 128));
		panel.add(amountToBet);
		amountToBet.setColumns(10);
		
		TransparentButton btnNewButton_4 = new TransparentButton("All In");
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_4.setBounds(174, 433, 117, 32);
		panel.add(btnNewButton_4);
		
		TransparentButton btnNewButton_5 = new TransparentButton("Stand");
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_5.setBounds(195, 245, 117, 70);
		panel.add(btnNewButton_5);
		
		TransparentButton btnNewButton_7 = new TransparentButton("Double");
		btnNewButton_7.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_7.setBounds(532, 245, 152, 70);
		panel.add(btnNewButton_7);
		
		winOrLoss = new JTextField("Loss!");
		winOrLoss.setFont(new Font("Lucida Grande", Font.PLAIN, 70));
		winOrLoss.setHorizontalAlignment(SwingConstants.CENTER);
		winOrLoss.setEditable(false);
		winOrLoss.setForeground(Color.BLACK);
		
		//winOrLoss.setOpaque(false);   Später Kommentar entfernen Damit Feld nicht sichtbar ist
		//winOrLoss.setBorder(null);
		winOrLoss.setBounds(359, 147, 275, 86);
		panel.add(winOrLoss);
		winOrLoss.setColumns(10);
		
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
