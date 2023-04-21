package Practice;
//1껍데기인 interfacePractice를 가져와서 implements해라
public class ImplementsPractice implements InterfacePractice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementsPractice main = new ImplementsPractice();
		main.showName();
		main.showAge();

	
	
	}

	@Override
	public void showName() {
		// TODO Auto-generated method stub
		System.out.println("최민재");		//2내용물 채워넣기
	}

	@Override
	public void showAge() {
		// TODO Auto-generated method stub
		System.out.println("비밀");		//2내용물 채워넣기
	}
}
