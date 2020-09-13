package beakjoonS5;

public class beakjoon_1063_shibai {
	
//	R : 한 칸 오른쪽으로
//	L : 한 칸 왼쪽으로
//	B : 한 칸 아래로
//	T : 한 칸 위로
//	RT : 오른쪽 위 대각선으로
//	LT : 왼쪽 위 대각선으로
//	RB : 오른쪽 아래 대각선으로
//	LB : 왼쪽 아래 대각선으로
	static int[] king = new int[2];
	static int[] stone = new int[2];
	

	public static void move(String com) {
		
		switch (com) {
		case "R":
			if(king[1]+1<8 ) {
				king[1] ++;
			}
			break;
		case "L":
			if(king[1]-1>1) {
				king[1] --;
			}
			break;
		case "B":
			if(king[0]<8 && king[0] >1) {
				king[0] --;
			}
			break;
		case "T":
			if(king[0]<8 && king[0] >1) {
				king[0] ++;
			}
			break;	
		case "RT":
			if(king[0]>7 && king[0] >0) {
				king[0] ++;
				king[1] ++;
			}
			break;	
		case "LT":
			if(king[1]>1 && king[0] >0) {
				king[0] ++;
				king[1] --;
			}
			break;	
		case "RB":
			if(king[0]>7 && king[0] >0) {
				king[0] ++;
				king[1] --;
			}
		case "LB":
			if(king[0]>7 && king[0] >0) {
				king[0] ++;
				king[1] --;
			}
			break;	
		}
		
		
	}
	
	public static void init(String kingXy,String stoneXy) {
		
		//A1 A4
		king[0] = kingXy.charAt(1)-'0';
		king[1] = kingXy.charAt(0) - 64;
		stone[0] = stoneXy.charAt(1)-'0';
		stone[1] = stoneXy.charAt(0) - 64;
	}

	public static void main(String[] args) {
		
	}

}
