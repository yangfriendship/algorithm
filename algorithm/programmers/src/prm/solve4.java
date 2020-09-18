package prm;

public class solve4 {

	public static void main(String[] args) {

		String str1 = "Ppy";
		boolean result1 = solution(str1);
		System.out.println(result1);
	}

	public static boolean solution(String s) {
		boolean answer = true;

		String str = s.replaceAll("[^pyPY]", "").toLowerCase();

		if (str.length() % 2 != 0) {
			return false;
		} else if (str.length() == 0) {
			return true;
		} else {

			int cnt = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) - '0' == 64) {
					cnt++;
				}
			}

			if (str.length() / 2 == cnt) {
				return true;
			} else {
				return false;
			}
		}
	}

}
