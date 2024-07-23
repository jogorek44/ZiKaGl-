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
import java.awt.Color;
import java.awt.Font;

public class AdminView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView window = new AdminView();
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
	public AdminView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("ADMINVIEW");
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.setBounds(6, 6, 117, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				frame.dispose();
				}
		});
		panel.add(btnNewButton);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Table 1");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(549, 188, 117, 29);
		panel.add(lblNewLabel_1_1);
		
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblBalance.setBounds(549, 146, 130, 43);
		panel.add(lblBalance);
		
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(549, 230, 218, 94);
		panel.add(textField);
		
		
		JLabel lblNewLabel_3_1 = new JLabel("Table 3");
		lblNewLabel_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_3_1.setBounds(549, 347, 135, 43);
		panel.add(lblNewLabel_3_1);
		
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(550, 397, 218, 94);
		panel.add(textField_1);
		
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(789, 396, 218, 94);
		panel.add(textField_2);
		
		
		JLabel lblNewLabel_4_1 = new JLabel("Table 4");
		lblNewLabel_4_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_4_1.setBounds(789, 353, 135, 31);
		panel.add(lblNewLabel_4_1);
		
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(789, 230, 218, 94);
		panel.add(textField_3);
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Table 2");
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(789, 187, 156, 31);
		panel.add(lblNewLabel_2_1);
		
		
		JLabel lblOrder = new JLabel("Order");
		lblOrder.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblOrder.setBounds(18, 146, 130, 43);
		panel.add(lblOrder);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Table 1");
		lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(18, 188, 117, 29);
		panel.add(lblNewLabel_1_1_1);
		
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(18, 230, 218, 94);
		panel.add(textField_4);
		
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Table 3");
		lblNewLabel_3_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_3_1_1.setBounds(18, 347, 135, 43);
		panel.add(lblNewLabel_3_1_1);
		
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(19, 397, 218, 94);
		panel.add(textField_5);
		
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(258, 396, 218, 94);
		panel.add(textField_6);
		
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Table 4");
		lblNewLabel_4_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_4_1_1.setBounds(258, 353, 135, 31);
		panel.add(lblNewLabel_4_1_1);
		
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(258, 230, 218, 94);
		panel.add(textField_7);
		
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Table 2");
		lblNewLabel_2_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(258, 187, 156, 31);
		panel.add(lblNewLabel_2_1_1);
	}
	public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
	
}
