package beakjoon;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class test5 {
	public static void main(String[] args) {

		Deque<Integer> que = new LinkedList<Integer>();
		que.add(0);
		que.addLast(1);
		que.addLast(1);
		que.addLast(1);
		que.add(2);
		que.addFirst(9);
		que.pollFirst();
		System.out.println(que);
	}//main
}
