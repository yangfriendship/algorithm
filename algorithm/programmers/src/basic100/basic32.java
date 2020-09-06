package basic100;

public class basic32 {
	
	public static int calc(int start,int end) {
		
		if(end==start) {
			return end;
		}
		
		return start+calc(start+1,end);
	}
	
	public static void main(String[] args) {	
		
		int start = 2;
		int end = 5;
		
		System.out.println(calc(start, end));
		
		
		
	}
	

}
