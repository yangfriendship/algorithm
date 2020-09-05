package basic100;

import java.util.Scanner;

public class basic25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int count = 0;
		int sum = 0;

		int temp = input;

		int pre = 0;
		int next = 0;

		while (true) {

			pre = temp / 10;
			next = temp % 10;

			sum = pre + next;

			temp = (next * 10) + ((sum) % 10);

			count++;
			if (temp == input) {
				break;
			}

		}

		System.out.println(count);

	}

}
