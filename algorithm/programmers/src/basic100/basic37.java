package basic100;

public class basic37 {

	public static int[] houseHold = new int[25];
	public static int apartCnt = 0;
	public static int apartIndex = 0;
	public static int[][] target = {
			{0,0,0,1,1}
			,{0,0,0,0,1}
			,{1,0,0,0,0}
			,{1,1,0,0,0}
			,{1,1,0,1,1}
						};
	
	public static int[][] map = target;
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < map.length; i++) {
			
			for (int j = 0; j < map.length; j++) {
				
				if(map[i][j]== 1) {
					
					doFunc(i,j,apartCnt);
					apartCnt ++;
					
				}
				
			}
			
		}
		
		printMap();
		
	}

	private static void printMap() {
		
		for(int item : houseHold) {
			System.out.print(item);
		}
		
	}

	private static void doFunc(int x, int y, int apartCnt) {
		
		map[x][y] = 0;
		houseHold[apartCnt]++;
		
		if(x+1 <= map.length-1 && map[x+1][y]==1  ) {
			doFunc(x+1,y,apartCnt);
		}
		if(x-1 >= 0 && map[x-1][y]==1) {
			doFunc(x-1, y, apartCnt);
		}
		if(y+1 <=map.length-1 && map[x][y+1]==1) {
			doFunc(x, y+1, apartCnt);
		}
		if (y-1 >=0 && map[x][y-1]==1 ) {
			doFunc(x, y-1, apartCnt);
		}
		
	}
}
