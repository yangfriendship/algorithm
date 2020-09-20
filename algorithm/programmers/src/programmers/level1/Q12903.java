package programmers.level1;

public class Q12903 {

	public static void main(String[] args) {

		String str1 = "abcde";
		solution(str1);
		String str2 = "abde";
		System.out.println(solution(str1));
		System.out.println(solution(str2));
	}

	public static String solution(String s) {
		String answer = "";

		if (s.length() % 2 == 0) {
			answer = s.substring(s.length() / 2-1, s.length() / 2 + 1);
		} else {
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		}
		return answer;
	}

}
