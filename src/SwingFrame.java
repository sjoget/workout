import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.*;


public class SwingFrame {
    private static final ActionListener ActionListener = null;

	private static void createAndShowGUI() {

    	JFrame frame = new JFrame("Tr�na!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Rad med en fr�ga
        JLabel howLongPractice = new JLabel("Hur l�nge ska du tr�na per repetition?");
        howLongPractice.setPreferredSize(new Dimension(500, 50));
        Font font1 = new Font("Arial Bold", Font.BOLD, 24);
		howLongPractice.setFont(font1);
		frame.getContentPane().add(howLongPractice, BorderLayout.CENTER);
		    
        //Rad med ett nummer
        JLabel countDownPractice = new JLabel("5 sekunder");
        countDownPractice.setPreferredSize(new Dimension(100, 50));
        countDownPractice.setFont(font1);
		frame.getContentPane().add(countDownPractice, BorderLayout.AFTER_LAST_LINE);
		
		//Button
		 JButton button = new JButton();
		 button.setBackground(null);
		 button.setOpaque(false);
//		 button.setBorder(new EmptyBorder());
		   
		//Textf�lt
//	    final String textFieldString = "JTextField";
//      textField.setActionCommand(textFieldString);
//	    JLabel JTextField =
//        JTextField textField = new JTextField(10);
//        textField.addActionListener(ActionListener);
		
		
        
        
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}