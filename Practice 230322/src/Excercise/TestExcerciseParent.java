package Excercise;

public class TestExcerciseParent {
	int age;
	public TestExcerciseParent() {
		this(20);
	}
	
	public TestExcerciseParent(int age) {
		this.age = age;
	}
	
	public void showInformation() {
		System.out.println(age);
	}
}
