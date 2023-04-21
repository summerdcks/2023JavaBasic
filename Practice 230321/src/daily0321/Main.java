package daily0321;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arm arm1 = new Arm();
		arm1.showName();
		
		Leg leg1 = new Leg();
		Leg leg2 = new Leg();
		leg1.Move();					//실행
		leg2.Fold();					//실행
		
		//1st way
		Main main = new Main();
		main.showName();				//일단 객체를 생성한 뒤 호출해야함
		
		//2nd way
		showName2();					//그냥 호출해도 가능
		
	}
	private void showName() {					//private은 같은 클래스 내에서만 쓸 수 있음. 다른 클래스에선 안보임
		System.out.println("I am main");
	}	
	private static void showName2() {			//static 이미 메모리에 생성되어있음 호출만 하면 됨
		System.out.println("I am main2");		//static은 지양. 메모리 잡아먹음.
	}	
	public void showName3() {					//public이라 다른 클래스에서도 가능
		System.out.println("I am main3");
	}	
	protected void showName4() {				//protected는 같은 패키지 내에서 가능.
		System.out.println("I am main4");
	}
	
		
}

