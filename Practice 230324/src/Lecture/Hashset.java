package Lecture;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer> name = new HashSet<Integer>();
		name.add(1);
		System.out.println(name);
		name.add(2);
		System.out.println(name);
		name.add(1);
		System.out.println(name);				//set은 중복 안됨
	}

}
