package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

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
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.setBounds(6, 6, 117, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Draw a Card");
		btnNewButton_1.setBounds(47, 158, 117, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Bet");
		btnNewButton_2.setBounds(174, 380, 117, 29);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Split");
		btnNewButton_3.setBounds(174, 199, 117, 29);
		panel.add(btnNewButton_3);
		
		dealersCards = new JTextField();
		dealersCards.setBounds(47, 70, 130, 26);
		panel.add(dealersCards);
		dealersCards.setColumns(10);
		
		yourCards = new JTextField();
		yourCards.setBounds(238, 70, 130, 26);
		panel.add(yourCards);
		yourCards.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dealer's Cards");
		lblNewLabel.setBounds(47, 54, 117, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your Cards");
		lblNewLabel_1.setBounds(238, 54, 96, 16);
		panel.add(lblNewLabel_1);
		
		balance = new JTextField();
		balance.setBounds(294, 462, 130, 26);
		panel.add(balance);
		balance.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Balance");
		lblNewLabel_2.setBounds(307, 447, 61, 16);
		panel.add(lblNewLabel_2);
		
		amountToBet = new JTextField();
		amountToBet.setBounds(165, 240, 130, 26);
		panel.add(amountToBet);
		amountToBet.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("All In");
		btnNewButton_4.setBounds(165, 434, 117, 29);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Stand");
		btnNewButton_5.setBounds(293, 158, 117, 29);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Double");
		btnNewButton_6.setBounds(165, 158, 117, 29);
		panel.add(btnNewButton_6);
		
		winOrLoss = new JTextField();
		winOrLoss.setBounds(152, 108, 130, 26);
		panel.add(winOrLoss);
		winOrLoss.setColumns(10);
	}

}
