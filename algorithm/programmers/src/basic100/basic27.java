package basic100;

//������
public class basic27 {

	public static void printResult(int[][] result) {

		for (int i = 0; i < result.length; i++) {

			for (int j = 0; j < result.length; j++) {
				System.out.printf("%3d", result[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int input = 5;
		int num = 1;
		int x = 0;
		int y = 0;
		int f = input;

		int[][] result = new int[input][input];

		for (int i = 0; i < 2 * input - 1; i++) {

			switch (i % 4) {
			case 0: // right
				for (int j = 0; j < f-1; j++) {
					result[y][x] = num;

					num++;
					x++;
				}
				x--;
				y++;
				f--;
				break;

			case 1: //under
				for (int j = 0; j < f-1; j++) {
					result[y][x] = num;

					num++;
					y++;
				}
				
				x--;
				y--;
				break;
			case 2:
				for (int j = 0; j < f-1; j++) {
					result[y][x] = num;

					num++;
					y--;
				}
				
				x--;
				y--;
				break;
			case 3:
				break;

			}

		}

		printResult(result);

	}

}
