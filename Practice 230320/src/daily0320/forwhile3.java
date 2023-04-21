package daily0320;
import java.util.Scanner;

public class forwhile3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (true) {
			System.out.println(i);
			i++;
			if(i>3) {
				break;
			}
		}
///////////////////////////////////////////////////////
		int j = 0;
		for(j=0; j<=3; j++) {
			System.out.println(j);
		}

	}

}
