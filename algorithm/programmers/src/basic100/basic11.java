package basic100;

//직사각형 출력 
//input : 4
// 1234
// 5678
// 9 ...
// ... 16
public class basic11 {

	public static void main(String[] args) {

		int input = 4;
		int count = 0;
		for (int i = 0; i < input; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < input; j++) {

					System.out.print(j + count + 1 + " ");

				}
			}

			if (i % 2 != 0) {
				for (int j = 0; j < input; j--) {
					

				}
			}

			count += input;
			System.out.println();
		}

	}
}
