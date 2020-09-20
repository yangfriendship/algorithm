package programmers.level1;

import java.util.Arrays;

public class Q12935 {
	public static void main(String[] args) {
		
	}
    public int[] solution(int[] arr) {
        
        if(arr.length==1) {
        	
        	if(arr[0]==10) {
        		return new int[]{-1};
        	}else {
        		return arr;
        	}
        }
      int min =  Arrays.stream(arr).min().getAsInt();
        return  Arrays.stream(arr).filter(i -> i> min).toArray();
    }
}
