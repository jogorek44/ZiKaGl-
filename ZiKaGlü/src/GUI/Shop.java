package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Logic.FileHandler;

public class Shop {

	public JFrame frmshop;
	private JTextField txtShoppingCart;
	private JTextField txtSum;
	public TransparentButton menu_button;
	private int beerQuantity = 0;
	private int coffeeQuantity = 0;
	private int cigarettesQuantity = 0;
	public double price = 0;
	public String menge;
<<<<<<< HEAD
  
=======
	private FileHandler balanceFileHandler;
	public TransparentButton bj_button;

>>>>>>> 9e7e18a98fd803d1a66e1369d5ee81d52ab1d091
	public static void main(String[] args) {
		FileHandler.loadBalanceFromFile();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shop window = new Shop();

					window.frmshop.setVisible(true);
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
<<<<<<< HEAD
=======
		this.balanceFileHandler = new FileHandler();

>>>>>>> 9e7e18a98fd803d1a66e1369d5ee81d52ab1d091
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmshop = new JFrame();
		frmshop.setTitle("SHOP");
		frmshop.setResizable(false);
		frmshop.setIconImage(new ImageIcon(this.getClass().getResource("/Shop_1.png")).getImage());
		frmshop.setVisible(true);
		frmshop.setBounds(100, 100, 1024, 600);
		frmshop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frmshop.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
<<<<<<< HEAD
		
		
		TransparentButton menuButton = new TransparentButton("Menu");
		menuButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		menuButton.setBounds(6, 6, 137, 32);
		menuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				frmshop.dispose();
				}
		});
		panel.add(menuButton);
		
		
		JLabel lblNewLabel = new JLabel("Beer");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color (0, 0, 0, 128)); 
		lblNewLabel.setOpaque(true);
=======

		menu_button = new TransparentButton("Menu");
		menu_button.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		menu_button.setBounds(6, 6, 137, 32);
		panel.add(menu_button);

		JLabel lblNewLabel = new JLabel("Beer");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 0, 0, 128));
		lblNewLabel.setOpaque(true); // macht den Hintergrund sichtbar
>>>>>>> 9e7e18a98fd803d1a66e1369d5ee81d52ab1d091
		lblNewLabel.setBounds(458, 313, 61, 16);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cigaretts");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(new Color(0, 0, 0, 128));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBounds(259, 313, 61, 16);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Coffee");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(new Color(0, 0, 0, 128));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(752, 313, 61, 16);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("$3");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBackground(new Color(0, 0, 0, 128));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBounds(458, 341, 61, 16);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("$8");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(new Color(0, 0, 0, 128));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBounds(259, 341, 61, 16);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("$2.5");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBackground(new Color(0, 0, 0, 128));
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBounds(752, 341, 61, 16);
		panel.add(lblNewLabel_5);
<<<<<<< HEAD
		
		
		TransparentButton addBeerButton = new TransparentButton("Add");
		addBeerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beerQuantity++;
				price=beerQuantity*3+(coffeeQuantity*2.5)+(8*cigarettesQuantity);
				String stringNumber = Double.toString(price);
				txtSum.setText(stringNumber);
				menge= beerQuantity+"x Beer, "+coffeeQuantity+"x Coffee and "+cigarettesQuantity+"x Cigarettes";
=======

		TransparentButton btnNewButton_1 = new TransparentButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beerQuantity++;
				price = beerQuantity * 3 + (coffeeQuantity * 2.5) + (8 * cigarettesQuantity);
				String stringZahl = Double.toString(price);
				txtSum.setText(stringZahl);
				menge = beerQuantity + "x Beer, " + coffeeQuantity + "x Coffee and " + cigarettesQuantity
						+ "x Cigarettes";
>>>>>>> 9e7e18a98fd803d1a66e1369d5ee81d52ab1d091
				txtShoppingCart.setText(menge);

			}
		});
