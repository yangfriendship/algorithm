package beakjoon;

import java.util.Collections;
import java.util.Stack;

public class test5 {
	public static void main(String[] args) {

		Stack<Integer> stk = new Stack<Integer>();
		
		stk.add(2);
		stk.add(3);
		stk.add(1);
		stk.add(1);
		stk.add(7);
		System.out.println(stk);
		System.out.println(stk.peek());
		System.out.println(stk.peek());
		System.out.println(stk.peek());
	}//main
}
