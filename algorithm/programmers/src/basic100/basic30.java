package basic100;

//더하기 빼기 반복
public class basic30 {

	public static void main(String[] args) {

		int num = 16;
		int sum = 1;
		boolean flag = true;
		String str = "";

		for (int i = 1; i < num + 1; i++) {

			str = str + Integer.toString(i);

			if (flag && i != num) {
				str += "+";
				flag = false;
			} else if (!flag && i != num) {
				str += "-";
				flag = true;
			}

		}

		System.out.println(str);

	}

}
