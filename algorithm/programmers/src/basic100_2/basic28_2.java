package basic100_2;

//10진수 n진수 변환
public class basic28_2 {

	public static void main(String[] args) {
		
		int num = 11;
		int jinsu = 16;
		
		char[] a= new char[num];
		int count =0;
		int value = 0;
		while(num>0) {
			value = num%jinsu;

			if(value >=10 && value <=16) {
				a[count] = (char) ('A'+(value-10));
			}else {
				a[count] = (char)('0'+value);
			}
			
			num /= jinsu;
			count++;
		}
		
		for (int i = count; i >=0; i--) {
			System.out.printf("%c",a[i]);
			
		}
		
	}
	
}
