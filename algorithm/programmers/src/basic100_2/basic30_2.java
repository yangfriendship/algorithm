package basic100_2;

//input : 9
//ouput : 1+2-3+4 ... - 9
public class basic30_2 {
	
	public static void main(String[] args) {
		
		int input = 9;
		boolean flag = true;
		
		String result ="";
		
		for (int i = 1; i < input+1 ; i++) {
			
			result += Integer.toString(i);
			
			if (flag && i!=input) {
				result += "+";
				flag = false;
			}
			else if(!flag && i!=input) {
				result += "-";
				flag = true;
			}
			
		}
		
		System.out.println(result);
		
		
		
	}

}
