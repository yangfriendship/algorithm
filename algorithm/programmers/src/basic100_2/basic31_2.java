package basic100_2;

//��� ���丮��
public class basic31_2 {
	
	public static int func(int input) {
		if(input==0) {
			return 1;
		}
		
		return input * func(input-1);
	}
	
	public static void main(String[] args) {
	
		int input = 5;
		
		System.out.println(func(3));;
		
		
	}
}
