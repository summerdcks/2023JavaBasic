package Practice;
//1.Parents는 이미 구현되어 있어서 엑박이 안뜸. extends하면 됨
public class OverridePractice extends Parents{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridePractice main = new OverridePractice();
		main.showName();
	}

	@Override
	public void showName() {
		// TODO Auto-generated method stub
		//2. (main안에서 우클릭 Source - Override)
		//3. super = 부모클래스의 showName 불러오기
		super.showName();						//I am a Parents
		System.out.println("I am a child");		//I am a Child 순서대로 출력
		
			
//		System.out.println("I am a child");		//I am a Child 
//		super.showName();						//I am a Parents 순서대로 출력
	}

}
