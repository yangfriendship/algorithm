package prm;

public class solve3 {

	public static int gcd(int a, int b) {
		
		while(b>0) {
			int temp = b;
			b = a% b;
			a= temp;
		}
		
		return a;
	}
	
	public static int lcm(int a , int b) {
		

		return a* b /gcd(a, b);
		
	}
	
    public static int[] solution(int n, int m) {
        int[] answer = {};
        answer = new int[2];
        
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        
        return answer;
    }
	
	public static void main(String[] args) {
		int n=3;
		int m=12;

		int[] result = solution(n, m);
		System.out.printf("%d , %d",result[0],result[1]);
		
	}
}
