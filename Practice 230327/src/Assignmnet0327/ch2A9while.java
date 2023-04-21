package Assignmnet0327;

import java.util.Scanner;

public class ch2A9while {
	//소수
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number >= 2) {
			System.out.println(2);
			int i = 2;
			while (true) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						break;
					} else if (i % j !=0) {
						if (j == i-1) {
							System.out.println(i);
						} else {
							continue;
						}
					}					
				}
				i++;	
				if (i == number) {
					break;
				}
			}
		} 
	}
}
