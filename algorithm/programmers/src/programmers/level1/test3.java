package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class test3 {

	public static void main(String[] args) {

		String[] str = {"1111", "333","1"};
		
		Arrays.sort(str, (s1, s2) -> s1.length() - s2.length());
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		
		String str1 = "abcdef";
		String str2 = "abcd";
		
		str.equals(str2.substring(0,str1.length()));
	}

}
