package PracticeS;
//import Excercise.TestExcercise;
import Excercise.TestExcerciseParent;
//public class Main implements TestInterface{
public class Main extends TestExcerciseParent{
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.showInformation();

//		TestPractice tp = new TestPractice();
//		//tp.showInformation();						//privated 같은 클래스 내에서만 부를 수 있음
//		
//		TestExcercise te = new TestExcercise();
//		//te.showInformation();						//protected 같은 패키지 내에서만 부를 수 있음
//		
//		Main main = new Main();						//static이 없으므로 객체생성
//		main.showName();
//	}
//
//	@Override
//	public void showName() {
//		// TODO Auto-generated method stub
//		System.out.println("I am a child");
	}

	@Override
	public void showInformation() {
		// TODO Auto-generated method stub
		super.showInformation();				//super:부모호출
		System.out.println("3");
	}

}

