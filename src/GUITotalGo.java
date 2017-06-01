//branch (refactoring_no_1)

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
	JButton buttongo = new JButton("READY? Press this button!");
	
	//Default constructor
	public GUITotalGo(){}; 
	
	//Create GUI objects and buttons
	public void CreateGUI(){		

		//Text field
		JFormattedTextField totalTimeField = new JFormattedTextField(Integer);
		totalTimeField.setValue(InputParameters.minuterTot + " Minuter och " + InputParameters.sekunderModulo + " Sekunder");
		totalTimeField.setFont(new Font("Comic Sans", Font.ITALIC, 40));
		
		//Buttons
		buttongo.setForeground(Color.red);
		buttongo.setFont(new Font("Arial", Font.PLAIN, 40));

		//actionListeners
		GUIListener myListener = new GUIListener();
		buttongo.addActionListener(myListener);		

	//panels
		panelGo.add(buttongo);
					
	//frames
		//goFrame
		goFrame.add(totalTimeField);
		goFrame.add(panelGo); 
		goFrame.setSize(600, 300);	
//		goFrame.setLocationRelativeTo(null);  	//frame placeras i mitten
		goFrame.setLocation(600, 0);  			//frame placeras uppe till vänster
		goFrame.setLayout(new GridLayout(5,4));
		goFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		goFrame.setVisible(true);
		}
	
	public class GUIListener implements ActionListener{
		
		@Override
				public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttongo){
							
				int reps = InputParameters.inputReps;
				int intervall = InputParameters.sekunderIntervall;
				int vila = InputParameters.sekunderVila;

//				for (int i = 0; i <= reps; i++) 
					for (int i = 1; i <= reps; i++) 
				{	
					try {
						System.out.println("Träna");
						PaintPictureRest.main(null);
						Timer.timer(intervall);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	
					try {
						System.out.println("Vila");
						Timer.timer(vila);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}		
		} 	
	} 
} 
