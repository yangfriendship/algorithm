package basic100_2;

public class basic37_2 {

	public static int[] houseHold = new int[25];
	public static int apartCnt = 0;
	public static int apartIndex = 0;
	public static int[][] target = { { 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 },
			{ 1, 1, 0, 1, 1 } };

	public static void main(String[] args) {

		for (int i = 0; i < target.length; i++) {

			for (int j = 0; j < target.length; j++) {

				if (target[i][j] == 1) {

					doFunc(i, j);
					apartIndex++;

				}

			}

		}

		for (int i = 0; i < houseHold.length; i++) {
			if (houseHold[i] == 0)
				break;
			System.out.println(houseHold[i]);
		}

	}

	private static void doFunc(int y, int x) {

		target[y][x] = 0;
		houseHold[apartIndex]++;

		if (x + 1 < target.length && target[y][x + 1] == 1) {
			doFunc(y, x + 1);
		}
		if (x - 1 >= 0 && target[y][x - 1] == 1) {
			doFunc(y, x - 1);
		}
		// yรเ

		if (y + 1 < target.length && target[y + 1][x] == 1) {
			doFunc(y + 1, x);
		}
		if (y - 1 >= 0 && target[y - 1][x] == 1) {
			doFunc(y - 1, x);
		}

	}
}
