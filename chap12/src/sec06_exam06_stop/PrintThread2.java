package sec06_exam06_stop;

public class PrintThread2 extends Thread{
	//private boolean stop;
	
	/*public void setStop(boolean stop) {
		this.stop = stop;
	}*/
	public void run() {
		//how1
		/*try{
			while(true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {}*/
		//how2
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
