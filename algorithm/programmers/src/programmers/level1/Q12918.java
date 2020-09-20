package programmers.level1;

public class Q12918 {

	public static void main(String[] args) {
		System.out.println(solution("1234a"));
	}

	public static boolean solution(String s) {
		if ((s.length() == 4 || s.length() == 6 )&& s.replaceAll("[0-9]", "").isEmpty()) {
			return true;
		}

		return false;
	}

}
