package basic100;

//num를 n진수로 변환
public class basic28 {

	public static void binary(int num, int n) {

		int i = 0;
		char[] c = new char[100];

		while (num > 0) {
			int temp = num % n;

			if (temp >= 10 && temp <= 15) {
				c[i] = (char) ('A' + (temp - 10));
			} else {
				c[i] = (char) ('0' + temp);
			}
			num = num / n;
			i++;

		}

		for (int j = i; j >= 0; j--) {

			System.out.print(c[j]);

		}

	}

	public static void main(String[] args) {

		int num = 10;
		int n = 2;

		binary(num, n);

	}

}
