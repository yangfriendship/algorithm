package basic100;

//12
//�� �簢��
public class basic12 {

	public static void main(String[] args) {

		int input = 4;
		int[][] list = new int[input][input];
		int count = 1;

		for (int i = 0; i < list.length; i++) {

			for (int j = 0; j < list.length; j++) {
				list[j][i] = count;
				count++;
			}

		}

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				System.out.printf("%4d", list[i][j]);
			}
			System.out.println();

		}

	}

}
