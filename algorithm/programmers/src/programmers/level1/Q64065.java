package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Q64065 {

	public static void main(String[] args) {

		String str = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
		str = str.substring(1,str.length()-1);
		System.out.println(str);
		String[] arr = str.replaceAll("[,}]"," " ).split("\\{");
		List<Integer>list = new ArrayList<Integer>();
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1 , String s2) {
				return s1.length() - s2.length();
			}
			
		});
		int num = 0;
		for (int i = 1; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(arr[i]);
			
			while(st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
				if(!list.contains(num)) {
					list.add(num);
				}
			}
		}
		
		int[] result = new int[list.size()];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}
		
		
		
	}

}
