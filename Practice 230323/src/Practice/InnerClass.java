package Practice;
import java.util.Scanner;

public class InnerClass {

	public static void main(String[] args) {		
		PrintClass.printInteger();
		PrintClass.printAdd();		
	}
}


class PrintClass {
	static int a, b, n;
		
	public PrintClass(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}
	
	public static void printInteger() {
		System.out.println(n);
	}
	
	public static void printAdd() {
		int sum;
		sum = a + b;
		System.out.println(sum);
	}
}