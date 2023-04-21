package daily0321;

public class Leg {								//Class 생성
	public void Move() {						//Method1 동작, 명령어, return data는 void==없음.
		System.out.println("Move 1 step");
	}
	public void Fold() {						//Method2
		System.out.println("Folded");
	}
	public void Test() {
		System.out.println("test");
		Main main = new Main();
		main.showName3();
		main.showName4();						//보여야됨
	}
}
