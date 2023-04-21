package DailyTest0327;
import java.util.ArrayList;
import java.util.Scanner;
public class testewst {

//		1.  getRockPaperScissors() 함수를 선언하고 랜덤 함수를 통해 3, 5, 7를 return 받는다.[2점]ㅇ
//				2. main() 함수에 Integer형 arraylist인 mine, computer를 선언한다.[2점]ㅇ
//				3. SCISSORS는 3, ROCK은 5 PAPER는 7로 정의하고 변하지 않는 전역 변수 선언[1점]ㅇ
//				4. 컴퓨터(getRockPaperScissors())와 사용자가 겨뤄서 이길 때까지 무제한 수행되는 반복문 작성[2점]ㅇ
//				5. 이기는 조건은 일반적인 가위바위보와 동일하며 3번 비기면 사용자가 진것으로 간주하여 종료함[2점]
//				6. 사용자는 nextInt()로 0,1,2만 낼 수 있고 전역변수의 것과 동일하며 조건문에서 전역변수를 활용해야 함[2점]ㅇ
//				7. 매회차마다 사용자의 것은 mine에 컴퓨터의 것은 computer에 저장함[2점]
//				8. 게임이 종료되면 history를 integer로 보여줌[2점]
		
	public static final int SCISSORS = 3;
	public static final int ROCK = 5;
	public static final int PAPER = 7;
		
	public static void main(String[] args) {
		
		ArrayList<Integer> mine = new ArrayList<Integer>();
		ArrayList<Integer> computer = new ArrayList<Integer>();
			
		
		int com = getRockPaperScissors();
		computer.add(com);
			
		
		
		Scanner scanner = new Scanner(System.in);
		int aa = scanner.nextInt();
		
		if (aa == 0) {
			mine.add(SCISSORS);
		} else if (aa == 1) {
			mine.add(ROCK);
		} else if (aa == 2) {
			mine.add(PAPER);
		} else {
			System.out.println("0, 1, 2 중 재입력하시오");
		}
		
		
		while (true) {
			if (mine.get(0) != computer.get(0)) {
				break;
			} else {
			}
		}
					
		Iterator<Integer> iterator1 = mine.iterator();
		Iterator<Integer> iterator2 = computer.iterator();
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
			
				
}
		
		public static int getRockPaperScissors() {
			int num = (int)Math.random() * 10;
			while (true) {
				if (num == 3 || num == 5 || num == 7) {
					break;
				}
			}
			return num;
		}

}


