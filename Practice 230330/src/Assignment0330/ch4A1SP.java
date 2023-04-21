package Assignment0330;

import java.util.Scanner;
//공부할것
public class ch4A1SP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();

        int[] dice = new int[n]; // 각 주사위의 값 저장을 위한 배열
        rollDice(0, dice, m); // 첫번째 주사위부터 시작하여 재귀적으로 주사위를 던지며 경우의 수를 찾는다.
    }

    private static void rollDice(int index, int[] dice, int m) {
        if (index == dice.length) { // 마지막 주사위를 던졌을 때
            int sum = 0;
            for (int value : dice) {
                sum += value;
            }
            if (sum == m) { // 주사위 합이 m과 같으면 결과를 출력한다.
                for (int value : dice) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            return;
        }

        // 현재 주사위를 던지는 for 루프
        for (int i = 1; i <= 6; i++) {
            dice[index] = i;
            rollDice(index + 1, dice, m);
        }
    }
}