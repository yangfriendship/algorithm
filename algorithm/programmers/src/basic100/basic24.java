package basic100;

public class basic24 {

	public static double average(int num, int[] scoures) {

		int sum = 0;
		int count = 0;
		for (int scoure : scoures) {
			sum += scoure;
		}
		float average = sum / num;

		for (int soucre : scoures) {
			if (soucre > average) {
				count++;
			}
		}
		double result = count / (double) num * 100;

		return result;
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int num = 7;
		int[] scoures = { 100, 95, 90, 80, 70, 60, 50 };
		// default input

		double result = average(num, scoures);
		System.out.println((double) Math.round(result * 1000) / 1000);
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");

	}

}
