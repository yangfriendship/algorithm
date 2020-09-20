package programmers.level1;

import java.util.Stack;

public class Q12906 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 1, 3, 3, 0, 1, 1 }; // 1301
		int[] arr2 = { 4, 4, 4, 3, 3 }; // 4,3

		arr1 = solution(arr1);
		arr2 = solution(arr2);

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}

	}

	public static int[] solution(int[] arr) {
		int[] answer = {};

		boolean[] check = new boolean[10];
		Stack<Integer> stk = new Stack<Integer>();
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {

			if (stk.isEmpty()) {
				stk.add(arr[i]);
			} else if (stk.lastElement() != arr[i]) {
				stk.add(arr[i]);
			}
		}

		answer = new int[stk.size()];

		for (int i = stk.size() - 1; i >= 0; i--) {
			answer[i] = stk.pop();
		}
		return answer;
	}

}
