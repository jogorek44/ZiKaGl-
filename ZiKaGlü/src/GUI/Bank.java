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

public class Bank {

	private JFrame frame;
	static Label balanceLabel;
	private JTextField balanceField;
	private static double balance = 0.0;
    private static final String BALANCE_FILE = "balance.txt";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Kontostand aus Datei laden
        loadBalanceFromFile();
        
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

    // Methode zum Laden des Kontostands aus Datei
	private static void loadBalanceFromFile() {
		try (BufferedReader reader = new BufferedReader(new FileReader(BALANCE_FILE))) {
            String line = reader.readLine();
            if (line != null) {
                balance = Double.parseDouble(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Balance file not found, starting with balance 0.0");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading balance file, starting with balance 0.0");
        }		
	}
	
	// Methode zum Speichern des Kontostands in Datei
    private static void saveBalanceToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BALANCE_FILE))) {
            writer.write(String.format("%.2f", balance));
        } catch (IOException e) {
            System.out.println("Error saving balance to file");
        }
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
					double amount = Double.parseDouble(balanceField.getText());
                    balance += amount;
                    balanceLabel.setText(String.format("%.2f", balance));
                    balanceField.setText("");
                    saveBalanceToFile();
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Please enter a valid amount", "Error", JOptionPane.ERROR_MESSAGE);				}
			}
		});
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
