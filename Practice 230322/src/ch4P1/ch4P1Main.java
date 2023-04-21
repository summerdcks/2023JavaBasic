package ch4P1;
import java.util.Scanner;
public class ch4P1Main {
	static int num;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//1.메뉴무한출력
		//2.메뉴값을 입력받으면 해당과일의 종류와 가격을 출력 *Fruits 클래스 활용	
		while(true) {
			
			showMenu();
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
			
			Fruits ft = new Fruits();
			ft.setPrice(num);
			System.out.println();
			
		}
	}

	
	public static void showMenu() {
		System.out.println("Price");
		System.out.println("1. Apple");
		System.out.println("2. Strawberry");
		System.out.println("3. Grape");
		System.out.println("4. Watermelon");
	}
}
