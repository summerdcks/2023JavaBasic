package Assignmnet0327;

import java.util.Scanner;

public class ch4A4 {

	public static void main(String[] args) {
		while(true) {
			showMenu();
			Scanner scanner = new Scanner(System.in);
			int select = scanner.nextInt();
			System.out.print("변경할 내용-> ");
			scanner.nextLine();
			String line = scanner.nextLine();
			char[] c = line.toCharArray();
			
			if (select == 1) {
				for (int i = 0; i < line.length(); i++) {
					System.out.print((char)((int)c[i] + 5));
				} System.out.println();
			} else if (select == 2) {
				for (int i = 0; i < line.length(); i++) {
						System.out.print((char)((int)c[i] -5));
				} System.out.println();
			} 
		} 
	}

	public static void showMenu() {
		System.out.println("#Menu");
		System.out.println("1. Encryption");
		System.out.println("2. Decryption");
		System.out.print("번호-> ");
	}
}
