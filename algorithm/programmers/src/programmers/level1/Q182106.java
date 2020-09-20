package programmers.level1;

public class Q182106 {

	public static void main(String[] args) {


	}

	class Solution {
		public int[][] solution(int[][] arr1, int[][] arr2) {
			int[][] answer = {};
			int Y = arr1.length;
			int X = arr1[0].length;
			answer = new int[Y][X];
			for (int i = 0; i < Y; i++) {

				for (int j = 0; j < X; j++) {

					answer[i][j] = arr1[i][j] + arr2[i][j];
				}

			}

			return answer;
		}
	}

}
