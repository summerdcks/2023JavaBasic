package Lecture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeTryCatch4 {

	public static void main(String[] args) {
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				a = Integer.parseInt(scanner.nextLine());
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
			if (a != 0) {
				break;
			}
		}
		System.out.println("#" + a);
 
	}

}