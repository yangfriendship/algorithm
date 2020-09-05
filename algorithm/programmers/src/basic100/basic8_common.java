package basic100;


//ÆÑÅä¸®¾ó
// 5ÆÑÅä¸®¾ó = 5 x 4 x 3 x 2 x 1
public class basic8_common {

	public static int facto(int num) {
		if(num==1) {
			return 1;
		}
		num = num * facto(num-1);

		return num;
	}

	public static void main(String[] args) {
		
		int num = 10;

		System.out.println(facto(num));
		
	}//
}
