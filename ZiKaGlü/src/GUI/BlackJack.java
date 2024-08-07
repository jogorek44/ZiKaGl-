package GUI;

import bj.BlackjackGame;
import bj.Card;
import bj.Player;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class BlackJack {

	JFrame frame;
	JTextArea dealersCards;
	JTextArea yourCards;
	private JTextField balance;
	private JTextField amountToBet;
	private JTextField winOrLoss;
	TransparentButton shop_button;
	TransparentButton menu_button;
	private JLabel timer;
	private boolean isTimerFinished;
	private TransparentButton bet;
	private TransparentButton reset;
	private TransparentButton hit;
	private TransparentButton stand;
	private TransparentButton allIn;
	private boolean afk = false;
	private BlackjackGame hs;
	private Player pl;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJack window = new BlackJack();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the application.
	 */
	public BlackJack() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("BLACKJACK");
		frame.setBounds(100, 100, 1024, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		timer = new JLabel("");
		timer.setVisible(false);
		
		reset = new TransparentButton("All In");
		reset.setText("reset");
		reset.setFont(new Font("Dialog", Font.PLAIN, 20));
		reset.setBounds(313, 521, 130, 32);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(balance.getText()=="0" && !amountToBet.isEnabled()) {

				}
				else if(!amountToBet.isEnabled()){
				amountToBet.setEnabled(true);
				balance.setText(String.valueOf(Integer.valueOf(amountToBet.getText())+Integer.valueOf(balance.getText())));
				bet.setEnabled(true);
				allIn.setEnabled(true);
				amountToBet.setText("");
				} else amountToBet.setText("");
			}
		});
		panel.add(reset);

		timer.setHorizontalAlignment(SwingConstants.CENTER);
		timer.setFont(new Font("Tahoma", Font.BOLD, 80));
		timer.setForeground(Color.WHITE);
		timer.setBounds(434, 216, 117, 70);
		panel.add(timer);

		menu_button = new TransparentButton("Menu");
		menu_button.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		menu_button.setBounds(6, 13, 117, 32);
		menu_button.setBackground(new Color(150, 150, 150, 128));
		panel.add(menu_button);

		hit = new TransparentButton("Hit");
		hit.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		hit.setBounds(329, 370, 130, 70);
		hit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hs.hit(pl.getId(),0);
				var var = hs.getPossibleHits(pl.getId()).length!=0;
				hit.setEnabled(var);
				stand.setEnabled(var);
				yourCards.setText(cardsString(hs.getCards(pl.getId(), 0)));
			}
		});
		panel.add(hit);

		bet = new TransparentButton("Bet");
		bet.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		bet.setBounds(184, 477, 117, 32);
		panel.add(bet);
		bet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(balance.getText()=="" || balance.getText()=="0") JOptionPane.showMessageDialog(panel, "Falsche Angabe");
				else if(Integer.parseInt(amountToBet.getText())<=Integer.parseInt(balance.getText())){
					amountToBet.setEnabled(false);
					bet.setEnabled(false);
					allIn.setEnabled(false);
					balance.setText(String.valueOf(Integer.parseInt(balance.getText())-Integer.parseInt(amountToBet.getText()))); 
				}
			}
		});


		/*split = new TransparentButton("Split");
		split.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		split.setBounds(619, 370, 130, 70);
		panel.add(split);
		*/

		shop_button = new TransparentButton("Shop");
		shop_button.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		shop_button.setBounds(6, 57, 117, 32);
		panel.add(shop_button);

		dealersCards = new JTextArea();
		dealersCards.setEditable(false);
		dealersCards.setWrapStyleWord(true);
		dealersCards.setAlignmentX(SwingConstants.CENTER);
		dealersCards.setForeground(Color.WHITE);
		dealersCards.setText("<Karte>");
		dealersCards.setBounds(184, 76, 130, 157);
		dealersCards.setBackground(new Color(150, 150, 150, 128));
		dealersCards.setColumns(10);
		panel.add(dealersCards);

		yourCards = new JTextArea();
		yourCards.setWrapStyleWord(true);
		yourCards.setAlignmentX(SwingConstants.CENTER);
		yourCards.setEditable(false);
		yourCards.setForeground(Color.WHITE);
		yourCards.setBackground(new Color(150, 150, 150, 128));
		yourCards.setText("<Karte>");
		yourCards.setBounds(680, 76, 130, 169);
		yourCards.setColumns(10);
		panel.add(yourCards);

		JLabel lblNewLabel = new JLabel("Dealer's Cards");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(174, 32, 213, 49);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Your Cards");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(660, 32, 165, 49);
		panel.add(lblNewLabel_1);

		balance = new JTextField("100");
		balance.setForeground(Color.WHITE);
		balance.setEditable(false);
		balance.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		balance.setBounds(860, 43, 130, 32);
		balance.setBackground(new Color(150, 150, 150, 128));
		balance.setColumns(10);
		balance.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.LIGHT_GRAY));
		panel.add(balance);

		JLabel balanceTag = new JLabel("Balance");
		balanceTag.setHorizontalAlignment(SwingConstants.CENTER);
		balanceTag.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		balanceTag.setForeground(Color.WHITE);
		balanceTag.setBounds(845, 7, 130, 38);
		panel.add(balanceTag);

		amountToBet = new JTextField("");
		amountToBet.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		amountToBet.setForeground(Color.WHITE);
		amountToBet.setBounds(313, 476, 130, 32);
		amountToBet.setBackground(new Color(150, 150, 150, 128));
		amountToBet.setColumns(10);
		panel.add(amountToBet);

		allIn = new TransparentButton("All In");
		allIn.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		allIn.setBounds(184, 521, 117, 32);
		allIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(balance.getText() != "0"){
					amountToBet.setText(balance.getText());
					amountToBet.setEnabled(false);
					balance.setText("0");
					bet.setEnabled(false);
					allIn.setEnabled(false);
				}
				else JOptionPane.showMessageDialog(null, "Kontostand ist leer");
			}
		});
		panel.add(allIn);

		stand = new TransparentButton("Stand");
		stand.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		stand.setBounds(184, 370, 130, 70);
		stand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hs.setDoneHitting(pl.getId());
				hit.setEnabled(false);
				stand.setEnabled(false);
			}
		});
		panel.add(stand);

		winOrLoss = new JTextField("");
		winOrLoss.setFont(new Font("Lucida Grande", Font.PLAIN, 70));
		winOrLoss.setHorizontalAlignment(SwingConstants.CENTER);
		winOrLoss.setEditable(false);
		winOrLoss.setForeground(Color.BLACK);
		winOrLoss.setVisible(false);
		// winOrLoss.setOpaque(false); Später Kommentar entfernen Damit Feld nicht
		// sichtbar ist
		// winOrLoss.setBorder(null);
		winOrLoss.setBounds(358, 216, 275, 86);
		winOrLoss.setColumns(10);
		panel.add(winOrLoss);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, -14, 1024, 600);
		Image img = new ImageIcon(this.getClass().getResource("/Blackjack1.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		panel.add(lblNewLabel_3);
		
	}

	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}

	public void startTimer(int time) {
		setTimerFinished(false);
		timer.setVisible(true);
		Timer countdownTimer = new Timer(1000, new ActionListener() {
			int count = time;

			@Override
			public void actionPerformed(ActionEvent e) {
				if (count > 0) {
					timer.setText(String.valueOf(count));
					count--;
				} else {
					((Timer) e.getSource()).stop();
					timer.setVisible(false);
					setTimerFinished(true);
				}
			}
		});
		countdownTimer.start();
	}

	public boolean isTimerFinished() {
		return isTimerFinished;
	}

	public void setTimerFinished(boolean isTimerFinished) {
		this.isTimerFinished = isTimerFinished;
	}
	

	public JTextField getBalance() {
		return balance;
	}

	public void setBalance(JTextField balance) {
		this.balance = balance;
	}

	public JTextField getAmountToBet() {
		return amountToBet;
	}

	public void String(String amountToBet) {
		this.amountToBet.setText(amountToBet);
	}

	public boolean isAfk(){
		return this.afk;
	}
	public void roundstart(BlackjackGame temp, Player p){
		hs = temp;
		pl = p;
		var var = temp.getPossibleHits(p.getId()).length!=0;
		afk = false;
		bet.setEnabled(false);
		allIn.setEnabled(false);
		hit.setEnabled(var);
		stand.setEnabled(var);
		reset.setEnabled(false);
		yourCards.setText(cardsString(hs.getCards(pl.getId(), 0)));
		dealersCards.setText(cardsString(hs.getDealerCards()));
		}

	public void afk(){
		afk = true;
		amountToBet.setText("");
		bet.setEnabled(false);
		allIn.setEnabled(false);
		hit.setEnabled(false);
		stand.setEnabled(false);
		reset.setEnabled(false);
	}

	public void betTime(){
		afk = false;
		amountToBet.setEnabled(true);
		bet.setEnabled(true);
		allIn.setEnabled(true);
		hit.setEnabled(false);
		stand.setEnabled(false);
		reset.setEnabled(true);
	}

	public static String cardsString(Card[] c){
		return Arrays.stream(c).map(Object::toString).collect(Collectors.joining("\n"));
	}
}
