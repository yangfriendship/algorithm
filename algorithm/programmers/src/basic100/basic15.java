package basic100;

import java.util.Scanner;

//������
public class basic15 {
	
	public static void printGGD(int num) {
		for (int i = 1; i < 10; i++) {
			
			System.out.printf("%2d * %2d = %d",num,i,num*i);
			System.out.println();
		}
		
	}
	
	public static void printGGD(int num,int num1) {
		for (int i = 1; i < 10; i++) {
			
			System.out.printf("%2d * %2d = %d		%2d * %2d = %d",num,i,num*i,num1,i,num1*i);
			System.out.println();
		}
		
	}


	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		
		int num = 2;
		int num1 = 3;
		
		printGGD(num1,num1);
		System.out.println();
		printGGD(num1);
		
	
	}
	
}
