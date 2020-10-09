package beakjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class test5 {
	public static void main(String[] args) {

		
		System.out.println((int)'(');
		System.out.println((int)')');
		
		Stack<Integer> stk = new Stack<Integer>();
		stk.add(1);
		stk.add(2);
		System.out.println(stk.peek());
	}//main
}
