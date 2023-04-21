package Assignmnet0327;

import java.util.Scanner;

public class ch3P15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String equation = scanner.nextLine();
		double a = 0;
		double b = 0;
		double result = 0.0;

		
		if (equation.contains("+")) {
			String[] e = equation.split("\\+");
			a = Double.parseDouble(e[0]);
			b = Double.parseDouble(e[1]);
			result = a + b;
		} else if (equation.contains("-")) {
			String[] e = equation.split("-");
			a = Double.parseDouble(e[0]);
			b = Double.parseDouble(e[1]);
			result = a - b;
		} else if (equation.contains("*")) {
			String[] e = equation.split("\\*");
			a = Double.parseDouble(e[0]);
			b = Double.parseDouble(e[1]);
			result = a * b;
		} else if (equation.contains("/")) {
			String[] e = equation.split("/");
			a = Double.parseDouble(e[0]);
			b = Double.parseDouble(e[1]);
			result = a / b;
		}
		System.out.println(result);
	}
}

//String[] names = words.split(" ");
//names[i]
