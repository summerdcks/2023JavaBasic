package Lecture;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ThreadPractice extends Thread {

	public static void main(String[] args) throws InterruptedException {
		ThreadPractice thread = new ThreadPractice();
		thread.start();
		System.out.println("Check 1 : " + getCurrentTime() + "-" + thread.isAlive());
		Thread.sleep(3000);
		System.out.println(thread.isAlive());
		System.out.println("Check 2 : " + getCurrentTime() + "-" + thread.isAlive());	
		System.out.println(thread.isAlive());
	}
	
	public static String getCurrentTime() {
		java.text.SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}
 	
	@Override
	public void run() {
		super.run();
		int cnt = 0;
		while (true) {
			if (cnt == 5) {
				break;
			}
			try {
				System.out.println(getCurrentTime() + "-" + cnt);
				Thread.sleep(100);
				cnt++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
