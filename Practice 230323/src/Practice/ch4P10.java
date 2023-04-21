package Practice;

import java.util.Scanner;

public class ch4P10 {
	public static final int father = 0;
	public static final int mother = 1;
	public static final int son = 2;
	public static final int daughter = 3;
	public static final String fathersname = "John";
	public static final String mothersname = "Jane";
	public static final String sonsname = "James";
	public static final String daughtersname = "Jenny";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();							//메뉴	
		int number = selectNumber() -1;		//번호선택
		printName(number);					//이름출력
	}
		
	public static void showMenu() {	
		System.out.println("#Printhing a Name");
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");
		System.out.print("-> ");	
	}
	
	public static int selectNumber() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		return num;
	}
	
	public static void printName(int a) {
		if(a == father) {
			System.out.println(fathersname);
		} else if(a == mother) {
			System.out.println(mothersname);
		} else if(a == son) {
			System.out.println(sonsname);
		} else if(a == daughter) {
			System.out.println(daughtersname);
		} 
	}
}

