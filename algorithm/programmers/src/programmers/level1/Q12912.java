package programmers.level1;

public class Q12912 {

	public static void main(String[] args) {
		
		System.out.println(solution(5,3));
		
	}
	
    public static long solution(int a, int b) {
        
        int endNum = Math.max(a, b);
        int startNum = Math.min(a, b);
        long sum = 0;
        while(startNum <= endNum) {
        	sum += startNum;
        	startNum ++;
        }
        
        return sum;
    }
	
	
}
