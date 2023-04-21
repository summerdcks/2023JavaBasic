package PrepareTest;
import java.util.Scanner;


public class practice {
	public static final int ONETIME = 0;
	public static final int RANDOM = 1;
	public static final int EVENNUMBER = 0; // 짝수
	public static final int ODDNUMBER = 1; // 홀수
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(getRandomNumber(a));
		
		isEvenNumber(7);
	}
	
	private static int getRandomNumber(int a) {
		int n = 0;
		int sum = 0;
		int count = 0;
		if (a ==ONETIME) {
			n = (int)(Math.random() * 100);
		} else if (a==RANDOM) {
			while(true) {
				sum = sum + (int)(Math.random() * 100);
				count++;
				if (sum>=100) {
					break;
				}
			}
		} return n;
	}

	public static void isEvenNumber(int n) {
		if ((n % 2) == EVENNUMBER) {
			System.out.println("짝");
		} else if ((n % 2) == ODDNUMBER) {
			System.out.println("홀");
		}
		
	}
}