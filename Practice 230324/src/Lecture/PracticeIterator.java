package Lecture;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class PracticeIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("lee");
		list.add("park");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------");
		
		for (String name : list) {						//파이썬
			System.out.println(name);
		}

		System.out.println("---------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
