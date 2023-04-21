package PrepareTest;

import java.util.Scanner;

public class JavaPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		double ln = Double.parseDouble(line);
		if (line.contains(".")) {
			System.out.println(ln);
		} else {
			System.out.println((int)ln);
		}
		
		if (ln == 0) {
			System.out.println("zero");
		} else if (ln > 3.14) {
			System.out.println("원주율보다 큼");
		} else if (ln <= 3.14 && ln > 0) {
			System.out.println("원주율보다 작음");
		} else if (ln < 0) {
			System.out.println("음수");
		}
	}
}