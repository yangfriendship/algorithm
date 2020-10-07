package beakjoon;

import java.util.LinkedList;
import java.util.List;

public class test5 {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.add(list.size(),list.get(1));
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		
	}//main
}
