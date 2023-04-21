package Lecture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("kim");
		name.add("lee");
		name.add("john");
		
		System.out.println(name);			//배열 출력
		System.out.println(name.size());	//배열의 크기
		System.out.println(name.get(2));	//0..1..2번째 변수 출력
		
		name.remove(1);						//0..1번째 변수 삭제 *List의 크기가 줄어듦 2번째가 1번째 됨
		System.out.println(name);			//배열 출력
		
		name.set(1,  "park");				//0..1번째 변수에 park 입력(john 삭제)
		System.out.println(name);			//배열 출력
		System.out.println(name.size());	//배열의 크기
		
		name.add("lee");					//마지막에 lee변수 입력
		System.out.println(name);			//배열 출력
		
		Collections.sort(name);				//오름차순 정렬
		System.out.println(name);
		
		Collections.reverse(name);			//내림차순 정렬
		System.out.println(name);
	}

}

//List는 배열의 크기 가변적, 중복허용