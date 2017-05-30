//branch (refactoring_no_1)

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUITotalGo {
	
	//Globala variabler och objekt
	//Frames
	JFrame goFrame = new JFrame("GO GUI");
	
	//Panels
	JPanel panel_go = new JPanel(new BorderLayout(3,3));

	//Buttons
	JButton buttongo = new JButton("GO");
	
	//Default constructor
	public GUITotalGo(){};
	
	//Create GUI objects and buttons
	public void CreateGUI(){
		
	//Buttons
		buttongo.setForeground(Color.red);

		//actionListeners
		GUIListener myListener = new GUIListener();
		buttongo.addActionListener(myListener);		

	//panels
		panel_go.add(buttongo);
					
	//frames
		//goFrame
		goFrame.add(panel_go);  					
		goFrame.setSize(600, 300);	
//		goFrame.setLocationRelativeTo(null);  	//frame placeras i mitten
		goFrame.setLocation(0, 0);  			//frame placeras uppe till vänster
		goFrame.setLayout(new GridLayout(5,4));
		goFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		goFrame.setVisible(true);
		}
	
	public class GUIListener implements ActionListener{
		
		@Override
		
		//metoden här under aktiveras när actionevent e triggas
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttongo){
					//om listan trycks
				

			}		
		} 	
	} 
} 
