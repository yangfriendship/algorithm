package basic100;

//각 자리수 합 구하기
//input : 1242
//answer : 9
public class basic9_division {

	public static void main(String[] args) {
		
		int input = 1234;
		int value = 0;
		int sum =0;
		
		while(input!=0) {
			sum += input%10;
			
			input = input/10;
		}
		System.out.println(sum);

	}//
}