<<<<<<< HEAD
		addBeerButton.setBounds(434, 369, 117, 32);
		panel.add(addBeerButton);
		
		
		TransparentButton addCigarettsButton= new TransparentButton("Add");
		addCigarettsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cigarettesQuantity++;
				price=beerQuantity*3+(coffeeQuantity*2.5)+(8*cigarettesQuantity);
				String stringNumber = Double.toString(price);
				txtSum.setText(stringNumber);
				menge= beerQuantity+"x Beer, "+coffeeQuantity+"x Coffee and "+cigarettesQuantity+"x Cigarettes";
				txtShoppingCart.setText(menge);
			}
		});
		addCigarettsButton.setBounds(229, 369, 117, 32);
		panel.add(addCigarettsButton);
		
		
		TransparentButton addCoffeeButton = new TransparentButton("Add");
		addCoffeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffeeQuantity++;
				price=beerQuantity*3+(coffeeQuantity*2.5)+(8*cigarettesQuantity);
				String stringNumber = Double.toString(price);
				txtSum.setText(stringNumber);
				menge= beerQuantity+"x Beer, "+coffeeQuantity+"x Coffee and "+cigarettesQuantity+"x Cigarettes";
				txtShoppingCart.setText(menge);
			}
		});
		addCoffeeButton.setBounds(728, 369, 117, 32);
		panel.add(addCoffeeButton);
		
		
		TransparentButton checkoutButton = new TransparentButton("Checkout");
		checkoutButton.addActionListener(new ActionListener() {
=======
		btnNewButton_1.setBounds(434, 369, 117, 32);
		panel.add(btnNewButton_1);

		TransparentButton btnNewButton_2 = new TransparentButton("Add");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cigarettesQuantity++;
				price = beerQuantity * 3 + (coffeeQuantity * 2.5) + (8 * cigarettesQuantity);
				String stringZahl = Double.toString(price);
				txtSum.setText(stringZahl);
				menge = beerQuantity + "x Beer, " + coffeeQuantity + "x Coffee and " + cigarettesQuantity
						+ "x Cigarettes";
				txtShoppingCart.setText(menge);
			}
		});
		btnNewButton_2.setBounds(229, 369, 117, 32);
		panel.add(btnNewButton_2);

		TransparentButton btnNewButton_3 = new TransparentButton("Add");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coffeeQuantity++;
				price = beerQuantity * 3 + (coffeeQuantity * 2.5) + (8 * cigarettesQuantity);
				String stringZahl = Double.toString(price);
				txtSum.setText(stringZahl);
				menge = beerQuantity + "x Beer, " + coffeeQuantity + "x Coffee and " + cigarettesQuantity
						+ "x Cigarettes";
				txtShoppingCart.setText(menge);
			}
		});
		btnNewButton_3.setBounds(728, 369, 117, 32);
		panel.add(btnNewButton_3);

		TransparentButton btnNewButton_4 = new TransparentButton("Checkout");
		btnNewButton_4.addActionListener(new ActionListener() {
>>>>>>> 9e7e18a98fd803d1a66e1369d5ee81d52ab1d091
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frmshop,
						"Deine Bestellung von " + menge + " für $" + price + " wird vorbereitet!");
				double amountToPay = Double.parseDouble(txtSum.getText());
				System.out.println(amountToPay);
				Bank.balance -= amountToPay;
				txtSum.setText(String.format("%.2f", amountToPay));
<<<<<<< HEAD
				BalanceFileHandler.saveBalanceToFile();
				
				// Reset quantities and price
	            beerQuantity = 0;
	            coffeeQuantity = 0;
	            cigarettesQuantity = 0;
	            price = 0;
	            txtShoppingCart.setText("Shopping Cart");
	            txtSum.setText("$0.00");
			}
		});
		checkoutButton.setBounds(853, 498, 117, 32);
		panel.add(checkoutButton);
		
		
		TransparentButton blackJackButton = new TransparentButton("BlackJack");
		blackJackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  BlackJack blackjack = new BlackJack();
	                blackjack.setVisible(true);
	                frmshop.dispose();
	            }
		});
		blackJackButton.setFont(new Font("Dialog", Font.PLAIN, 20));
		blackJackButton.setForeground(Color.WHITE);
		blackJackButton.setBounds(6, 50, 145, 32);
		panel.add(blackJackButton);
		
		
=======
				FileHandler.saveBalanceToFile();
				saveShoppingCart();
				txtShoppingCart.setText("Shopping Cart");
				txtSum.setText("$ 0");

			}
		});
		btnNewButton_4.setBounds(853, 498, 117, 32);
		panel.add(btnNewButton_4);

		bj_button = new TransparentButton("BlackJack");
		bj_button.setFont(new Font("Dialog", Font.PLAIN, 20));
		bj_button.setForeground(Color.WHITE);
		bj_button.setBounds(6, 50, 145, 32);
		panel.add(bj_button);

>>>>>>> 9e7e18a98fd803d1a66e1369d5ee81d52ab1d091
		txtShoppingCart = new JTextField();
		txtShoppingCart.setEditable(false);
		txtShoppingCart.setForeground(Color.WHITE);
		txtShoppingCart.setText("Shopping Cart");
		txtShoppingCart.setBounds(313, 497, 304, 32);
		txtShoppingCart.setBackground(new Color(150, 150, 150, 128));
		txtShoppingCart.setColumns(10);
		panel.add(txtShoppingCart);

		txtSum = new JTextField();
		txtSum.setEditable(false);
		txtSum.setForeground(Color.WHITE);
		txtSum.setText("$ 00,00");
		txtSum.setBounds(670, 498, 130, 32);
		txtSum.setBackground(new Color(150, 150, 150, 128));
		txtSum.setColumns(10);
		panel.add(txtSum);
<<<<<<< HEAD
	
		
		JLabel beerPicture = new JLabel("");
		beerPicture.setBounds(409, 56, 167, 250);
		panel.add(beerPicture);
		Image img_2 = new ImageIcon(this.getClass().getResource("/Beer.jpeg")).getImage();
		beerPicture.setIcon(new ImageIcon(img_2));
		
		
		JLabel coffePicture = new JLabel("");
		coffePicture.setBounds(626, 61, 312, 240);
		Image img_3 = new ImageIcon(this.getClass().getResource("/Caffee.png")).getImage();
		coffePicture.setIcon(new ImageIcon(img_3));
		panel.add(coffePicture);
		
		
		JLabel cigarettsPicture = new JLabel("");
		cigarettsPicture.setBounds(219, 56, 135, 250);
		Image img_4 = new ImageIcon(this.getClass().getResource("/Cigarett.jpg")).getImage();
		cigarettsPicture.setIcon(new ImageIcon(img_4));
		panel.add(cigarettsPicture);
		
		
		JLabel shopPicture = new JLabel("");
		shopPicture.setBounds(0, -28, 1024, 600);		
		Image img = new ImageIcon(this.getClass().getResource("/Shop.jpeg")).getImage();
		shopPicture.setIcon(new ImageIcon(img));
		panel.add(shopPicture);
		
=======

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
>>>>>>> 9e7e18a98fd803d1a66e1369d5ee81d52ab1d091

	}

	public void setVisible(boolean visible) {
		frmshop.setVisible(visible);
	}

	private void saveShoppingCart() {
		String quantityDetails = "Beer: " + beerQuantity + " Coffee: " + coffeeQuantity + " Cigarettes: "
				+ cigarettesQuantity;
		String totalPrice = "Total Price: $" + price;
		FileHandler.saveShoppingCart(totalPrice, quantityDetails);

	}
}
