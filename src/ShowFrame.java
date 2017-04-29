import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ShowFrame {	
	public static void main(String[] args) {

		Frame huvudFrame = new Frame("Träna är bra");
		huvudFrame.setSize(400, 300);
		
		

	    huvudFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);		
	}
		});
		huvudFrame.setVisible(true);
	}
}
