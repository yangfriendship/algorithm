package beakjoon;

public class test5 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.append("woojung");
		String s = "woojung";
		char[] arr = s.toCharArray();
		System.out.println(arr);
		System.out.println(sb);
		System.out.println(sb.equals(arr));
		System.out.println(sb.equals(s));
		System.out.println(s.equals(sb));
		
		
	}//main
}
