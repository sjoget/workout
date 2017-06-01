//branch (refactoring_no_1)

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUITotalGo {
	
	private static final Object Integer = null;

	//Globala variabler och objekt
	//Frames
	JFrame goFrame = new JFrame("GO GUI");
	
	//Panels
	JPanel panelGo = new JPanel(new BorderLayout(3,3));

	//Buttons
	JButton buttongo = new JButton("GO");
	
	//Default constructor
	public GUITotalGo(){};
	
	//Create GUI objects and buttons
	public void CreateGUI(){
	
		//Text field
		JFormattedTextField totalTimeField = new JFormattedTextField(Integer);
		totalTimeField.setValue(100);
		
//		rateField = new JFormattedTextField(percentFormat);
//		rateField.setValue(new Double(rate));
//		rateField.setColumns(10);
//		rateField.addPropertyChangeListener("value", this);

		//Buttons
		buttongo.setForeground(Color.red);

		//actionListeners
		GUIListener myListener = new GUIListener();
		buttongo.addActionListener(myListener);		

	//panels
		panelGo.add(buttongo);
					
	//frames
		//goFrame
		goFrame.add(panelGo); 
		goFrame.add(totalTimeField);
		goFrame.setSize(600, 300);	
		goFrame.setLocationRelativeTo(null);  	//frame placeras i mitten
//		goFrame.setLocation(0, 0);  			//frame placeras uppe till vänster
		goFrame.setLayout(new GridLayout(5,4));
		goFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		goFrame.setVisible(true);
		}
	
	public class GUIListener implements ActionListener{
		
		@Override
		
		//metoden här under aktiveras när actionevent e triggas
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttongo){
				
				

			}		
		} 	
	} 
} 
