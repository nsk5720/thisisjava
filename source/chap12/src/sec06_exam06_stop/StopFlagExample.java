package sec06_exam06_stop;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();
		
		try {printThread1.sleep(1000);} catch(InterruptedException e) {
			printThread1.setStop(true);
		}

	}

}
