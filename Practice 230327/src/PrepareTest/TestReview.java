package PrepareTest;
import java.util.ArrayList;
//1.  getRockPaperScissors() 함수를 선언하고 랜덤 함수를 통해 0, 1, 2를 return 받는다.[2점]
//2. main() 함수에 Integer형 arraylist인 mine, computer를 선언한다.[2점]
//3. SCISSORS는 0, ROCK은 1 PAPER는 2로 정의하고 변하지 않는 전역 변수 선언[1점]
//4. 컴퓨터(getRockPaperScissors())와 사용자가 겨뤄서 이길 때까지 무제한 수행되는 반복문 작성[2점]
//5. 이기는 조건은 일반적인 가위바위보와 동일하며 3번 비기면 사용자가 진것으로 간주하여 종료함[2점]
//6. 사용자는 nextInt()로 0,1,2만 낼 수 있고 전역변수의 것과 동일하며 조건문에서 전역변수를 활용해야 함[2점]
//7. 매회차마다 사용자의 것은 mine에 컴퓨터의 것은 computer에 저장함[2점]
//8. 게임이 종료되면 history를 integer로 보여줌[2점]
import java.util.Scanner;

public class TestReview {
	public static final int SCISSORS = 0;
	public static final int ROCK = 1;
	public static final int PAPER = 2;

	public static void main(String[] args) {
		ArrayList<Integer> mine = new ArrayList<Integer>();
		ArrayList<Integer> computer = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		int drawCount = 0;
		while (true) {
//			int myValue = scanner.nextInt();
			int myValue = getMyValue();
			if (myValue == -1) {
				continue;
			}
			
			
			int computerValue = getRockPaperScissors();
			//가위0 바위1 보2
			mine.add(myValue);
			computer.add(computerValue);
			
			if (myValue == SCISSORS) {
				if (computerValue == PAPER) {
					System.out.println("You win");
					break;
				} else if (computerValue == SCISSORS) {
					System.out.println("Draw");
					drawCount++;
				}
			} else if (myValue == ROCK) {
				if (computerValue == SCISSORS) {
					System.out.println("You win");
					break;
				} else if (computerValue == ROCK) {
					System.out.println("Draw");
					drawCount++;
				}
			} else if (myValue == PAPER) {
				if (computerValue == ROCK) {
					System.out.println("You win");
					break;
				} else if (computerValue == PAPER) {
					System.out.println("Draw");
					drawCount++;
				}
			} else {
				System.out.println("Try again");
			}
			
			if (drawCount == 3) {
				System.out.println("Lost! End!");
			}
		}
		System.out.println(mine);
		System.out.println(computer);
	}

	
	public static int getMyValue() {
		Scanner scanner = new Scanner(System.in);
		int ret = -1;
		try {
			ret = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("error! retry!");
		}
		System.out.println("return : " + ret);
		 return ret;
	}
	
	public static int getRockPaperScissors() {
		return (int)(Math.random()*3);	//return value : 0,1,2
	}
	
}
