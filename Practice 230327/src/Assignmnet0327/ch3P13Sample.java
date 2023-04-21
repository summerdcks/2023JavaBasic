package Assignmnet0327;

import java.util.Scanner;

public class ch3P13Sample {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println();
      String sen = scan.nextLine();
      String word = scan.nextLine();
      int min = 1000;
      int count = 0;
      
      for (int i = 0; i < word.length(); i++) { // 단어의 길이만큼 루프
         count = 0;
         int cc = 0;
         char ch = word.charAt(i); // 단어의 i번째 알파벳

         for (int j = 0; j < sen.length(); j++) { // 문장의 길이만큼 루프
            if (sen.charAt(j) == ch) { // 단어의 i번째 알파벳과 문장의 j번째 알파벳 비교
               count++;
            }
         }
         
         int num = 0;
         
         for (int p = 0; p < word.length(); p++) {
            if (ch == word.charAt(p)) {
               num++;
            }
         }
         count /= num; // 단어 내에 같은 알파벳이 존재한 개수만큼 count를 나눔
         
         
         if (count < min) {
            min = count; // 문장 내에서 사용될 수 있는 알파벳의 개수의 최솟값
         }
      }
      System.out.println(count);
   }

}