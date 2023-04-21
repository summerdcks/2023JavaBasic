package daily0321;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Hello,hi,";
		System.out.println(text);						//그대로 출력
		System.out.println(text.length());				//문자개수
		System.out.println(text.charAt(2));				//0..1..2번째 문자
		
		char[] c = text.toCharArray();					//문장을 문자열 배열로 저장 *toCharArray
		System.out.println(c[0]);						//문자열의 0번째 문자
		
		System.out.println(text.replace("H", "h"));		//H를 h로 대체
		
		String[] t = text.split(",");					//text를 ,기준으로 나눠 *split
		System.out.println(t[0]);						//0번째 출력 Hello
		System.out.println(t[1]);						//1번째 출력 hi
		System.out.println(t[2]);						//2번째는 존재하지 않음
	}
}
