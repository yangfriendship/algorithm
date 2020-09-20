package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class test3 {

	public static void main(String[] args) {

		String s = "Zbcdefg";
		
        String[] arr = s.split("");
        
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
        	sb.append(arr[i]);
		}
        
        sb.reverse();
        System.out.println(new String(sb));
		
		
	}

}
