package basic100_2;

/* 1.3으로 떨어지면 3으로 나눔
 * 2.2로	떨어지면 2로 나눔
 * 3.-1
 * 
 * ex)1 > -1 					1가지	최단루트 1
 * ex)2 > -1/%2					2가지 최단루트 1
 * ex)3 > -1%2 / %3 / -1-1		3가지 최단루트 1
 * ex)4 > -1 3으로 만들고 3의 경우 수 의 최단루트 1 / %2하고 2의 최단루트 1  최단루트 1+1 =2
 * ex)5 > -1하고 4의경우의 최단루트 2 /  			최단루트 2+1 = 3
 * ex)6 > %2를해서 3만들고 3의 최단루트 1 / %3 2만들고 2의 최단루트 1 / -1해서 5의 최단루트 3 / 최단루트 2 
 * ex)7 > -1을해서 6의 최단루트 2												최단루트 3
 * ex) 8 > -1을해서 7의 최단루트 3 / %2를해서 4의 최단루트 2
 * ex)9 > 3으로 나누고 3의 최단루트 1 				최단루트 2
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
