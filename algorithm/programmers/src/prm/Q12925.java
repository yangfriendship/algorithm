package prm;

public class Q12925 {

	public static void main(String[] args) {

		String str = "-1003";
		int result = solution(str);
		System.out.println(result);
		
	}
    public static int solution(String s) {
        int answer = 0;
        
        int trsf = Integer.parseInt(s.replaceAll("[-]", ""));
        if(s.contains("-")) {
        	answer = trsf - (2*trsf);
        	
        }else {
        	answer = trsf;
        }
        return answer;
    }
	
	
}
