package basic100;

public class basic18 {

	public static void main(String[] args) {

		int input = 5;

		for (int i = 0; i < input; i++) {

			for (int j = 0; j < input; j++) {

				if (input - j > i + 1) {
					System.out.print("d");
				} else {
					System.out.print("��");
				}

			}
			System.out.println();
		}

	}

}
