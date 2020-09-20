package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q68644 {

	public static void main(String[] args) {

		int[] numbers = {2,1,3,4,1};
		
		int[] result = solution(numbers);

		for(int num : result) {
			System.out.printf("%d ",num);
		}
		
	}

	public static int[] solution(int[] numbers) {

		int[] answer = {};
		
		Set<Integer> s = new HashSet<Integer>();
		int value =0;
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				value =numbers[i]+numbers[j];
				s.add(value);
			}
		}

		Iterator<Integer>set = s.iterator();
		answer = new int[s.size()];
		
		int cnt = 0;
		while(set.hasNext()) {
			value = set.next();
			answer[cnt] = value;
			cnt ++;
		}
		
		for(Integer num : answer) {
			System.out.println(num);
		}

		Arrays.sort(answer);
		
		return answer;
	}

}
