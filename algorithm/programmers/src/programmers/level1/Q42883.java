package programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Q42883 {

	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
        int start = 0;
        int num = 0;
        int max= 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < number.length()-k ; i ++){
            max = start;
         
            for(int j = start ; j <= number.length()-(number.length()-k)+i; j ++){
            	
                if(number.charAt(max)-'0' <number.charAt(j)-'0'  ){
                    max = j ;
                  
                }
                
            }
            start = max+1;
            sb.append(number.charAt(max));
            
 
        }
		
        System.out.println(new String(sb));
        
	}
	
}
