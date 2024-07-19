package GUI;



import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;
import javax.swing.JButton;

public class TransparentButton extends JButton {

    private static final long serialVersionUID = 1L;

	public TransparentButton(String text) {
        super(text);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        
        // Enable antialiasing for better quality rendering
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Set the color with transparency
        g2d.setColor(new Color(0, 0, 0, 128));
        
        // Draw the rounded rectangle
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

        // Draw the text
        super.paintComponent(g2d);
        
        g2d.dispose();
    }
}