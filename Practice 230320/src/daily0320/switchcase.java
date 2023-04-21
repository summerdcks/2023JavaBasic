package daily0320;
import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		switch(n){
		case 1 :
		System.out.println("Positive");
		break;
		case 2 :
		System.out.println("Negative");
		break;
		default :
		System.out.println("Zero");
		
		}

	}

}
