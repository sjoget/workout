import java.awt.Color;
import java.awt.GridLayout;
//import java.awt.LayoutManager;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class GUIMakerClass {
	
	//Globala variabler och objekt
	//Frames
	JFrame myFrame = new JFrame("Min GUI app");
	//Buttons
	JButton okButton = new JButton();
	JButton button2 = new JButton("Cancel");
	JButton button3 = new JButton("Button 3");
	JButton buttonintervall = new JButton("Välj sekunder för träningsintervall");	
	JButton buttonvila = new JButton("Välj sekunder för vila");	
	JButton buttonreps = new JButton("Välj antal reps");	
	//Panels
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	//Lists
	//awk list
	List secondsList = new List(6, false);
	//dropdown list: JComboBox 
	JComboBox<Integer> secondsBoxJComboBox = new JComboBox<Integer>();
	JComboBox<Integer> secondsVilaBoxJComboBox = new JComboBox<Integer>();
	JComboBox<Integer> RepsBoxJComboBox = new JComboBox<Integer>();
	//träningstid lista
	
	
	//Date
	Date date = new Date();
		
	//Default constructor
	public GUIMakerClass(){};
	
	//Sekunder till dropdown 
		
	//Create GUI objects and buttons
	public void CreateGUI(){
	//Buttons
		//okButton här under
		okButton.setText("Okay");
		okButton.setToolTipText("Button2");
		//button2
		button2.setToolTipText("Button2");
		//button3
		button3.setToolTipText("Button 3");
		button3.setForeground(Color.red);
		//buttonintervall
		buttonintervall.setToolTipText("Button 4");
		buttonintervall.setForeground(Color.red);
		//buttonvila
		buttonvila.setToolTipText("Button 5");
		buttonvila.setForeground(Color.red);
		buttonreps.setToolTipText("Button 6");
		buttonreps.setForeground(Color.red);

		//actionListeners
		GUIListener myListener = new GUIListener();
		okButton.addActionListener(myListener);
		button2.addActionListener(myListener);
		button3.addActionListener(myListener);
		buttonintervall.addActionListener(myListener);		
		buttonvila.addActionListener(myListener);		
		buttonreps.addActionListener(myListener);		
		secondsList.addActionListener(myListener);
		secondsBoxJComboBox.addActionListener(myListener);
		secondsVilaBoxJComboBox.addActionListener(myListener);
		
	//panels
		//panel1
		panel1.add(okButton);
		panel1.add(button2);
		panel1.setSize(100,50);
		//panel2
		panel2.setBorder(new TitledBorder("Panel 2 border"));
		panel2.add(button3);
		//panel3
//		panel3.setBorder(new TitledBorder("Panel 3 border"));
		panel3.add(secondsBoxJComboBox);
		panel3.add(buttonintervall);
		//panel4
		panel4.add(secondsVilaBoxJComboBox);
		panel4.add(buttonvila);
		panel5.add(RepsBoxJComboBox);
		panel5.add(buttonreps);
//		panel6.add(secondsTotalList);
//		panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));
//		panel4.setLayout(new BoxLayout(panel4, 0));
		
	//Lists
		//awk sekundlista
//		secondsList.add("10s");
//		secondsList.add("20s");
//		secondsList.remove("50");	//ta bort 
		//JComboBox träning
		
//		secondsBoxJComboBox.addItem(10);
//		secondsBoxJComboBox.addItem(20);
//		secondsBoxJComboBox.addItem(30);
//		secondsBoxJComboBox.addItem(40);
//		secondsBoxJComboBox.addItem(50);
//		secondsBoxJComboBox.addItem(60);
//		

		int sekunder = 0;
		for (int i = 0; i < 6; i++) {
			sekunder = sekunder + 10;
			secondsBoxJComboBox.addItem(sekunder);
			secondsVilaBoxJComboBox.addItem(sekunder);
		}

		//Vila list
//		secondsVilaBoxJComboBox.addItem(10);
//		secondsVilaBoxJComboBox.addItem(20);
//		secondsVilaBoxJComboBox.addItem(30);
//		secondsVilaBoxJComboBox.addItem(40);
//		secondsVilaBoxJComboBox.addItem(50);
//		secondsVilaBoxJComboBox.addItem(60);
		//Reps list
		int reps = 0;
		for (int i = 0; i < 6; i++) {
			reps++;
			RepsBoxJComboBox.addItem(reps);
		}
//		RepsBoxJComboBox.addItem(1);
//		RepsBoxJComboBox.addItem(2);
//		RepsBoxJComboBox.addItem(3);
//		RepsBoxJComboBox.addItem(4);
//		RepsBoxJComboBox.addItem(5);
//		RepsBoxJComboBox.addItem(6);
//		int i = (int) secondsVilaBoxJComboBox.getSelectedItem();

//		int sekunderIntervall = (int) secondsBoxJComboBox.getSelectedItem();
//		int sekunderVila = (int) secondsVilaBoxJComboBox.getSelectedItem();
//		int inputReps = (int) secondsBoxJComboBox.getSelectedItem();
//		int sekunderTot = sekunderVila + sekunderIntervall + inputReps;
//		System.out.println(sekunderTot);
		
	//frames
		//myFrame
//		myFrame.add(panel1);
//		myFrame.add(panel2);  					//lägg till panel 2
		myFrame.add(panel3);  					//lägg till panel 3
		myFrame.add(panel4);  					//lägg till panel 4
		myFrame.add(panel5);  					//lägg till panel 5
		myFrame.add(panel6);  					//lägg till panel 6
		myFrame.setSize(600, 300);	
//		myFrame.setLocationRelativeTo(null);  	//frame placeras i mitten
		myFrame.setLocation(0, 0);  			//frame placeras uppe till vänster
		myFrame.setLayout(new GridLayout(5,4));
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
//		myFrame.add(secondsList);
		//myFrame.add(secondsBoxJComboBox);
	
	}
	
	public class GUIListener implements ActionListener{
		
		@Override
		
		//metoden här under aktiveras när actionevent e triggas
		public void actionPerformed(ActionEvent e) {
			//här händer det du vill göra med input
			if (e.getSource() == okButton){
				//om OK knappen trycks
				System.out.println("okButton");
			} 
//			else if (e.getSource() == button2){
//				//om button2 knappen trycks
//				System.out.println("button2");
//			} 
//			else if (e.getSource() == button3){
//				//om button3 knappen trycks
//				System.out.println("button3");
//			}
//			else if (e.getSource() == secondsList){
//				//om listan trycks
//				System.out.println(secondsList.getSelectedItem());
//				System.out.println(date);
//			}
//			else if (e.getSource() == secondsBoxJComboBox){
//				//om listan trycks
//				System.out.println(secondsBoxJComboBox.getSelectedItem());
//			}
			else if (e.getSource() == buttonintervall){
				//om listan trycks
				System.out.println(secondsBoxJComboBox.getSelectedItem());
			}
			else if (e.getSource() == buttonvila){
				//om listan trycks
				System.out.println(secondsVilaBoxJComboBox.getSelectedItem());
			}
			else if (e.getSource() == buttonreps){
				//om listan trycks
//				System.out.println(RepsBoxJComboBox.getSelectedItem());
//				int sekunderTot = (int) secondsVilaBoxJComboBox.getSelectedItem() + (int) secondsBoxJComboBox.getSelectedItem() + (int) RepsBoxJComboBox.getSelectedItem();
//				System.out.println(sekunderTot);
				
				int sekunderIntervall = (int) secondsBoxJComboBox.getSelectedItem();
				int sekunderVila = (int) secondsVilaBoxJComboBox.getSelectedItem();
				int inputReps = (int) RepsBoxJComboBox.getSelectedItem();
				int sekunderTot = (( sekunderVila + sekunderIntervall ) * inputReps);
				int minuterTot = sekunderTot/60;
				int sekunderModulo = sekunderTot % 60;
				
//				System.out.println(sekunderIntervall);
//				System.out.println(sekunderVila);
//				System.out.println(inputReps);
//				System.out.println(sekunderTot);
				System.out.println(minuterTot + (" minuter"));
				System.out.println(sekunderModulo + (" Sekunder"));


			}
			
		} //slut action performed method
		
	} //slut myGUIListener class

} //slut GUIMakerClass
