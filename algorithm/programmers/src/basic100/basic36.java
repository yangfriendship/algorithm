package basic100;

//������ ��ȯ ���
public class basic36 {

	public static void main(String[] args) {

		int input = 17;

		binary(input);
	}

	private static void binary(int input) {

		if (input / 2 == 0) {
			System.out.print(input);
			return;
		}
		binary(input / 2);
		System.out.print(input % 2);

	}

}
