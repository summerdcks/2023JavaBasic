package daily0321;

import java.util.Scanner;

public class ch3P3 {
	public static void main(String[] args) {
		String typo = "가까나다라마바사아자차카타파하";
		
		// typo스트링의 글자수 만큼 list에 담아둡니다.
		for (int i = 0; i < typo.length(); i++) {
			char comVal = (char) (typo.charAt(i)-0xAC00);

			if (comVal >= 0 && comVal <= 11172){
				// 한글일경우 
				
					// 초성만 입력 했을 시엔 초성은 무시해서 List에 추가합니다.
					char uniVal = (char)comVal;

					// 유니코드 표에 맞추어 초성 중성 종성을 분리합니다..
					char cho = (char) ((((uniVal - (uniVal % 28)) / 28) / 21) + 0x1100);
					char jung = (char) ((((uniVal - (uniVal % 28)) / 28) % 21) + 0x1161);
					char jong = (char) ((uniVal % 28) + 0x11a7);

					if(cho!=4519){
						System.out.print(cho+" ");
					}
					if(jung!=4519){
						System.out.print(jung+" ");
					}
					if(jong!=4519){
						System.out.print(jong+" ");
					}
					System.out.println((int)cho);
			} else {
				// 한글이 아닐경우
				comVal = (char) (comVal+0xAC00);
				System.out.print(comVal+" ");
			}
		}
		for (int a = 4352; a <= 4370; a++) {
			System.out.println((char)a + " " +a);
		}
	}
}
		
		
