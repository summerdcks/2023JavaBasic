package Excercise;

public class TestExcercise {
	int time;
	int classNumber;
	
	public TestExcercise() {
		this(20, 1);
	}
	
	public TestExcercise(int time, int classNumber) {
		this.time = time;
		this.classNumber = classNumber;
	}
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	
	protected void showInformation() {
		System.out.println(time + "," + classNumber);
	}

}
