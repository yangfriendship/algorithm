package beakjoon;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class test5 {
	public static void main(String[] args) {

		
		List<String> list = new LinkedList<String>();
		
		list.add("woojung");
		list.add("yuejiao");
		
		System.out.println(list);
		System.out.println(list.contains("woojung"));
		System.out.println(list.remove("woojung"));
		System.out.println(list);
		
	}//main
}
