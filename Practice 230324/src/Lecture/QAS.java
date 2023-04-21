package Lecture;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QAS {
//면접단골문제 queue = FIFO
//			stack = FILO
	public static void main(String[] args) {
		Queue<String> name = new LinkedList<String>();
		name.offer("kim");
		System.out.println(name);
		name.offer("lee");
		System.out.println(name);
		System.out.println(name.poll());
		System.out.println(name.poll());
		System.out.println(name);
		
		System.out.println();
		
		Stack<String> stack = new Stack<String>();
		stack.add("kim");
		System.out.println(stack);
		stack.add("lee");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}
