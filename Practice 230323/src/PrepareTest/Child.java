package PrepareTest;

public class Child extends Parents {

	public Child(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Child(String name, int korean, int english, int math) {
		// TODO Auto-generated constructor stub
		super(name, korean, english, math);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child("철수", 90, 70, 80);
		c.showInformation();
	}

	@Override
	public void showInformation() {
		// TODO Auto-generated method stub
		super.showInformation();
		System.out.println((super.korean + super.english + super.math)/3);
	}

}
