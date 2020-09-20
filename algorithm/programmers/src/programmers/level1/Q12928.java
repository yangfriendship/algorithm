package programmers.level1;

public class Q12928 {

	public static void main(String[] args) {
		
		
		solution(0);
	}
	
    public static int solution(int n) {
    	if(n==1) {
    		return 1;
    	}else if(n==0) {
    		return 0;
    	}
    	
        int answer = 0;
        int index = 1;
        int sum =0;
        while(index <= n/2+1) {
        	
        	if(n%index==0) {
        		sum += index;
        	}
        	
        	index ++;
        }
        answer = sum +n;
        
        System.out.println(answer);
        return answer;
    }
	
}
