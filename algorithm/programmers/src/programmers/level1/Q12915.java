package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Q12915 {

	public static void main(String[] args) {

		String[] strings = { "abce", "abcd", "cdx" };
		int n = 2;
		for (int i = 0; i < strings.length; i++) {
			System.out.printf("%s ", strings[i]);
		}
		System.out.println();

		solution(strings, n);

		for (int i = 0; i < strings.length; i++) {
			System.out.printf("%s ", strings[i]);
		}
	}

	public static String[] solution(String[] strings, int n) {

		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				if (o1.charAt(n) - o2.charAt(n) == 0) {
					return o1.compareTo(o2);
				}

				return o1.charAt(n) - o2.charAt(n);
			}
		});

		return strings;
	}

}
