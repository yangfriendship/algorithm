package basic100_2;

//10진수 -> 2진수 변환 재귀함수
public class basic36_2 {

	public static void common(int num) {
		String[] result = new String[3 * ((Integer.toString(num)).length())];
		int count = 0;
		int value;
		while (num > 0) {
			value = num % 2;
			result[count] = Integer.toString(value);
			num /= 2;
			count++;

		}

		for (int i = count - 1; i >= 0; i--) {
			System.out.print(result[i]);
		}

	}

	public static void main(String[] args) {

		int num = 111;

		common(num);

	}

}
