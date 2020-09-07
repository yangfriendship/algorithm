package basic100_2;

public class basic35_2 {

	static String str = "";

	public static void solve(int num) {
		int value;
		String result = "";
		while (num - 1 > -1) {
			value = num % 10;
			result += value;
			num /= 10;
		}

		for (int i = result.length() - 1; i >= 0; i--) {
			System.out.println(result.charAt(i));
		}
	}

	public static void recursion(int num) {
		if (num == 0) {
			return;
		}

		str += num % 10;
		recursion(num / 10);

	}

	public static void main(String[] args) {

		int num = 2312;
		solve(num);
		recursion(num);
		System.out.println();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}

}
