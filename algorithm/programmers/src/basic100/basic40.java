package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//1만들기
//1. 3으로 나누어 떨어지면, 3으로 나눈다.
//2. 2로 나누어 떨어지면 , 2로 나눈다.
//3. -1

//런타임 에러만 해결 , 답은 잘 나온다
public class basic40 {

	static int[] results = new int[1000000];
	static int a, b, c;

	public static int min(int a, int b, int c) {

		return a < b ? a : b < c ? b : c;
	}

	public static void solve(int num) {

		for (int i = 2; i <= num; i++) {
			a = 99999;
			b = 99999;
			c = 99999; // 최솟값 초기화

			if (i % 3 == 0) {
				a = results[i / 3];
			}
			if (i % 2 == 0) {
				b = results[i / 2];
			}
			c = results[i - 1];

			results[i] = min(a, b, c) + 1;
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int num = Integer.parseInt(st.nextToken());
		solve(num);

		System.out.println(results[num]);

		br.close();

	}

}
