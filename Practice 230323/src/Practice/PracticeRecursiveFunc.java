package Practice;
import java.util.Scanner;
public class PracticeRecursiveFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int startnumber = scanner.nextInt();
			System.out.println(sumToTen(startnumber));
	}
	
	public static int sumToTen(int number) {
		if (number > 10) {							//끝을 정해야함
			return 0;
		} else {
			return number + sumToTen(++number);
		}
	}
}
