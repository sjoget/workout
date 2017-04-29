
public class Timer {
public static void timer(int sekunder) throws InterruptedException {
	ShowFrame.main(null);
	for (int i = 0; i <= sekunder; i++) 
	{
		Thread.sleep(1000);
		System.out.println(i);
	}		
}
}
