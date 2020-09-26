package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2644 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int m = Integer.parseInt(br.readLine());

		int[][] arr = new int[num + 1][num + 1];
		int x = 0;
		int y = 0;
		for (int i = 0; i < m; i++) {

			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			arr[x][y] = 1;
			arr[y][x] = 1;

		}

		for (int i = 1; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {

				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}

	}
	
}
