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
import Logic.FileHandler;

/**
 * 
 */
public class AdminView {

	
	private JFrame frame;
	private JTextField p1_bal;
	private JTextField p3_bal;
	private JTextField p4_bal;
	private JTextField p2_bal;
	private JTextField p1_text;
	private JTextField p3_text;
	private JTextField p4_text;
	private JTextField p2_text;
	private JTextField[] arr_bal = {p1_bal, p2_bal, p3_bal, p4_bal};
	private JTextField[] arr_text = {p1_text, p2_text, p3_text, p4_text};
	
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
		loadAndDisplayCartData();
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
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Player 1");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(549, 188, 117, 29);
		panel.add(lblNewLabel_1_1);
		
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblBalance.setBounds(549, 146, 130, 43);
		panel.add(lblBalance);
		
		
		p1_bal = new JTextField();
		p1_bal.setEditable(false);
		p1_bal.setColumns(10);
		p1_bal.setBounds(549, 230, 218, 94);
		panel.add(p1_bal);
		
		
		JLabel lblNewLabel_3_1 = new JLabel("Player 3");
		lblNewLabel_3_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_3_1.setBounds(549, 347, 135, 43);
		panel.add(lblNewLabel_3_1);
		
		
		p3_bal = new JTextField();
		p3_bal.setEditable(false);
		p3_bal.setColumns(10);
		p3_bal.setBounds(550, 397, 218, 94);
		panel.add(p3_bal);
		
		
		p4_bal = new JTextField();
		p4_bal.setEditable(false);
		p4_bal.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		p4_bal.setColumns(10);
		p4_bal.setBounds(789, 396, 218, 94);
		panel.add(p4_bal);
		
		
		JLabel lblNewLabel_4_1 = new JLabel("Player 4");
		lblNewLabel_4_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_4_1.setBounds(789, 353, 135, 31);
		panel.add(lblNewLabel_4_1);
		
		
		p2_bal = new JTextField();
		p2_bal.setEditable(false);
		p2_bal.setColumns(10);
		p2_bal.setBounds(789, 230, 218, 94);
		panel.add(p2_bal);
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Player 2");
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(789, 187, 156, 31);
		panel.add(lblNewLabel_2_1);
		
		
		JLabel lblOrder = new JLabel("Order");
		lblOrder.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblOrder.setBounds(18, 146, 130, 43);
		panel.add(lblOrder);
		
		
		JLabel p1_label = new JLabel("Player 1");
		p1_label.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		p1_label.setBounds(18, 188, 117, 29);
		panel.add(p1_label);
		
		
		p1_text = new JTextField();
		p1_text.setEditable(false);
		p1_text.setColumns(10);
		p1_text.setBounds(18, 230, 227, 94);
		panel.add(p1_text);
		
		
		JLabel p3_label = new JLabel("Player 3");
		p3_label.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		p3_label.setBounds(18, 347, 135, 43);
		panel.add(p3_label);
		
		
		p3_text = new JTextField();
		p3_text.setEditable(false);
		p3_text.setColumns(10);
		p3_text.setBounds(19, 397, 227, 94);
		panel.add(p3_text);
		
		
		p4_text = new JTextField();
		p4_text.setEditable(false);
		p4_text.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		p4_text.setColumns(10);
		p4_text.setBounds(258, 396, 227, 94);
		panel.add(p4_text);
		
		
		JLabel p4_label = new JLabel("Player 4");
		p4_label.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		p4_label.setBounds(258, 353, 135, 31);
		panel.add(p4_label);
		
		
		p2_text = new JTextField();
		p2_text.setEditable(false);
		p2_text.setColumns(10);
		p2_text.setBounds(258, 230, 227, 94);
		panel.add(p2_text);
	
		
		JLabel p2_label = new JLabel("Player 2");
		p2_label.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		p2_label.setBounds(258, 187, 156, 31);
		panel.add(p2_label);
	}
	public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
	private void loadAndDisplayCartData() {
	    String[] cartData = FileHandler.loadShoppingCart();
	    

	    if (cartData[0] != null) {
	        p1_bal.setText(cartData[0]);
	    } else {
	        p1_bal.setText("N/A");
	    }
	    if (cartData[1] != null) {
	        p1_text.setText(cartData[1]);
	    } else {
	        p1_text.setText("N/A");
	    }
	}
	public void updateCartData(String price, String quantity) {
	    p3_bal.setText(price);
	    p1_text.setText(quantity);
	}
	public JTextField getP1_bal() {
		return p1_bal;
	}

	public void setP1_bal(JTextField p1_bal) {
		this.p1_bal = p1_bal;
	}

	public JTextField getP3_bal() {
		return p3_bal;
	}

	public void setP3_bal(JTextField p3_bal) {
		this.p3_bal = p3_bal;
	}

	public JTextField getP4_bal() {
		return p4_bal;
	}

	public void setP4_bal(JTextField p4_bal) {
		this.p4_bal = p4_bal;
	}

	public JTextField getP2_bal() {
		return p2_bal;
	}

	public void setP2_bal(JTextField p2_bal) {
		this.p2_bal = p2_bal;
	}

	public JTextField getP1_text() {
		return p1_text;
	}

	public void setP1_text(JTextField p1_text) {
		this.p1_text = p1_text;
	}

	public JTextField getP3_text() {
		return p3_text;
	}

	public void setP3_text(JTextField p3_text) {
		this.p3_text = p3_text;
	}

	public JTextField getP4_text() {
		return p4_text;
	}

	public void setP4_text(JTextField p4_text) {
		this.p4_text = p4_text;
	}

	public JTextField getP2_text() {
		return p2_text;
	}

	public void setP2_text(JTextField p2_text) {
		this.p2_text = p2_text;
	}

	public JTextField[] getArr_bal() {
		return arr_bal;
	}

	public void setArr_bal(JTextField[] arr_bal) {
		this.arr_bal = arr_bal;
	}

	public JTextField[] getArr_text() {
		return arr_text;
	}

	public void setArr_text(JTextField[] arr_text) {
		this.arr_text = arr_text;
	}

}
