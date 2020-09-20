package programmers.level1;

public class Q12901 {

	public static void main(String[] args) {

		System.out.println(solution(5, 24));

	}

	public static String solution(int a, int b) {
		int[] months = { 31, 29, 31, 30, 31, 30,31 ,31, 30, 31, 30, 31 };
		int days = 0;
		for (int i = 0; i < a - 1; i++) {
			days += months[i];
		}
		days += b;
		String week = "";
		switch (days % 7) {
		case 1:
			week = "FRI";
			break;
		case 2:
			week = "SAT";
			break;
		case 3:
			week = "SUN";
			break;
		case 4:
			week = "MON";
			break;
		case 5:
			week = "TUE";
			break;
		case 6:
			week = "WED";
			break;
		case 0:
			week = "THU";
			break;
		}

		return week;
	}
}
