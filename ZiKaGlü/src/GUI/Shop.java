package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Shop   {

	private JFrame frame;
	private JTextField txtShoppingCart;
	private JTextField txtSum;
	private int beerQuantity=0;
	private int coffeeQuantity=0;
	private int cigarettesQuantity = 0;
	public double price=0;
	public String menge;
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
		
		
		TransparentButton btnNewButton = new TransparentButton("Menu");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton.setBounds(6, 6, 137, 32);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				frame.dispose();
				}
		});
		panel.add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("Beer");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color (0, 0, 0, 128)); 
		lblNewLabel.setOpaque(true); //macht den Hintergrund sichtbar
		lblNewLabel.setBounds(458, 313, 61, 16);
		panel.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("Cigaretts");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(new Color (0, 0, 0, 128));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(259, 313, 61, 16);
		panel.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Coffee");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(new Color (0, 0, 0, 128));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(752, 313, 61, 16);
		panel.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("$3");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBackground(new Color (0, 0, 0, 128));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBounds(458, 341, 61, 16);
		panel.add(lblNewLabel_3);
		
		
		JLabel lblNewLabel_4 = new JLabel("$8");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(new Color (0, 0, 0, 128));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBounds(259, 341, 61, 16);
		panel.add(lblNewLabel_4);
		
		
		JLabel lblNewLabel_5 = new JLabel("$2.5");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBackground(new Color (0, 0, 0, 128));
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBounds(752, 341, 61, 16);
		panel.add(lblNewLabel_5);
		
		
		TransparentButton btnNewButton_1 = new TransparentButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beerQuantity++;
				price=beerQuantity*3+(coffeeQuantity*2.5)+(8*cigarettesQuantity);
				String stringZahl = Double.toString(price);
				txtSum.setText("$"+stringZahl);
				menge= beerQuantity+"x Beer, "+coffeeQuantity+"x Coffee and "+cigarettesQuantity+"x Cigarettes";
				txtShoppingCart.setText(menge);
			}
		});
		btnNewButton_1.setBounds(434, 369, 117, 32);
		panel.add(btnNewButton_1);
		
		
		TransparentButton btnNewButton_2= new TransparentButton("Add");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cigarettesQuantity++;
				price=beerQuantity*3+(coffeeQuantity*2.5)+(8*cigarettesQuantity);
				String stringZahl = Double.toString(price);
				txtSum.setText("$"+stringZahl);
				menge= beerQuantity+"x Beer, "+coffeeQuantity+"x Coffee and "+cigarettesQuantity+"x Cigarettes";
				txtShoppingCart.setText(menge);
			}
		});
		btnNewButton_2.setBounds(229, 369, 117, 32);
		panel.add(btnNewButton_2);
		
		
		TransparentButton btnNewButton_3 = new TransparentButton("Add");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffeeQuantity++;
				price=beerQuantity*3+(coffeeQuantity*2.5)+(8*cigarettesQuantity);
				String stringZahl = Double.toString(price);
				txtSum.setText("$"+stringZahl);
				menge= beerQuantity+"x Beer, "+coffeeQuantity+"x Coffee and "+cigarettesQuantity+"x Cigarettes";
				txtShoppingCart.setText(menge);
			}
		});
		btnNewButton_3.setBounds(728, 369, 117, 32);
		panel.add(btnNewButton_3);
		
		
		TransparentButton btnNewButton_4 = new TransparentButton("Checkout");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Deine Bestellung von "+menge+" für $"+price+" wird vorbereitet!");
			}
		});
		btnNewButton_4.setBounds(853, 498, 117, 32);
		panel.add(btnNewButton_4);
		
		
		TransparentButton btnNewButton_5 = new TransparentButton("BlackJack");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  BlackJack blackjack = new BlackJack();
	                blackjack.setVisible(true);
	                frame.dispose();
	            }
		});
		btnNewButton_5.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBounds(6, 50, 145, 32);
		panel.add(btnNewButton_5);
		
		
		txtShoppingCart = new JTextField();
		txtShoppingCart.setForeground(Color.WHITE);
		txtShoppingCart.setText("Shopping Cart");
		txtShoppingCart.setBounds(313, 497, 304, 32);
		txtShoppingCart.setBackground(new Color (150, 150, 150, 128));
		txtShoppingCart.setColumns(10);
		panel.add(txtShoppingCart);
		
		
		txtSum = new JTextField();
		txtSum.setForeground(Color.WHITE);
		txtSum.setText("0");
		txtSum.setBounds(670, 498, 130, 32);
		txtSum.setBackground(new Color (150, 150, 150, 128));
		txtSum.setColumns(10);
		panel.add(txtSum);
	
		
		JLabel picture_1 = new JLabel("");
		picture_1.setBounds(409, 56, 167, 250);
		panel.add(picture_1);
		Image img_2 = new ImageIcon(this.getClass().getResource("/Beer.jpeg")).getImage();
		picture_1.setIcon(new ImageIcon(img_2));
		
		
		JLabel picture_2 = new JLabel("");
		picture_2.setBounds(626, 61, 312, 240);
		Image img_3 = new ImageIcon(this.getClass().getResource("/Caffee.png")).getImage();
		picture_2.setIcon(new ImageIcon(img_3));
		panel.add(picture_2);
		
		
		JLabel picture_3 = new JLabel("");
		picture_3.setBounds(219, 56, 135, 250);
		Image img_4 = new ImageIcon(this.getClass().getResource("/Cigarett.jpg")).getImage();
		picture_3.setIcon(new ImageIcon(img_4));
		panel.add(picture_3);
		
		
		JLabel picture_4 = new JLabel("");
		picture_4.setBounds(0, -28, 1024, 600);		
		Image img = new ImageIcon(this.getClass().getResource("/Shop.jpeg")).getImage();
		picture_4.setIcon(new ImageIcon(img));
		panel.add(picture_4);
		

	}
	public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}
