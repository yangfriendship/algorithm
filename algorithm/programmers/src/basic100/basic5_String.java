package basic100;

//�ҹ��� -> �빮�� , �빮��-> �ҹ���
public class basic5_String {

	public static void main(String[] args) {

		String str = "hello WoLld";
		char[] arr = new char[str.length()];
		
		arr = str.toCharArray();
		
		for(char item : arr) {
			System.out.print(item);
		}
		System.out.println();
		int count = 0;
		for(char item : arr) {
			
			if(item >= 'a' && item <='z') {
				arr[count] = (char) (item-32);
				System.out.print(item);
			}else if(item >='A' && item <= 'Z') {
				arr[count] = (char) (item+32);
				System.out.print(item);
			}
			count ++;
		}
		System.out.println();
		
		for(char item : arr) {
			System.out.print(item);
		}
		
	}
}
