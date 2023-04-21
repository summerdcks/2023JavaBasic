package PracticeS;

public class TestPractice {
	int time;
	int classNumber;
	
	public TestPractice() {
		this(20, 1);
	}
	
	public TestPractice(int time, int classNumber) {
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
	
	private void showInformation() {
		System.out.println(time + "," + classNumber);
	}
}
