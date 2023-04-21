package Practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Parents p = new Parents();
//		p.showAge();
		//p는 생성자. 객체를 생성할 때 들어갈 값을 정해줌.
		//I am 0years old.가 출력됨
		
		
		Parents p = new Parents(30);
		p.showAge();
		//I am 30years old.가 출력됨
		p.setAge(40);
		p.showAge();
		//setters getters로 40살 됨
	}

}
