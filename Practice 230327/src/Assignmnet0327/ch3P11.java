package Assignmnet0327;

import java.util.Scanner;

public class ch3P11 {
public static int number = 0;
public static int money = 0;
	public static void main(String[] args) {
		showMenu();
		number = selectNumber();
		money = inputMoney();
		printResult();
	}

	public static void showMenu() {
		System.out.println("#Current Converter");
		System.out.println("1. South Korean won -> United States Dollar");
		System.out.println("2. United States Dollar -> South Korean won");
		System.out.println("3. South Korean won -> Chinese Yuan");
	}
	
	public static int selectNumber() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}
	
	public static int inputMoney() {
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		return money;
	}
	
	public static void printResult() {
		if (number == 1) {
			System.out.println(Math.floor((money/1300.24)*100)/100);
		} else if (number == 2) {
			System.out.println((int)(money*1300.24/10)*10);
		} else if (number == 3) {
			System.out.println(money*0.0053);
		}
	}
}
