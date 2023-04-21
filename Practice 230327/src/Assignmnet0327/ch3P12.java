package Assignmnet0327;

import java.util.Scanner;

public class ch3P12 {
public static int number = 0;
public static int degree = 0;
	public static void main(String[] args) {
		showMenu();
		number = selectNumber();
		degree = inputDegree();
		printResult();
	}

	public static void showMenu() {
		System.out.println("#Current Converter");
		System.out.println("1. Celsius -> Fahrenheit");
		System.out.println("2. Fahrenheit -> Celsius");
	}
	
	public static int selectNumber() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		return number;
	}
	
	public static int inputDegree() {
		Scanner scanner = new Scanner(System.in);
		int degree = scanner.nextInt();
		return degree;
	}
	
	public static void printResult() {
		int result;
		if (number == 1) {
			result = degree * 9 / 5 + 32;
			System.out.println(result);
		} else if (number == 2) {
			result = (degree - 32) * 5 / 9;
			System.out.println(result);
		}
	}
//(32°F − 32) × 5/9 = 0°C

}
