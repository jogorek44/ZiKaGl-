package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Shop {

	private JFrame frame;
	private JTextField txtShoppingCart;
	private JTextField txtSum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shop window = new Shop();
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
	public Shop() {
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				}
		});
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Beer");
		lblNewLabel.setBounds(39, 68, 61, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cigaretts");
		lblNewLabel_1.setBounds(138, 68, 61, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Coffee");
		lblNewLabel_2.setBounds(303, 68, 61, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("$3");
		lblNewLabel_3.setBounds(27, 96, 61, 16);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("$8");
		lblNewLabel_4.setBounds(138, 96, 61, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("$2.5");
		lblNewLabel_5.setBounds(303, 96, 61, 16);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setBounds(6, 124, 117, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Add");
		btnNewButton_1_1.setBounds(130, 124, 117, 29);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Add");
		btnNewButton_1_2.setBounds(279, 124, 117, 29);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_2 = new JButton("Checkout");
		btnNewButton_2.setBounds(315, 226, 117, 29);
		panel.add(btnNewButton_2);
		
		txtShoppingCart = new JTextField();
		txtShoppingCart.setText("Shopping Cart");
		txtShoppingCart.setBounds(24, 226, 130, 26);
		panel.add(txtShoppingCart);
		txtShoppingCart.setColumns(10);
		
		txtSum = new JTextField();
		txtSum.setText("Sum");
		txtSum.setBounds(166, 226, 130, 26);
		panel.add(txtSum);
		txtSum.setColumns(10);
	}
	public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
	
}
