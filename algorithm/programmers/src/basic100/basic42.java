package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//1만들기
//1. 3으로 나누어 떨어지면, 3으로 나눈다.
//2. 2로 나누어 떨어지면 , 2로 나눈다.
//3. -1

//런타임 에러만 해결 , 답은 잘 나온다
public class basic42 {

	static int num;

	public static int min(int a, int b, int c) {

		return a < b ? a : b < c ? b : c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[][] list = new int[num][3];

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < 3; j++) {

				list[i][j] = sc.nextInt();
			}
		}

		int[][] dp = new int[num + 1][3];
		dp[0][0] = list[0][0];
		dp[0][1] = list[0][1];
		dp[0][2] = list[0][2];
		for (int i = 1; i < num; i++) {

			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + list[i][0];
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + list[i][1];
			dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][0]) + list[i][2];
		}

		System.out.println(min(dp[num - 1][0], dp[num - 1][1], dp[num - 1][2]));

	}

}
