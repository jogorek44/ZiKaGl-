package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ZiKaGlü");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		lblNewLabel.setBounds(504, 6, 150, 71);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Home Menu");
		lblNewLabel_1.setBounds(547, 89, 80, 16);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setBounds(528, 200, 117, 29);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Black Jack");
		lblNewLabel_2.setBounds(554, 172, 80, 16);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Settings");
		btnNewButton_1.setBounds(528, 241, 117, 29);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Shop");
		btnNewButton_3.setBounds(206, 254, 117, 29);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Bank Account");
		btnNewButton_2.setBounds(6, 6, 188, 29);
		panel_1.add(btnNewButton_2);
	}
}
