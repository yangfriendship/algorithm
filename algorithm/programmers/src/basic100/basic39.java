package basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//123 더하기
//9095
//입출력 부분 미완성
public class basic39 {

	// f(n) = f(n-1) + f(n-2) + f(n-3) ;
	public static int solve(int num) {
		if (num == 1)
			return 1;
		if (num == 2)
			return 2;
		if (num == 3)
			return 4;

		return solve(num - 1) + solve(num - 2) + solve(num - 3);

	}

	public static void main(String[] args) throws IOException {
		String input = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = br.read();
		input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);

		for (int i = 0; i < t; i++) {
			int num = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(solve(num)));

		}

		bw.close();

	}

}
