//branch (refactoring_no_1)

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
//import java.awt.LayoutManager;
//import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;
//import javax.swing.border.TitledBorder;

public class GUIMakerClass {
	
	//Globala variabler och objekt
	//Frames
	JFrame myFrame = new JFrame("Tränings GUI");

	//Text fält
//	JTextField textintervall = new JTextField("Välj sekunder för träningsintervall");
//	JTextField texttotaltid = new JTextField("Total tid");
//	JTextField texttotaltid = new JTextField("Total tid");
	
	//Buttons
	JButton buttonintervall = new JButton("Välj sekunder för träningsintervall");
	JButton buttonvila = new JButton("Välj sekunder för vila");	
	JButton buttonreps = new JButton("Välj antal reps");	
	JButton buttontotaltime = new JButton("Tryck här för att räkna ut total tid");	
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
	//textfält
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
//		secondsBoxJComboBox.addActionListener(myListener);
//		secondsVilaBoxJComboBox.addActionListener(myListener);
			
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
		for (int i = 0; i < 6; i++) {
			sekunder = sekunder + 10;
			secondsBoxJComboBox.addItem(sekunder);
			secondsVilaBoxJComboBox.addItem(sekunder);
		}

		//Reps list
		int reps = 0;
		for (int i = 0; i < 6; i++) {
			reps++;
			RepsBoxJComboBox.addItem(reps);
		}
		
	//frames
		//myFrame
//		myFrame.add(textintervall);
		myFrame.add(panel_intervall);  					//lägg till panel 
		myFrame.add(panel_vila);  					
		myFrame.add(panel_reps);  					
		myFrame.add(panel_totaltid);  					
		myFrame.setSize(600, 300);	
//		myFrame.setLocationRelativeTo(null);  	//frame placeras i mitten
		myFrame.setLocation(0, 0);  			//frame placeras uppe till vänster
		myFrame.setLayout(new GridLayout(5,4));
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		}
	
	private Object Dimension(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public class GUIListener implements ActionListener{
		
		@Override
		
		//metoden här under aktiveras när actionevent e triggas
		public void actionPerformed(ActionEvent e) {
//			if (e.getSource() == textintervall){
//				System.out.println(secondsBoxJComboBox.getSelectedItem());
//			}
//			else if (e.getSource() == buttonvila){
//				System.out.println(secondsVilaBoxJComboBox.getSelectedItem());
//			}
//			else if (e.getSource() == buttonreps){
//				System.out.println(RepsBoxJComboBox.getSelectedItem());
//			}
//			else if (e.getSource() == buttontotaltime){
			if (e.getSource() == buttontotaltime){
					//om listan trycks
				int sekunderIntervall = (int) secondsBoxJComboBox.getSelectedItem();
				int sekunderVila = (int) secondsVilaBoxJComboBox.getSelectedItem();
				int inputReps = (int) RepsBoxJComboBox.getSelectedItem();
				int sekunderTot = (( sekunderVila + sekunderIntervall ) * inputReps);
				int minuterTot = sekunderTot/60;
				int sekunderModulo = sekunderTot % 60;
				
				System.out.println(minuterTot + (" minuter ") + sekunderModulo + (" Sekunder"));
				
				//Write file

				
				
				GUITotalGo goGUI = new GUITotalGo();
				goGUI.CreateGUI();


			}
			
		} //slut action performed method
		
	} //slut myGUIListener class

} //slut GUIMakerClass
