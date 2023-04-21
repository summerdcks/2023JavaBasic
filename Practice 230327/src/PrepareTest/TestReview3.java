package PrepareTest;

public class TestReview3 {

	public static void main(String[] args) {
		String text = "hello, my name is John";
		String text2 = "hello yellow bingo ongoing orange mango";
		System.out.println(text);
		System.out.println(text.substring(0, 5));	//0~4까지 자름 5전까지
		System.out.println(text.substring(10));
		System.out.println(text.substring(text.indexOf("y")));
		System.out.println(text.substring(text.indexOf("y"), text.indexOf("s")));
		System.out.println(text.substring(text.lastIndexOf("o")));
	}

}
