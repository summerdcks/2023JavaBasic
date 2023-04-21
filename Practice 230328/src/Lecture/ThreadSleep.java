package Lecture;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep {

	public static void main(String[] args) {
	
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		while(true) {
			System.out.println(dateAndTime);
			System.out.println("start");
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
			time = new Date();
			dateAndTime = format.format(time);
			System.out.println(dateAndTime);
			System.out.println("end");
		}
	}
}
