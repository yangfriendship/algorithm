package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//Ä¡Å² ÄíÆù 
//nÀåÀÇ ÄíÆù 
//baekjoon 1673
public class basic38 {

	public static void doFunc() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";

		while ((input = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(input);
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int result = n;

			while (n / k != 0) {

				result += n / k;

				n = n / k + n % k;
			}

			System.out.println(result);

		}
	}

	public static void main(String[] args) throws IOException {

		doFunc();

	}
}
