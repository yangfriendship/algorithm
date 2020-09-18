import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class test {

	public static void main(String[] args) {

		String[] str = {"aaab","bbba","ccca"};
		int i= 3;
		
		
		Arrays.sort(str,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return  o1.charAt(i)-o2.charAt(i);
			}
		});
		
		for (int j = 0; j < str.length; j++) {
			System.out.printf("%s ", str[j]);
		}
		
	}
	
}
