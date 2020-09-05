package basic100;

public class basic23 {

	public static void main(String[] args) {

		String str = "youzheng";
		System.out.println(str);
		char[] result = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			result[i] = str.charAt(str.length() - 1 - i);
		}

		str = new String(result);

		System.out.println(str);

	}

}
