package GUI;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

public class Bank {

	private JFrame frame;
	static JTextField Kontostand;
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
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Balance");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		lblNewLabel.setBackground(SystemColor.text);
		lblNewLabel.setBounds(42, 247, 155, 64);
		panel.add(lblNewLabel);
		
		
		Kontostand = new JTextField();
		Kontostand.setForeground(Color.BLACK);
		Kontostand.setEditable(false);
		Kontostand.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		Kontostand.setBackground(new Color (150, 150, 150, 128));
		Kontostand.setText("0");
		Kontostand.setBounds(224, 247, 160, 64);
		Kontostand.setColumns(10);
		panel.add(Kontostand);
		
		
		Einzahlbetrag = new JTextField();
		Einzahlbetrag.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		Einzahlbetrag.setText("0");
		Einzahlbetrag.setBounds(648, 244, 155, 64);
		Einzahlbetrag.setBackground(new Color (150, 150, 150, 128));
		Einzahlbetrag.setColumns(10);
		panel.add(Einzahlbetrag);
		
		
		TransparentButton btnNewButton = new TransparentButton("Deposit");
		btnNewButton.setBounds(519, 247, 117, 64);
		panel.add(btnNewButton);
		
		
		TransparentButton btnNewButton_8 = new TransparentButton("Menu");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				frame.dispose();
				}
		});
		btnNewButton_8.setBounds(6, 6, 117, 29);
		panel.add(btnNewButton_8);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, -14, 1024, 600);		
		Image img = new ImageIcon(this.getClass().getResource("/Bank.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		panel.add(lblNewLabel_1);
	}
	public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}
