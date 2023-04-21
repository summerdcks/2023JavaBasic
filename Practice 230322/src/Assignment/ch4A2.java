package Assignment;

import java.util.Scanner;

public class ch4A2 {
	static int number = 0;
	static long balance = 0;
	public static void main(String[] args) {
		
		while(true) {
			number = showMenu();							//메뉴&잔고&입출금선택
			int money = showMoney();						//금액	
			if (number == 1) {								//입출금
				balance = balance + money;	
			} else if (number == 2) {
				balance = balance - money;	
			} else {
				break;
			}
		}
	}

	public static int showMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("#Menu");
		System.out.println("1. Deposit");
		System.out.println("2. Withdrawal");
		System.out.println("else. Exit");
		System.out.println("Balance : " + balance);
		System.out.print("-> ");
		int num = scanner.nextInt();
		return num;
	}
	
	public static int showMoney() {
		Scanner scanner = new Scanner(System.in);
		int mon = scanner.nextInt();
		return mon;
	}
}
	
