package beakjoon;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class test {


	public static void main(String[] args) {

		
		Deque<Integer> deque = new LinkedList<Integer>();
		
		deque.push(1);
		deque.push(2);
		deque.push(3);
		
		System.out.println(deque.getFirst());
		System.out.println(deque.toString());
		
		
	}
}