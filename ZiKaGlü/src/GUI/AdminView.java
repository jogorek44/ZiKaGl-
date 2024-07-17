package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdminView {

	private JFrame frame;
	private JTextField txtTable;
	private JTextField txtTable_1;
	private JTextField txtTable_2;
	private JTextField txtTable_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.setBounds(6, 6, 117, 29);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Orders");
		lblNewLabel.setBounds(6, 47, 61, 16);
		panel.add(lblNewLabel);
		
		txtTable = new JTextField();
		txtTable.setBounds(6, 91, 130, 26);
		panel.add(txtTable);
		txtTable.setColumns(10);
		
		txtTable_1 = new JTextField();
		txtTable_1.setBounds(148, 91, 130, 26);
		panel.add(txtTable_1);
		txtTable_1.setColumns(10);
		
		txtTable_2 = new JTextField();
		txtTable_2.setBounds(6, 146, 130, 26);
		panel.add(txtTable_2);
		txtTable_2.setColumns(10);
		
		txtTable_3 = new JTextField();
		txtTable_3.setBounds(148, 146, 130, 26);
		panel.add(txtTable_3);
		txtTable_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Table 1");
		lblNewLabel_1.setBounds(6, 75, 61, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Table 2");
		lblNewLabel_2.setBounds(148, 75, 61, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Table 3");
		lblNewLabel_3.setBounds(6, 129, 61, 16);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Table 4");
		lblNewLabel_4.setBounds(148, 129, 61, 16);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Table 1");
		lblNewLabel_1_1.setBounds(311, 75, 61, 16);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setBounds(311, 47, 61, 16);
		panel.add(lblBalance);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(311, 91, 130, 26);
		panel.add(textField);
		
		JLabel lblNewLabel_3_1 = new JLabel("Table 3");
		lblNewLabel_3_1.setBounds(311, 129, 61, 16);
		panel.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(311, 146, 130, 26);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(453, 146, 130, 26);
		panel.add(textField_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Table 4");
		lblNewLabel_4_1.setBounds(453, 129, 61, 16);
		panel.add(lblNewLabel_4_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(453, 91, 130, 26);
		panel.add(textField_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Table 2");
		lblNewLabel_2_1.setBounds(453, 75, 61, 16);
		panel.add(lblNewLabel_2_1);
	}

}
