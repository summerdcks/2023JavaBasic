package DICE;
import java.util.Scanner;

public class DiceR {
   int n, m;
   int num = 0;
   String result = "";
   
   public DiceR() {
      this(0, 0);
   }
   
   public DiceR(int n, int m) {
      this.n = n;
      this.m = m;
   }
   
   public void printResult(int n, int m, String result) {
      if(n == 0 && m == 0) { // 주사위를 전부 굴렸고 sum과 동일할 경우
         System.out.println("(" + result.substring(2) + ")");
      }
      else if (n != 0) { // 주사위가 아직 남아있을 경우
         //주사위를 굴리며 그 굴린 값을 string으로 저장하는 코드
         for (int i = 1; i <= 6; i++) {
            printResult(n - 1, m - i, result + ", " + i);
         }
      }
      
   }
}