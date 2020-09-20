package programmers.level1;

import java.util.Arrays;

public class Q42748 {

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		int[] answer = solution(array, commands);

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}

	public static int[] solution(int[] array, int[][] commands) {

		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int value = solve2(array, commands[i][0], commands[i][1], commands[i][2]);
			answer[i] = value;
		}
		return answer;
	}

	public static int solve2(int[] array, int n, int m, int k) {

		int[] temp = new int[m - n + 1];
		int cnt = 0;
		for (int i = n - 1; i < m; i++) {

			temp[cnt] = array[i];
			cnt++;
		}
		Arrays.sort(temp);

		return temp[k - 1];
	}

}
