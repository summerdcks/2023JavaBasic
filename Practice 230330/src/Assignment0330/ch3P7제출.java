package Assignment0330;

import java.util.Scanner;

public class ch3P7제출 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int date1 = scanner.nextInt();
		int date2 = scanner.nextInt();
		
		int duration = Math.abs(date1-date2);
		
		if (duration < 100) {
			System.out.println(duration -1);
		} else if (duration >= 100 && duration < 10000) {
			System.out.println(Math.abs((date1%10000-date1%100)-(date2%10000-date2%100))/100*30 + (duration%100) -1);	
		} else if (duration >= 10000) {
			System.out.println((duration/10000)*365 + Math.abs((date1%10000-date1%100)-(date2%10000-date1%100))/100*30 + (duration%100) -1);
		}
	}
}
