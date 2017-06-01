
import java.awt.*;
import javax.swing.*;

public class PaintPictureRest extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MinCanvas canvas = new MinCanvas();
	
	public static void main(String[] args) {
		PaintPictureRest rbk = new PaintPictureRest();
		}
	
	public PaintPictureRest() {
		setLayout(new BorderLayout());
		setSize(500, 375);
		setTitle("Bowling Klot");
		add("Center", canvas);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		setVisible(true);	
	}
	
	private class MinCanvas extends Canvas {
		
		@Override
		public void paint(Graphics g) {
			g.drawString("Träna", 50, 50);
//			g.drawOval(50, 50, 100, 25);
//			g.drawRect(200, 50, 100, 25);
//			g.setColor(Color.yellow);
//			g.fillOval(50, 50, 100, 25);
//			g.fillRect(200, 10, 100, 25);
//			Image bowlingklot1 = new ImageIcon("bilder/bowlingklot1.jpg").getImage();
//			g.drawImage(bowlingklot1, 130, 100, this);
		}
	}
}