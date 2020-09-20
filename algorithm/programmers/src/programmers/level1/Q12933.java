package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Q12933 {

	public static void main(String[] args) {
		
System.out.println(solution(118372));		
	}
	
    public static long solution(long n) {

    char[] c= Long.toString(n).toCharArray();
    Arrays.sort(c);
        
        
        return Long.parseLong(new String(new StringBuilder().append(c).reverse()));
    }
	
}
