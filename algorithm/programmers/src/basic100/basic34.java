package basic100;

//��� �Ǻ���ġ
public class basic34 {

	public static int pibo(int num) {
		int result = 0;

		
		if(num ==1 || num == 2) {
			return 1;
		}
		
		return pibo(num-1) + pibo(num-2);
		
	}
	
	public static void main(String[] args) {

		int num = 6;
		
		int result = pibo(num);
		System.out.println(result);
		
	}


}
