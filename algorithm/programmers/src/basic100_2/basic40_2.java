package basic100_2;

/* 1.3���� �������� 3���� ����
 * 2.2��	�������� 2�� ����
 * 3.-1
 * 
 * ex)1 > -1 					1����	�ִܷ�Ʈ 1
 * ex)2 > -1/%2					2���� �ִܷ�Ʈ 1
 * ex)3 > -1%2 / %3 / -1-1		3���� �ִܷ�Ʈ 1
 * ex)4 > -1 3���� ����� 3�� ��� �� �� �ִܷ�Ʈ 1 / %2�ϰ� 2�� �ִܷ�Ʈ 1  �ִܷ�Ʈ 1+1 =2
 * ex)5 > -1�ϰ� 4�ǰ���� �ִܷ�Ʈ 2 /  			�ִܷ�Ʈ 2+1 = 3
 * ex)6 > %2���ؼ� 3����� 3�� �ִܷ�Ʈ 1 / %3 2����� 2�� �ִܷ�Ʈ 1 / -1�ؼ� 5�� �ִܷ�Ʈ 3 / �ִܷ�Ʈ 2 
 * ex)7 > -1���ؼ� 6�� �ִܷ�Ʈ 2												�ִܷ�Ʈ 3
 * ex) 8 > -1���ؼ� 7�� �ִܷ�Ʈ 3 / %2���ؼ� 4�� �ִܷ�Ʈ 2
 * ex)9 > 3���� ������ 3�� �ִܷ�Ʈ 1 				�ִܷ�Ʈ 2
 * 
 * */

public class basic40_2 {

	static int count = 0;

	public static int solve(int num) {
		int[] list = new int[101];
		list[1] = 1; // 1
		list[2] = 1; // 2
		list[3] = 1; // 3
		list[4] = 2; // 4

		if (num < 5) {
			return list[num];
		} else {

			for (int i = 5; i < num + 1; i++) {
				int a = 99999;
				int b = 99999;
				int c = 99999;
				if (i % 3 == 0) {
					a = list[i / 3];
				}
				if (i % 2 == 0) {
					b = list[i / 2];
				}
				c = list[i - 1];

				list[i] = (Math.min(a, Math.min(b, c))) + 1;
			}

			return list[num];
		}
	}

	public static void main(String[] args) {

		int input1 = 10; // ->3
		System.out.println(solve(input1));

	}

}
