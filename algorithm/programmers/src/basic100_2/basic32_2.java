package basic100_2;

//n부터 m까지의 합을 구하시오
//n = 1 , m = 4
//out : 1 + 2 + 3 + 4 = 10;
public class basic32_2 {

	public static void main(String[] args) {
		
		int n = 1;
		int m = 4;
	
		int result = solve(n,m);
		System.out.println(result);
	
	}

	private static int solve(int n, int m) {
		int sum = 0;
		for (int i = n; i <= m; i++) {

			sum += i;
			
		}
		
		return sum;
	}
	
}
