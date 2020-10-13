package beakjoon;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class test2 {

	public static void main(String[] args) {

		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		System.out.println(que);
		que.poll();
		System.out.println(que);
		
	}
}
