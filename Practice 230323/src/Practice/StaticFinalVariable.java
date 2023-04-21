package Practice;

public class StaticFinalVariable {
	//final : 고정시켜놓는 상수값 ex 파이=3.14
	public static final int johnsAge = 37;
	public static final int katesAge = 55;
	public static final int mikesAge = 31;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAge(mikesAge);
	}

	public static void printAge(int personsAge) {
		System.out.println("Age : " + personsAge);
	}
	
}
