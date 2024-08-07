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

import bj.Player;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Menu {

	JFrame frame;
	public TransparentButton btnNewButton_2;
	public TransparentButton start;
	private Shop shop;
	private BlackJack blackjack;
	private Player player;
	private int bet;

	/**
	 * 
	 * 
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { Menu window = new Menu();
	 * window.frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); }
	 * } }); }
	 */

	public int getBet() {
		return bet;
	}

	public void setBet(int bet) {
		this.bet = bet;
	}

	/**
	 * Create the application.
	 */

	public Menu(int id) {
		initialize();
		setPlayer(new Player(id, 100));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame("MENU");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		blackjack = new BlackJack();
		blackjack.setVisible(false);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		start = new TransparentButton("Start");
		start.setFont(new Font("Dialog", Font.PLAIN, 30));
		start.setForeground(Color.WHITE);
		start.setBounds(453, 202, 117, 54);
		panel_1.add(start);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				blackjack.setVisible(true);
				blackjack.menu_button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(true);
						blackjack.setVisible(false);
					}
				});
				blackjack.shop_button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Shop shop = new Shop();
						shop.setVisible(true);
						blackjack.setVisible(false);
						shop.bj_button.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								shop.frmshop.dispose();
								blackjack.setVisible(true);
							}
						});
						shop.menu_button.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								shop.frmshop.dispose();
								frame.setVisible(true);
							}
						});
					}
				});
			}
		});

		TransparentButton shop_button = new TransparentButton("Shop");
		shop_button.setFont(new Font("Dialog", Font.PLAIN, 30));
		shop_button.setForeground(Color.WHITE);
		shop_button.setBounds(453, 362, 117, 54);
		panel_1.add(shop_button);
		shop_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				shop = new Shop();
				shop.setVisible(true);
				shop.bj_button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						blackjack.setVisible(true);
						shop.frmshop.dispose();
					}
				});
				shop.menu_button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(true);
						shop.frmshop.dispose();
					}
				});
			}
		});

		btnNewButton_2 = new TransparentButton("Bank Account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Bank bank = new Bank();
				bank.setVisible(true);
				bank.menu_button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(true);
						bank.frame.dispose();
					}
				});
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
				frame.setVisible(false);
				settings.menu_button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.setVisible(true);
						settings.frame.dispose();
					}
				});
			}
		});

		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 30));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(427, 268, 170, 82);
		btnNewButton_1.setBackground(new Color(0, 0, 0, 128));
		panel_1.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("ZiKaGlü");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 66));
		lblNewLabel.setBounds(362, 6, 300, 71);
		lblNewLabel.setBackground(new Color(0, 0, 0, 128));
		lblNewLabel.setOpaque(true);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Home Menu");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		lblNewLabel_1.setForeground(Color.black);
		lblNewLabel_1.setBackground(new Color(255, 255, 255, 128));
		lblNewLabel_1.setOpaque(true); // damit der Hintergrund nicht durchsichtig ist
		lblNewLabel_1.setBounds(418, 103, 188, 43);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Black Jack");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBackground(new Color(255, 255, 255, 128));
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

	public int getWidth() {
		return frame.getWidth();
	}

	public int getHeight() {
		return frame.getHeight();
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public BlackJack getBlackjack() {
		return blackjack;
	}

	public void setBlackjack(BlackJack blackjack) {
		this.blackjack = blackjack;
	}
}
