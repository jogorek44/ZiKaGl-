package GUI;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;



import javax.swing.ImageIcon;
import javax.swing.*;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import Logic.FileHandler;

public class Bank {

	public JFrame frame;
	static Label balanceLabel;
	private JTextField balanceField;
	public static double balance = 0.0;
    public static final String BALANCE_FILE = "balance.txt";
    private FileHandler balanceFileHandler;
    public TransparentButton menu_button;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Kontostand aus Datei laden
        FileHandler.loadBalanceFromFile();
        
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
		this.balanceFileHandler = new FileHandler();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Bank Account");
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//Kontostandanzeige
		balanceLabel = new Label("Balance");
		balanceLabel.setForeground(Color.BLACK);
		balanceLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		balanceLabel.setBackground(new Color (150, 150, 150, 128));
		balanceLabel.setText(String.format("%.2f", balance));
		balanceLabel.setBounds(224, 247, 160, 64);
		
		panel.add(balanceLabel);
		
		//"Balance"-Schriftzug
		JLabel lblNewLabel = new JLabel("Balance");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		lblNewLabel.setBackground(SystemColor.text);
		lblNewLabel.setBounds(42, 247, 155, 64);
		panel.add(lblNewLabel);
		
		//Eingabe des Amounts
		balanceField = new JTextField();
		balanceField.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		balanceField.setText("");
		balanceField.setBounds(648, 244, 155, 64);
		balanceField.setBackground(new Color (150, 150, 150, 128));
		balanceField.setColumns(10);
		panel.add(balanceField);
		
		//Deposit-button
		TransparentButton btnNewButton = new TransparentButton("Deposit");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					
					//balanceLabel.setText(String.valueOf(Double.valueOf(balanceLabel.getText())+Double.valueOf(balanceField.getText())));
					//balanceField.setText("");
					 String amountText = balanceField.getText();

					    // Überprüfen, ob mehr als zwei Nachkommastellen vorhanden sind
					    if (amountText.contains(".") && amountText.split("\\.")[1].length() > 2) {
					        JOptionPane.showMessageDialog(frame, "Please enter a valid amount with two decimal places.", "Error", JOptionPane.ERROR_MESSAGE);
					        return;
					    }
					
					double amount = Double.parseDouble(balanceField.getText());
					 if (amount < 0) {
	                        JOptionPane.showMessageDialog(frame, "Deposit amount cannot be negative.", "Error", JOptionPane.ERROR_MESSAGE);
	                        return; 
	                    }
					 
                    balance += amount;
                    balanceLabel.setText(String.format("%.2f", balance));
                    balanceField.setText("");
                    FileHandler.saveBalanceToFile();
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Please enter a valid amount", "Error", JOptionPane.ERROR_MESSAGE);				}
			}
		});
		btnNewButton.setBounds(519, 247, 117, 64);
		panel.add(btnNewButton);
		
		
		menu_button = new TransparentButton("Menu");
		menu_button.setBounds(6, 6, 117, 29);
		panel.add(menu_button);
		
		
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
