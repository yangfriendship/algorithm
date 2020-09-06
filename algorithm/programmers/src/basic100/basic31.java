package basic100;

//ÆÑÅä¸®¾ó Àç±Í
public class basic31 {

	public static int factorior(int num) {

		if (num == 1)
			return 1;
		return num * factorior(num - 1);
	}

	public static void main(String[] args) {

		int num = 5;

		System.out.println(factorior(num));

	}
}
