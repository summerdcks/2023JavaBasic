package Practice;

public class ReturningAValue {

	public static void main(String[] args) {
		int sum;
		sum = addOperation(5, 12);
		System.out.println(sum);
	}

	public static int addOperation(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
}
