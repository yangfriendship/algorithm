package prm;

public class Q2 {

	public static void main(String[] args) {

	}

	class Solution {
		public String solution(String s) {
			String answer = "";

			String[] list = s.split(" ");

			for (int i = 0; i < list.length; i++) {
				char[] c = list[i].toCharArray();

				for (int j = 0; j < c.length; j++) {

					if (j % 2 == 0) {
						c[j] = Character.toUpperCase(c[j]);
					} else if (j % 2 != 0) {
						c[j] = Character.toLowerCase(c[j]);
					}
				}
				list[i] = new String(c);
			}

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < list.length; i++) {
				sb.append(list[i]);
				if (i < list.length - 1) {
					sb.append(" ");
				}
			}
			answer = new String(sb);

			return answer;
		}
	}

}
