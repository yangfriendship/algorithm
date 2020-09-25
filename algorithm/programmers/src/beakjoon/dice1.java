package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dice1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];

		dfs(arr, 0, n);
	}

	public static void dfs(int[] arr, int depth, int n) {

		if (depth == n) {
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.printf("%d ", arr[i]);
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= 6; i++) {
			arr[depth] = i;
			dfs(arr, depth + 1, n);
		}

	}

}
