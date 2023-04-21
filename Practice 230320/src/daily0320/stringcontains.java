package daily0320;
import java.util.Scanner;

public class stringcontains {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = "hello?";
		if(text.contains("hello") == true) {
			System.out.println("It's hello");
		}else {
			System.out.println("It's not hello");
		}

	}

}
