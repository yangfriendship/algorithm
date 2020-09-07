package basic100_2;

//피보나치 재귀
public class basic34_2 {
	
	static int count = 0;
	
	public static int solve(int num) {
		
		if(num==1 || num==2) {
			return 1;
		}

		return solve(num-1)+solve(num-2);
	}
	
	public static void main(String[] args) {
		
		int num = 6;
		
		System.out.println(solve(num));
		
	}
	
}
