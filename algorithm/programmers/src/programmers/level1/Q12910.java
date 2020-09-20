package programmers.level1;

import java.util.Arrays;

public class Q12910 {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;
		int[] result = solution(arr, divisor);
		for (int i = 0; i < result.length; i++) {

			System.out.printf("%d ", result[i]);
		}

	}

	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		int[] temp = new int[arr.length];
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % divisor == 0) {
				temp[cnt] = arr[i];
				cnt++;
			}
		}
		if (cnt == 0) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}

		answer = new int[cnt];

		for (int i = 0; i < answer.length; i++) {

			answer[i] = temp[i];
		}

		Arrays.sort(answer);

		return answer;
	}
}
