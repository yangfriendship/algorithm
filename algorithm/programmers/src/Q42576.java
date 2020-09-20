import java.util.Arrays;

public class Q42576 {

	public static void main(String[] args) {

		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };

		solution(participant, completion);

	}

	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);

		int cnt = 0;
		while (cnt < participant.length - 1) {

			if (!participant[cnt].equals(completion[cnt])) {
				System.out.println(cnt);
				break;
			}
			cnt++;

		}
		System.out.println(participant[cnt]);
		return participant[cnt];

	}

	public static void print(String[] str) {

		for (int i = 0; i < str.length; i++) {
			System.out.printf("%s ", str[i]);
		}
		System.out.println();
	}
}
