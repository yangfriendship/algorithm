package basic100;

//369 - 100����
public class basic20 {
	
	public static void sanliujiu(int num) {
		
		for (int i = 1; i < num + 1; i++) {

			if ((i % 10) % 3 == 0 || ((i / 10) % 3 == 0 && i > 10)) {
				System.out.printf("%2s", "¦");
			} else {
				System.out.printf("%2d", i);
			}

			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {

		int num = 100;
		
		sanliujiu(num);


	}

}
