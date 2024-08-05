package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;
	public TransparentButton btnNewButton_2;
	public TransparentButton btnNewButton;
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
		frame = new JFrame("MENU");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		
			TransparentButton btnNewButton_3 = new TransparentButton("Shop");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Shop shop = new Shop();
	                shop.setVisible(true); //erstellt ein neues Fenster
	                frame.dispose();//schließt das aktuelle Fenster
	            }
			});
		btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 30));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBounds(453, 362, 117, 54);
		panel_1.add(btnNewButton_3);
		
		
		btnNewButton = new TransparentButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  BlackJack blackjack = new BlackJack();
	                blackjack.setVisible(true);
	                frame.dispose();
	            }
			});
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 30));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(453, 202, 117, 54);
		panel_1.add(btnNewButton);
		
		
		btnNewButton_2 = new TransparentButton("Bank Account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Bank bank = new Bank();
	                bank.setVisible(true);
	                frame.dispose();
	            }
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBounds(6, 6, 223, 43);
		panel_1.add(btnNewButton_2);
		
		
		TransparentButton btnNewButton_1 = new TransparentButton("Settings");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Settings settings = new Settings();
	                settings.setVisible(true);
	                frame.dispose();
	            }
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(427, 268, 170, 82);
		btnNewButton_1.setBackground(new Color(0,0,0,128));
		panel_1.add(btnNewButton_1);
		
		
		JLabel lblNewLabel = new JLabel("ZiKaGlü");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 66));
		lblNewLabel.setBounds(362, 6, 300, 71);
		lblNewLabel.setBackground(new Color (0, 0, 0, 128));
		lblNewLabel.setOpaque(true);
		panel_1.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Home Menu");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblNewLabel_1.setForeground(Color.black);
		lblNewLabel_1.setBackground(new Color (255, 255, 255, 128));
		lblNewLabel_1.setOpaque(true); //damit der Hintergrund nicht durchsichtig ist
		lblNewLabel_1.setBounds(418, 103, 188, 43);
		panel_1.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Black Jack");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0,0,0));
		lblNewLabel_2.setBackground(new Color (255, 255, 255, 128));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(432, 158, 159, 32);
		panel_1.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, -14, 1024, 600);
		lblNewLabel_3.setOpaque(false);
		Image img = new ImageIcon(this.getClass().getResource("/ZiKaGlü.jpg")).getImage();
	    lblNewLabel_3.setIcon(new ImageIcon(img));
		panel_1.add(lblNewLabel_3);
		
	    
	}
	public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}
