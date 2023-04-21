package ch4P1sample;

import java.util.Scanner;
import ch4P1sample.fruits;

public class main {
	public static fruits apple;
	public static fruits strawberry;
	public static fruits grape;
	public static fruits watermelon;
	
	public static void main(String[] args) {
		
		initialization();
		
		while(true) {
					int num = showMenu();
					showInformation(num);
					if (num == 5) {
						break;
					}
		}
	}

		public static void initialization() {
			apple = new fruits(1000,"apple");
			strawberry = new fruits(2000,"strawberry");
			grape = new fruits(3000,"grape");
			watermelon = new fruits(4000,"watermelon");
		}
	
		public static void showInformation(int num) {
			if (num == 1) {
				System.out.println(apple.getName() + "," +apple.getPrice());
			} else if (num == 2) {
				System.out.println(strawberry.getName() + "," +strawberry.getPrice());
			} else if (num == 3) {
				System.out.println(grape.getName() + "," +grape.getPrice());
			} else if (num == 4) {
				System.out.println(watermelon.getName() + "," +watermelon.getPrice());
			} else if (num == 5) {
				System.out.println("Bye Bye!");
			} else {
				System.out.println("Error");
			}
				
		}
			
		public static int showMenu() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Price");
			System.out.println("1. Apple");
			System.out.println("2. Strawberry");
			System.out.println("3. Grape");
			System.out.println("4. Watermelon");
			System.out.println("5. End the program");
			int num = scanner.nextInt();
			return num;
	
	}
}
