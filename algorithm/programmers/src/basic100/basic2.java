package basic100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//피보나치
public class basic2 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] list = new int[num];

		int num1 = 1;
		int num2 = 0;
		int sum = 1;

		for (int i = 0; i < num; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			
			System.out.print(sum + " ");
		}

	}
}
