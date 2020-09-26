package beakjoon;

import java.util.LinkedList;
import java.util.Queue;

public class test2 {

	public static void main(String[] args) {

		
		int[] arr = new int[10];
		System.out.println(arr[1]);
		test(arr);
		System.out.println(arr[1]);
		test(arr);

	}
	
	public static void test(int[] arr) {
		if(arr[1]==5) {
			System.out.println("5юс");
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 5;
		}
	}
}
