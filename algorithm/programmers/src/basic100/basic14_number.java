package basic100;

//14
//숫자 개수 출력
public class basic14_number {

	public static void main(String[] args) {

		int input = 12;

		int[] result = new int[10];
		int count=0;
		while(input!=0) {
			
			result[input%10] +=1;
			input/=10;
		}
		
		for (int i = 0; i < result.length; i++) {

			System.out.printf("%d : %d", i, result[i]);
			System.out.println();
		}


	}

}
