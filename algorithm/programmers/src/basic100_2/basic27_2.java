package basic100_2;

public class basic27_2 {

	public static void main(String[] args) {

		int n = 5;
		int max = n * n;
		int f = n;

		int[][] arr = new int[n][n];
		int x = 0;
		int y = 0;
		int index = 1;

		for (int i = 0; i < 2 * n - 1; i++) {

			switch (i % 4) {
			case 0: // 오른쪽으로 간다
				for (int j = 0; j < f; j++) {
					arr[y][x] = index;
					System.out.println(arr[y][x] + " " + x + " " + y);
					x++;
					index++;
				}
				f--;
				x--;
				y++;
				break;

			case 1: // 아래쪽
				for (int j = 0; j < f; j++) {
					arr[y][x] = index;
					System.out.println(arr[y][x] + " " + x + " " + y);
					y++;
					index++;
				}
				y--;
				x--;

				break;

			case 2:
				for (int j = 0; j < f; j++) {
					arr[y][x] = index;
					System.out.println(arr[y][x] + " " + x + " " + y);
					x--;
					index++;
				}
				x++;
				y--;
				f--;
				break;
			case 3:
				for (int j = 0; j < f; j++) {
					arr[y][x] = index;
					System.out.println(arr[y][x] + " " + x + " " + y);
					y--;
					index++;
				}
				x++;
				y++;
				break;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
