package programmers.level1;

import java.util.Arrays;

public class Q42862 {

	public static void main(String[] args) {
		
		int[] lost = new int[]{3};
		int[] reserve = new int[] {1};
		solution(3,lost,reserve);
	}
	public static int solution(int n, int[] lost, int[] reserve) {
		int[] classRome = new int[n+1];
		for (int i = 0; i < reserve.length; i++) {
			classRome[reserve[i]] += 1;
		}
		for (int i = 0; i < lost.length; i++) {
			classRome[lost[i]] -=1;
		}
		
		for (int i = 1; i < classRome.length; i++) {

			if(i>1&&classRome[i]==-1 && classRome[i-1]== 1) {
				classRome[i] +=1;
				classRome[i-1] -=1;
			}else if(i< classRome.length-1 &&classRome[i]==-1 && classRome[i+1]==1) {
				classRome[i] +=1;
				classRome[i+1] -=1;
			}
		}
		
		
		int cnt = 0;
		for (int i = 1; i < classRome.length; i++) {
			System.out.println(classRome[i]);
			if(classRome[i]==-1) {
				cnt ++;
			}
		}
		int result = n -cnt;
		System.out.println(result);
		return result;
	}

}
