package programmers.level1;

import java.util.Arrays;

public class Q12921 {

	public static void main(String[] args) {
		
		int n= 5;
		
		System.out.println(solution(n));
		
	}
	
    public static  int solution(int n) {
        
        boolean[] temp = new boolean[n+1];
        int cnt = 0;
        for (int i = 2; i <= n ; i++) {
				
        	
        		for (int j = i+i; j <= n; j+=i) {
					temp[j] = true;
        	}
		}
        
        System.out.println(cnt);
        
        for (int i = 2; i < temp.length; i++) {

        	if(!temp[i]) {
        		cnt ++;
        	}
        	
        }
        
        return cnt;
    }
	
}
