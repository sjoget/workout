//branch (refactoring_no_1)

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
//import java.awt.LayoutManager;
//import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import javax.swing.*;
//import javax.swing.border.TitledBorder;

public class GUIMakerClass {
	
	//Globala variabler och objekt
	//Frames
	JFrame myFrame = new JFrame("Tr�nings GUI");

	//Text f�lt
//	JTextField textintervall = new JTextField("V�lj sekunder f�r tr�ningsintervall");
	
	//Buttons
	JButton buttonintervall = new JButton("V�lj sekunder f�r tr�ningsintervall");
	JButton buttonvila = new JButton("V�lj sekunder f�r vila");	
	JButton buttonreps = new JButton("V�lj antal reps");	
	JButton buttontotaltime = new JButton("Tryck h�r f�r att r�kna ut total tid");	
	//Panels
	JPanel panel_intervall = new JPanel(new BorderLayout(3,3));
	JPanel panel_vila = new JPanel(new BorderLayout(3,3));
	JPanel panel_reps = new JPanel(new BorderLayout(3,3));
	JPanel panel_totaltid = new JPanel(new BorderLayout(3,3));
	//Lists
	//dropdown list: JComboBox 
	JComboBox<Integer> secondsBoxJComboBox = new JComboBox<Integer>();
	JComboBox<Integer> secondsVilaBoxJComboBox = new JComboBox<Integer>();
	JComboBox<Integer> RepsBoxJComboBox = new JComboBox<Integer>();
	JComboBox<Integer> TotalTimeBoxJComboBox = new JComboBox<Integer>();
	
	//Date
	Date date = new Date();
		
	//Default constructor
	public GUIMakerClass(){};
	
	//Create GUI objects and buttons
	public void CreateGUI(){
	//textf�lt
//		textintervall.setForeground(Color.red);
//		textintervall.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 14));
//		textintervall.setBackground(Color.cyan);
		
		
	//Buttons
    	buttonintervall.setToolTipText("Button 4");
		buttonintervall.setForeground(Color.red);
		buttonvila.setToolTipText("Button 5");
		buttonvila.setForeground(Color.red);
		buttonreps.setToolTipText("Button 6");
		buttonreps.setForeground(Color.red);

		//actionListeners
		GUIListener myListener = new GUIListener();
		buttonintervall.addActionListener(myListener);		
		buttonvila.addActionListener(myListener);		
		buttonreps.addActionListener(myListener);		
		buttontotaltime.addActionListener(myListener);		
			
	//panels
		panel_intervall.add(secondsBoxJComboBox, BorderLayout.WEST);
		panel_intervall.add(buttonintervall);
//		panel_intervall.add(secondsBoxJComboBox, new JComboBox<>(Dimension(200, 200);
//		panel_intervall.add(textintervall);
				
		panel_vila.add(secondsVilaBoxJComboBox, BorderLayout.WEST);
		panel_vila.add(buttonvila);
		
		panel_reps.add(RepsBoxJComboBox, BorderLayout.WEST);
		panel_reps.add(buttonreps);
		
		panel_totaltid.add(TotalTimeBoxJComboBox);
		panel_totaltid.add(buttontotaltime);
//		panel_totaltid.add(texttotaltid, BorderLayout.WEST);

		int sekunder = 0;
		for (int i = 0; i < 7; i++) {
			secondsBoxJComboBox.addItem(sekunder);
			secondsVilaBoxJComboBox.addItem(sekunder);
//			sekunder = sekunder + 10;  �ndra
			sekunder = sekunder + 1;
		}

		//Reps list
		int reps = 0;
		for (int i = 0; i < 20; i++) {
			RepsBoxJComboBox.addItem(reps);
			reps++;
		}
		
	//frames
		//myFrame
//		myFrame.add(textintervall);
		myFrame.add(panel_intervall);  					//l�gg till panel 
		myFrame.add(panel_vila);  					
		myFrame.add(panel_reps);  					
		myFrame.add(panel_totaltid);  					
		myFrame.setSize(600, 300);	
//		myFrame.setLocationRelativeTo(null);  	//frame placeras i mitten
		myFrame.setLocation(0, 0);  			//frame placeras uppe till v�nster
		myFrame.setLayout(new GridLayout(5,4));
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		}
	
	public class GUIListener implements ActionListener{
		
		public InputParameters inputParameters = new InputParameters();

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == buttontotaltime){

				int sekunderIntervall = (int) secondsBoxJComboBox.getSelectedItem();
				int sekunderVila = (int) secondsVilaBoxJComboBox.getSelectedItem();
				int inputReps = (int) RepsBoxJComboBox.getSelectedItem();
				
				int sekunderTot = (( sekunderVila + sekunderIntervall ) * inputReps);
				int minuterTot = sekunderTot/60;
				int sekunderModulo = sekunderTot % 60;
						
				inputParameters.sekunderIntervall = sekunderIntervall;
				inputParameters.sekunderVila = sekunderVila;
				inputParameters.inputReps = inputReps;
				inputParameters.minuterTot = minuterTot;
				inputParameters.sekunderModulo = sekunderModulo;
				
				GUITotalGo goGUI = new GUITotalGo();
				goGUI.CreateGUI();

				//Write file
				
//		        try {
//		            FileWriter writer = new FileWriter("input_tider.txt", true);
//		            writer.write("Minuter totalt");
//		            writer.write("\r\n");  
//		            writer.write(minuterTot + " ");
//		            writer.close();
//		        } catch (IOException f) {
//		            f.printStackTrace();
//		        }			
//			

			}
			
		} 
		
	} 

} 
