package DailyTest230324;

//1. Random이라는 이름의 인터페이스를 생성하고 아래의 내용을 구현함[1점]
//1) getRandom의 이름을 가지며, int를 반환하는 함수 생성[1점]
//2) isValid의 이름을 가지며 boolean을 반환하는 함수 생성[1점]
//
//2. Main 클래스는 Random 인터페이스를 상속받아 구현함[1점]
//1) Random 인터페이스의 함수들을 모두 override함[1점]
//2) getRandom 함수는 Math.Random() 1이상의 양의 정수값을 리턴함[2점]
//3) isValid 함수는 1 ~ 45 숫자일 때만 true를 리턴함[2점]
//4) main 함수에서는 getRandom과 isValid 함수를 활용하여 1 ~ 45 범위의 랜덤 숫자 6개를 출력함[6점]
public class TestReview implements Random {

	public static void main(String[] args) {
		int cnt = 0;
		Main main = new Main();
		while (true) {
			int n = main.getRandom();
			boolean check = main.isValid(n);
			if (check == true) {
				System.out.println(n);
				cnt++;
			}
			if (cnt == 6) {
				break;
			}
		}
	}

	@Override
	public int getRandom() {
		int ret = 0;
		while(true) {
			int n = (int)(Math.random() * 100);
			if (n > 0) {
				ret = n;
				break;
			}
		}
		return ret;
	}

	@Override
	public boolean isValid(int num) {
		boolean ret = false;
		if (num >= 1 && num <= 45) {
			ret = true;
		}
		return ret;
	}

}
