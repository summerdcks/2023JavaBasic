package Assignment0324;

import java.util.Scanner;

public class ch4A9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int timeOne = scanner.nextInt();
		int timeTwo = scanner.nextInt();
		int interval = Math.abs(timeOne-timeTwo);
		
		//시
		if (10000 <= interval) {
			interval = (interval / 10000) * 3600 + (interval / 100) * 60 + (interval % 100);
		}
		//분
		if (100 <= interval && interval < 10000) {
			interval = (interval / 100) * 60 + (interval % 100);
		}
		//초
		if (interval < 100) {
			
		}	
		System.out.println(interval + "s");
	}

}
