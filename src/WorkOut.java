public class WorkOut {
	
	public static void main(String[] args) {
		
		GUIMakerClass myGUI = new GUIMakerClass();
		myGUI.CreateGUI();

//		GUITableMakerClass tableGUI = new GUITableMakerClass();
		GUITableMakerClass.createAndShowGUI();

	}


}




//import java.util.Scanner;
//
//public class WorkOut {
//
//	public static void main(String[] args) throws InterruptedException {
//		Scanner inputReader = new Scanner(System.in);
//		System.out.println("Hur m�nga sekunders tr�ning per rep?");
//		
//		int inputExerciseTime = inputReader.nextInt();
//		
//		Timer.timer(inputExerciseTime);
//		
//		System.out.println("Bra tr�nat");
//	
//		inputReader.close();
//		
//	}
//
//}
