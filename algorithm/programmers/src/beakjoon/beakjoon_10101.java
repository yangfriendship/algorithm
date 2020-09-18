package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class beakjoon_10101 {
//	세 각의 크기가 모두 60이면, Equilateral
//	세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
//	세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
//	세 각의 합이 180이 아닌 경우에는 Error

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a + b + c != 180) {
			System.out.println("Error");
		} else if (a == 60 && a == b ) {
			System.out.println("Equilateral");
		} else if(a!=b&&b!=c&&c!=a) {
			System.out.println("Scalene");
		}else if((a==b && a!=c) || (b==c && c!=a) || (a==c && c!=b) ) {
			System.out.println("Isosceles");
		}
	}//
}
