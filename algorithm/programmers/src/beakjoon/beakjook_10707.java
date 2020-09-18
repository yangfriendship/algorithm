package beakjoon;

import java.util.Scanner;

public class beakjook_10707 {

//	JOI군이 살고 있는 지역에는 X사와 Y사, 두 개의 수도회사가 있다. 
//	두 회사의 수도요금은 한 달간 수도의 사용량에 따라 다음과 같이 정해진다.
//	X사 : 1리터당 A엔.
//	Y사 : 기본요금은 B엔이고, 사용량이 C리터 이하라면 요금은 기본요금만 청구된다.
//	사용량이 C리터가 넘었을 경우 기본요금 B엔에 더해서 추가요금이 붙는다. 
//	추가요금은 사용량이 C리터를 넘었을 경우 1리터를 넘었을 때마다 D엔이다.
//	JOI군의 집에서 한 달간 쓰는 수도의 양은 P리터이다.
//	수도요금이 최대한 싸게 되도록 수도회사를 고를 때, JOI군의 집의 1달간 수도요금을 구하여라.
//	첫 번째 줄에는 X사의 1리터당 요금 A가 입력된다.
//	두 번째 줄에는 Y사의 기본요금 B가 입력된다.
//	세 번째 줄에는 Y사의 요금이 기본요금이 되는 사용량의 상한 C가 입력된다.
//	네 번째 줄에는 Y사의 1리터 당 추가요금 D가 입력된다.
//	다섯 번째 줄에는 JOI군의 집에서 사용하는 한 달간 수도의 양 P가 입력된다.
//	9
//	100
//	20
//	3
//	10
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int xPrice = sc.nextInt(); //9
		int yPrice = sc.nextInt(); // 100
		int yAdd = sc.nextInt(); //20
		int yAddprice = sc.nextInt(); //3
		int L = sc.nextInt(); //10L
		
		if(xPrice*L <= yPrice ) {
			System.out.println(xPrice*L);
			return;
		}

		int a = L * xPrice;
		int b =0;
		
		if(L<= yAdd) {
			b= yPrice;
		}else {
			int n =0;
			n = L-yAdd;
			b= yPrice + (n * yAddprice);
		}
		System.out.println(Math.min(a, b));
		
		
		
	}
}
