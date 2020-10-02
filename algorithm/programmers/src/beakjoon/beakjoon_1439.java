package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakjoon_1439 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] arr = (br.readLine()).toCharArray();
		char temp = '5';
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != temp) {
				cnt++;
				temp = arr[i];
			}
		}
		System.out.println(cnt);
		if (cnt == 0) {
			System.out.println(1);
		} else if (cnt == 1) {
			System.out.println(0);
		} else {
			System.out.println(cnt - 2);
		}
	}
}
