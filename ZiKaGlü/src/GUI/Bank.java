package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Bank {

	private JFrame frame;
	private JTextField Kontostand;
	private JTextField Einzahlbetrag;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bank window = new Bank();
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
	public Bank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Balance");
		lblNewLabel.setBounds(159, 37, 96, 16);
		panel.add(lblNewLabel);
		
		Kontostand = new JTextField();
		Kontostand.setBounds(149, 65, 130, 26);
		panel.add(Kontostand);
		Kontostand.setColumns(10);
		
		JButton btnNewButton = new JButton("Deposit");
		btnNewButton.setBounds(306, 32, 117, 29);
		panel.add(btnNewButton);
		
		Einzahlbetrag = new JTextField();
		Einzahlbetrag.setBounds(293, 65, 130, 26);
		panel.add(Einzahlbetrag);
		Einzahlbetrag.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Menu");
		btnNewButton_1.setBounds(6, 6, 117, 29);
		panel.add(btnNewButton_1);
	}

}
