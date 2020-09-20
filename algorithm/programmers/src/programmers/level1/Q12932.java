package programmers.level1;

import java.util.Arrays;

public class Q12932 {

	public static void main(String[] args) {
		int[] result = solution(10000);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] solution(long n) {

		return Arrays
				.stream(new String(new StringBuilder(Long.toString(n)).reverse()).split(""))
				.mapToInt(Integer::parseInt).toArray();
	}

}
