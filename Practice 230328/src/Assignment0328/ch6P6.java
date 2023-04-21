package Assignment0328;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class ch6P6 {

	public static void main(String[] args) {

		String time = getCurrentTime();
		System.out.println(time);
		
		Scanner scanner = new Scanner(System.in);
		int seconds = scanner.nextInt();
		
		String[] tm = time.split(":");
		int sc = Integer.parseInt(tm[2]) + seconds;
		if (sc >= 60) {
			tm[1] = String.valueOf(Integer.parseInt(tm[1]) + (sc/60));
			tm[2] = String.valueOf(sc % 60);
		} else {
			tm[2] = String.valueOf(sc);
		}
		
		int mn = Integer.parseInt(tm[1]);
		if (mn >= 60) {
			tm[0] = String.valueOf(Integer.parseInt(tm[0]) + (mn/60));
			tm[1] = String.valueOf(mn % 60);
		} else {
			tm[1] = String.valueOf(mn);
		}
		
		int hr = Integer.parseInt(tm[0]);
		if (hr >= 24) {
			tm[0] = String.valueOf(mn % 24);
		} else {
			
		}
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("time is over(" +  tm[0] + ":" + tm[1] + ":" + tm[2] + ")");
	}
	public static String getCurrentTime() {
		java.text.SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss");
		Date time = new Date();
		String Time = format.format(time);
		return Time;
	}
}
