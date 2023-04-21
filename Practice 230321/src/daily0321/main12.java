package daily0321;

import java.util.Scanner;

public class main12 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) { // 5줄 출력
            for(int j=0; j<=i; j++) { // 첫번째=0, 각줄마다 10씩 늘어나게
               if(j==0) {
            	   System.out.print("0");
               }
               else {
            	   System.out.print("10");
               }
            }
         System.out.println();
        }
    }
}
//public static void main(String[] args) {
//	
//	int line = 7;
//	
//	for(int i = 0; i < 5; i++) {
//		for(int h=0; h <i+1; h++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//}