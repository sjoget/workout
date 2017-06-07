
import java.awt.*;
import javax.swing.*;

public class PaintPictureGo extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MinCanvas canvas = new MinCanvas();
	
	public static void main(String[] args) {
		PaintPictureGo rbk = new PaintPictureGo();
		}
	
	public PaintPictureGo() {
		setLayout(new BorderLayout());
		setSize(500, 375);
		setTitle("Träna");
		add("Center", canvas);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLocationRelativeTo(null);		
		setVisible(true);	
	} 
	
	private class MinCanvas extends Canvas {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public void paint(Graphics g) {
			g.drawString("Träna", 50, 50);
//			Image bowlingklot1 = new ImageIcon("bilder/bowlingklot1.jpg").getImage();
//			g.drawImage(bowlingklot1, 130, 100, this);
		}
	}
}