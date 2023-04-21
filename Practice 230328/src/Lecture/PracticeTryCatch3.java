package Lecture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeTryCatch3 {

	public static void main(String[] args) {
		String a;
		int b = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				a = scanner.nextLine();
				b = Integer.parseInt(a);
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
			if (b != 0) {
				break;
			}
		}
		System.out.println("#" + b);
 
	}

}
