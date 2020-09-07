package basic100_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*3	R	G	B	
 *	26	40	83
 * 	49	60	57
 * 	13	89	99
 * 
 * */


public class basic42_2 {

	public static int min(int a, int b, int c) {

		return Math.min(a, Math.min(b, c));
	}

	public static void main(String[] args) throws IOException {

		int num = 3;
		int[][] input = {
				{26,40,83}
				,{49,60,57}
				,{13,89,99}
		};	//int [][] input = new int[3][num];
		
		int[][] dp = new int[3][num];

		dp[0][0] = input[0][0];
		dp[1][0] = input[1][0];
		dp[2][0] = input[2][0];
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 1; j < 3; j++) {
				
				dp[0][j] = input[0][j] + Math.min(dp[1][j-1], dp[2][j-1]);
				dp[1][j] = input[0][j] + Math.min(dp[0][j-1], dp[2][j-1]);
				dp[2][j] = input[0][j] + Math.min(dp[1][j-1], dp[0][j-1]);
				
			}
			
		}

		System.out.println(min(dp[0][num-1], dp[1][num-1], dp[2][num-1]));
		
		
	}
}
