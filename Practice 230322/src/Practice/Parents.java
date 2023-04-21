package Practice;

public class Parents {
	int age;
	//*setter getter(우클릭-source-generate setters and getters)
	
	
	
	//생성자 - 인자가 없음. optional. 없어도 됨.
//	public Parents() {
//		
//	}
	
	
	
	//1. 생성자. 인자없이 호출. 내용물이 없음
	public Parents() {
		this(20);	//2. 생성자를 호출하라는 뜻 20을 int로 받아줄 생성자는 아래의 int age
	}
	
	
	//*이게 자동호출됨
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	//*


	//생성자 - 인자 age
	public Parents(int age) {			//3. main에 얘가 호출됨
		//age = age;
		this.age = age;
		//전역변수 age = parameter로 들어온 age
	}
	
	
	
	
	public void showName() {
		System.out.println("I am a parent");
	}

	public void showAge() {
		System.out.println("I am "+ age + "years old.");
	}
}
