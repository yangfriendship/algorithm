import java.util.Scanner;

public class IoTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = Integer.parseInt(sc.nextLine().trim());

		String[] str = new String[10];
		
		for (int i = 0; i < 8; i++) {

			str[i] = sc.nextLine();
		}
		System.out.printf("%d %d",a,b);
		System.out.println();
		for (int i = 0; i < str.length; i++) {

			System.out.println(i+" : "+str[i]);
		}
		
	}
	
}
