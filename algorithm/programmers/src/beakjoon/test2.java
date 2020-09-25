package beakjoon;

import java.util.LinkedList;
import java.util.Queue;

public class test2 {

	public static void main(String[] args) {

		Queue<Integer> que = new LinkedList<Integer>();

		que.add(1);
		que.offer(2);

		System.out.println(que.add(3));
		System.out.println(que.offer(4));

	}
}
