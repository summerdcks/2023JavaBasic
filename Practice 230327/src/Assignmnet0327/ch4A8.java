package Assignmnet0327;

import java.util.ArrayList;
import java.util.Scanner;

public class ch4A8 {

	public static void main(String[] args) {
		showMenu();
		while (true) {
			int n = selectMenu();
			if (n == 1) {
				String number = inputNumber();
				encrypt(number);
			} else if (n == 2) {
				String line = inputLine();
				decrypt(line);
			} else {
				break;
			}
		}
	}

	
	public static void showMenu() {
		System.out.println("#Menu");
		System.out.println("1. Encoder");
		System.out.println("2. Decoder");
		System.out.println("3. Exit");
	}
	
	public static int selectMenu() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		return n;
	}
	
	public static String inputNumber() {
		Scanner scanner = new Scanner(System.in);
		String Number = scanner.nextLine();
		return Number;
	}
	
	public static void encrypt(String number) {
		for (int i = 0; i < number.length(); i++) {
			System.out.print((char)(number.charAt(i)+49));
		}
		System.out.println();
	}
	
	public static String inputLine() {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		return line;
	}
	
	public static void decrypt(String line) {
		for (int i = 0; i < line.length(); i++) {
			System.out.print((char)((int)line.charAt(i)-49));
		}
		System.out.println();
	}

}
