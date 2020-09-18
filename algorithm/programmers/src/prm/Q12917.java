package prm;

import java.util.Arrays;

public class Q12917 {

	public static void main(String[] args) {

		System.out.println(solution("Zbcdefg"));
		;

	}

	public static String solution(String s) {
		String answer = "";
		char[] c = s.toCharArray();
		Arrays.sort(c);

		return new String(new StringBuilder().append(c).reverse());
	}

}
