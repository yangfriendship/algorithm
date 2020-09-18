package prm;

public class Q3 {

	public class Solution {
		public int[] solution(int[] arr) {
			int[] answer = {};

			boolean[] result = new boolean[10];
			int cnt = 0;

			answer = new int[arr.length];
			for (int i = 0; i < result.length; i++) {

				if (!result[arr[i]]) {

					result[arr[i]] = true;
					answer[cnt] = arr[i];
					cnt++;
				}
			}
			int[] tmp = new int[cnt];
			
			for (int i = 0; i < cnt; i++) {
				
				tmp[i] = answer[i];
				
			}
			return tmp;
			
			

		}
	}
}