package basic100;

//최대공약수
//input : 12 18
//answer : 6
public class basic6_2 {

	public static void main(String[] args) {

		int answer = 0;

		int num = 12;
		int num1 = 18;

		int big = num > num1 ? num : num1;
		int small = num < num1 ? num : num1;
		System.out.println("big : " + big);
		System.out.println("small : " + small);

		for (int i = 1; i < small; i++) {
			if (big % i == 0 && small % i == 0) {
				answer = i;
			}
		}
		System.out.println(answer);

	}//
}
