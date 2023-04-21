package Practice;

public class OverloadPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showName();
		showName("정수아");
		
		showAge();
		showAge(30);
	}

	public static void showName() {
		System.out.println("정수아");
	}
	//Overload
	public static void showName(String name) {	
		System.out.println(name);
	}
	
	public static void showAge() {
		System.out.println("20살");
	}
	//Overload
	public static void showAge(int age) {
		System.out.println(age+"살");
	}
}
