package Lecture;

public class ThreadSleep3 {

	public static void main(String[] args) {
		int number = 1;
		while(true) {
			
			System.out.println(number);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			
			number++;
			
			if (number > 100) {
				break;
			}
		}
	}
}
