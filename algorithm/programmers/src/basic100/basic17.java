package basic100;

//�����2
public class basic17 {

	public static void main(String[] args) {
		
		int input = 5;
		
		for (int i = 0; i < input; i++) {
	
			for (int j = 0; j < input-i; j++) {
				System.out.print("��");
			}
			
			for (int j = 0; j < i+1; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
	}
	
}
