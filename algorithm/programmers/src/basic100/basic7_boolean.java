package basic100;

//소수 판별
public class basic7_boolean {

	public static void main(String[] args) {
		
		int input = 13;
		boolean isPrimeNumber = false;
		for(int i=2; i<input-1 ; i++) {
			if(input%i==0) {
				isPrimeNumber = true;
			}
		}
		
		if(!isPrimeNumber) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("아닙니다");
		}
		
	}//
	
}
