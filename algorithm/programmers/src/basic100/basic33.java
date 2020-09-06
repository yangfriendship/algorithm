package basic100;

public class basic33 {

	public static int[][] map = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0 }, { 0, 0, 1, 1, 0 }, { 0, 0, 0, 0, 1 },
			{ 0, 0, 1, 0, 0 } };

	public static final int SIZE = 5;
	public static final int COLOR = 2;

	public static void printMap() {

		for (int i = 0; i < map.length; i++) {

			for (int j = 0; j < map.length; j++) {
				System.out.printf("%2d", map[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		printMap();

		colorPainting(0, 0);
		System.out.println();
		printMap();

	}

	private static void colorPainting(int x, int y) {

		if (map[x][y] != 1) { // 컬러 색칠 기능
			map[x][y] = COLOR;
		}

		// 방향 전환 재귀함수
		if (x + 1 <= map.length - 1 && map[x + 1][y] != 1 && map[x + 1][y] != COLOR) { // 오른쪽
			colorPainting(x + 1, y);
		}
		if (x - 1 >= 0 && map[x - 1][y] != 1 && map[x - 1][y] != COLOR) { // 왼쪽
			colorPainting(x - 1, y);
		}
		if (y + 1 <= map.length - 1 && map[x][y + 1] != 1 && map[x][y + 1] != COLOR) { // 위로
			colorPainting(x, y + 1);
		}
		if (y - 1 >= 0 && map[x][y - 1] != 1 && map[x][y - 1] != COLOR) { // 아래로
			colorPainting(x, y - 1);
		}

	}

}
