package basic100;

//º°Âï±â2
public class basic17_2 {

	public static void main(String[] args) {
		
		int input = 4;
		
		for (int i = 0; i < input; i++) {
			
			for (int j = 1; j <input+1; j++) {
				
				if (j>i) {
					System.out.print("¡Ú");
				}else {
					System.out.print("¤±");
				}
			}
			System.out.println();
		}
		
		
	}
	
}
