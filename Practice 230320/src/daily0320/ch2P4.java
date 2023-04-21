package daily0320;
import java.util.Scanner;

public class ch2P4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String ternary = "";	//문자열
		while (number > 0) {
				int remain = number % 3;
				ternary = remain + ternary;	//문자열+정수=문자열
				number = number / 3;
			}
		System.out.println(ternary);
	}	
}
