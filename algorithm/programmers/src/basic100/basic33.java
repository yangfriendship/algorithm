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

		if (map[x][y] != 1) { // �÷� ��ĥ ���
			map[x][y] = COLOR;
		}

		// ���� ��ȯ ����Լ�
		if (x + 1 <= map.length - 1 && map[x + 1][y] != 1 && map[x + 1][y] != COLOR) { // ������
			colorPainting(x + 1, y);
		}
		if (x - 1 >= 0 && map[x - 1][y] != 1 && map[x - 1][y] != COLOR) { // ����
			colorPainting(x - 1, y);
		}
		if (y + 1 <= map.length - 1 && map[x][y + 1] != 1 && map[x][y + 1] != COLOR) { // ����
			colorPainting(x, y + 1);
		}
		if (y - 1 >= 0 && map[x][y - 1] != 1 && map[x][y - 1] != COLOR) { // �Ʒ���
			colorPainting(x, y - 1);
		}

	}

}
