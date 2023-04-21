package daily0320;
import java.util.Scanner;

public class ch2A10 {

	public static void main(String[] args) {
		System.out.println("#Menu\n"
				+ "1. Coke - 340\n"
				+ "2. Orange Juice – 500\n"
				+ "3. Milk – 650\n"
				+ "4. Water – 290\n"
				+ "5. Coffee – 170");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int input =1000;
		int change=0;
		
		switch(n) {
		case 1:
			change = input - 340;
			break;
		case 2:
			change = input - 500;
			break;
		case 3:
			change = input - 650;
			break;
		case 4:
			change = input - 290;
			break;
		case 5:
			change = input - 170;
			break;
		}
		
		int hundred = change/100;
		int fifty = (change%100)/50;
		int ten = (change%50)/10;
		
		System.out.println("\"The change is " + change + "(100 x " + hundred + ", 50 x " + fifty + ", 10 x " + ten + ")\"");
	}

}
