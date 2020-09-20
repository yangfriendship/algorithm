package programmers.level1;

public class Q12922 {

	public static void main(String[] args) {

	}

	public static String solution(int n) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {

			if (i % 2 == 0) {
				sb.append("¼ö");
			} else {
				sb.append("¹Ú");
			}

		}

		return new String(sb);
	}

}
