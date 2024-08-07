package GUI;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
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
	private JTextField yourCards;
	private JTextField balance;
	private JTextField amountToBet;
	private JTextField winOrLoss;
	TransparentButton shop_button;
	TransparentButton menu_button;
	private JLabel timer;
	private boolean isTimerFinished;

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

		timer = new JLabel("");
		timer.setVisible(false);
		timer.setHorizontalAlignment(SwingConstants.CENTER);
		timer.setFont(new Font("Tahoma", Font.BOLD, 80));
		timer.setBounds(434, 216, 117, 70);
		panel.add(timer);

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

		dealersCards = new JTextField();
		dealersCards.setHorizontalAlignment(SwingConstants.CENTER);
		dealersCards.setEditable(false);
		dealersCards.setForeground(Color.WHITE);
		dealersCards.setText("<Karte>");
		dealersCards.setBounds(184, 76, 130, 157);
		dealersCards.setBackground(new Color(150, 150, 150, 128));
		dealersCards.setColumns(10);
		panel.add(dealersCards);

		yourCards = new JTextField();
		yourCards.setHorizontalAlignment(SwingConstants.CENTER);
		yourCards.setEditable(false);
		yourCards.setForeground(Color.WHITE);
		yourCards.setBackground(new Color(150, 150, 150, 128));
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

	public void startTimer(int time) {
		setTimerFinished(false);
		timer.setVisible(true);
		Timer countdownTimer = new Timer(1000, new ActionListener() {
			int count = time;

			@Override
			public void actionPerformed(ActionEvent e) {
				if (count > 0) {
					timer.setText(String.valueOf(count));
					System.out.print(count);
					count--;
				} else {
					((Timer) e.getSource()).stop();
					timer.setVisible(false);
					setTimerFinished(true);
				}
			}
		});

		countdownTimer.start();
	}
	/*
	 * public void startTimer(int time) { while (time != 1) { if (frame.isVisible())
	 * timer.setVisible(true); else timer.setVisible(false);
	 * timer.setText(String.valueOf(time--)); System.out.print(time); try {
	 * Thread.sleep(1000); } catch (InterruptedException e) {
	 * Thread.currentThread().interrupt(); } } timer.setVisible(false); }
	 */

	public boolean isTimerFinished() {
		return isTimerFinished;
	}

	public void setTimerFinished(boolean isTimerFinished) {
		this.isTimerFinished = isTimerFinished;
	}
	

	public JTextField getBalance() {
		return balance;
	}

	public void setBalance(JTextField balance) {
		this.balance = balance;
	}

	public String getAmountToBet() {
		return amountToBet.getText();
	}

	public void String(String amountToBet) {
		this.amountToBet.setText(amountToBet);
	}

}
