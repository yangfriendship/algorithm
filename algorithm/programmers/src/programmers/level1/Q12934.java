package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Q12934 {

	public static void main(String[] args) {

		System.out.println(solution(122));
	}

	public static long solution(long n) {
		int[] arrr = new int[2];
		arrr[0] = 1;
		arrr[1] = 2;

		int[] newArr = Arrays.stream(arrr).filter(item -> item >1).toArray();
		
		System.out.println("dd "+newArr.length);
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		int ex = (int) Math.sqrt(n);
		if (ex - Math.sqrt(n) == 0) {
			return (long)Math.pow(ex+1, 2);
		} else {
			return -1;
		}
		
	
		
		
	}

}
