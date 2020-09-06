package basic100;

import java.util.Scanner;

//백준 2920 음계
public class basic29 {

	public static int[] input = new int[8];
	public static boolean result = true;
	public static boolean result1 = true;
	public static Object debug = null;

	public static void input() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 8; i++) {
			input[i] = sc.nextInt();
		}

	}

	public static void init() {

		input();
		isAscending();
		isDescending();

		if (result) {
			System.out.println("Ascending");
		} else if (result1) {
			System.out.println("Desscending");
		} else if (!result && !result1) {
			System.out.println("mixed");
		}

	}

	private static void isAscending() {

		for (int i = 0; i < input.length - 2; i++) { // java.lang.NullPointerException 발생

			if (input[0] != 1 || input[i] - input[i + 1] != -1) {
				result = false;
			}

		}
	}

	private static void isDescending() {

		for (int i = input.length - 1; i > 1; i--) {

			if (input[input.length - 1] != 1) {
				result1 = false;
				break;
			}

			if (input[i] - input[i - 1] != -1) {
				result1 = false;
				break;
			}

		}

	}

	public static void main(String[] args) {

		init();
	}

}
