package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//index = 	x/2+1
public class beakjoon_1188_2 {

	// 사람 5명 , 소세지 3개라면
	// 3/5를 n번하면 3개가 되는가?
	// 소세지 2 사람 6 답 4
	// 3분의 1개씩 가져가겟다
	// 3분의 1 * n = 2

	public static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		} else {

			return gcd(b, a % b);
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int s = Integer.parseInt(st.nextToken()); // 3
		int num = Integer.parseInt(st.nextToken()); // 2
		int result = 0;

		if (s % num == 0) {
			System.out.println(0);
			return;
		}

		System.out.println(num - gcd(s, num));

	}
}
