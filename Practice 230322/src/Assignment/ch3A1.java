package Assignment;
import java.util.Scanner;

public class ch3A1 {

	public static void main(String[] args) {
		int result = 1;
		int sum = 0;
		int mean = 0;
		int max = 0;
		int min = 500;
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			sum = sum+num;
			mean = sum/result;
			System.out.print("Result : " + result + " - ");
			System.out.print("Mean : " + mean);
			if (num > max) {
				max = num;
			} else { }
			System.out.print(", Max : " + max);
			if (num < min) {
				min = num;
			} else { }
			System.out.println(", Min : " + min);
			result++;
		}

	}

}
