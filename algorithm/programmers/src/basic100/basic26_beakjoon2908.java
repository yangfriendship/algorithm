package basic100;

public class basic26_beakjoon2908 {

	public static int reserve(int num) {

		String str = Integer.toString(num);
		char[] c = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {

			c[i] = str.charAt(str.length() - 1 - i);
		}

		int result = Integer.parseInt(new String(c));

		return result;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		int a = 734;
		int b = 893;

		System.out.println(reserve(a) > reserve(b) ? reserve(a) : reserve(b));
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}

}
