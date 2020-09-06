package basic100;

//숫자 출력 재귀
public class basic35 {

	public static void main(String[] args) {

		int input = 2312;

		numberPring(input);

	}

	private static void numberPring(int input) {

		if (input / 10 == 0) {
			System.out.println(input);
			return;
		}

		numberPring(input / 10);
		System.out.println(input % 10);

	}

}
