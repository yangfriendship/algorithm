package basic100_2;

//음계
//오름차순  ascending
//내림차순 descending
//둘다아님 mixed
public class basic29 {

	static boolean flag = true;

	public static void solve(String str) {

		if (str.charAt(0) != '1') {
			flag = false;
			return;
		}
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) - str.charAt(i + 1) != -1) {
				flag = false;
			}

		}

	}

	public static void solve1(String str) {
		if (str.charAt(0) != '8') {
			flag = true;
			return;
		}
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) - str.charAt(i + 1) != 1) {
				flag = true;
				return;
			}
		}

	}

	public static void init(String str) {

		solve(str);
		if (flag) {
			System.out.println("Ascending");
			return;
		}
		solve1(str);
		if (!flag) {
			System.out.println("Descending");
			return;
		} else {
			System.out.println("Mixed");
		}

	}

	public static void main(String[] args) {

		String ascending = "12345678";
		String descending = "87654321";
		String mixed = "13245768";

		System.out.println("ascending");
		init(ascending);
		System.out.println("descending");
		init(descending);
		System.out.println("mixed");
		init(mixed);
	}
}
