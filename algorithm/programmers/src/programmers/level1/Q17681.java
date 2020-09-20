package programmers.level1;

public class Q17681 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		solution(n, arr1, arr2);
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {

		String[][] map1 = new String[n][n];
		String[][] map2 = new String[n][n];

		for (int i = 0; i < map1.length; i++) {
			String bin = toBinary(arr1[i], n);
			for (int j = 0; j < map1.length; j++) {

				if (bin.charAt(j) == '#') {
					map1[i][j] = "#";
				} else {
					map1[i][j] = " ";
				}
			}
		} // arr1
		for (int i = 0; i < map2.length; i++) {
			String bin = toBinary(arr2[i], n);
			for (int j = 0; j < map2.length; j++) {

				if (bin.charAt(j) == '#') {
					map2[i][j] = "#";
				} else {
					map2[i][j] = " ";
				}
			}

		} // arr2

		for (int i = 0; i < map2.length; i++) {

			for (int j = 0; j < map2.length; j++) {
				System.out.printf("%2s", map1[i][j]);
			}
			System.out.println();
		}
		System.out.println("=-----------------");
		for (int i = 0; i < map2.length; i++) {

			for (int j = 0; j < map2.length; j++) {
				System.out.printf("%2s", map2[i][j]);
			}
			System.out.println();
		}

		String[] result = new String[n];
		for (int i = 0; i < map2.length; i++) {
			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < result.length; j++) {

				if (map1[i][j].equals("#") || map2[i][j].equals("#")) {
					sb.append("#");
				} else {
					sb.append(" ");
				}
			}
			result[i] = new String(sb);

		}
		System.out.println();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		return result;
	}

	public static String toBinary(int a, int n) {

		StringBuilder sb = new StringBuilder();
		int temp = 0;
		while (a != 0) {
			sb.append(a % 2);
			a /= 2;
		}

		String bin = new String(sb);

		for (int i = 0; i < n - bin.length(); i++) {
			sb.append(" ");
		}
		sb.reverse();
		bin = new String(sb).replace("1", "#");
		return bin;
	}
}
