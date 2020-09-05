package basic100;

//직사각형 출력 
//input : 4
// 1234
// 5678
// 9 ...
// ... 16
public class basic11_2 {

	public static void main(String[] args) {

		int input = 5;
		int count = 0;
		for (int i = 0; i < input; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < input; j++) {
					System.out.printf("%4d",j+1+count);
				}

			} else if (i % 2 != 0) {
				for (int j = input; j >0; j--) {
					System.out.printf("%4d",j+1+(count-1));
				}
			}
			count +=input;
			System.out.println();

		}

	}
}
