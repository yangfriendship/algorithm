package basic100_2;

//»öÄ¥
public class basic33_2 {
	
	public static int[][] map = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0 }, { 0, 0, 1, 1, 0 }, { 0, 0, 0, 0, 1 },
			{ 0, 0, 1, 0, 0 } };

	static int count =0;
	static int num =0;



	
	private static void solve(int y,int x) {
		if(map[y][x]!=1) {
			map[y][x] =2 ;
		}
		if(x+1 <= map.length-1 && map[y][x+1]!=2 && map[y][x+1]!=1 ) {
			solve(y,x+1);
		}
		if(x-1 >=0 &&map[y][x-1]!=2 && map[y][x-1]!=1 ) {
			solve(y,x-1);
		}
		if( y+1 <= map.length-1&&map[y+1][x]!=2 && map[y+1][x]!=1 ) {
			solve(y+1,x);
		}
		if(y-1 >=0 && map[y-1][x]!=2 && map[y-1][x]!=1) {
			solve(y-1,x);
		}
		
	

		
	}

	public static void main(String[] args) {
		for (int i = 0; i < map.length; i++) {
			
			for (int j = 0; j < map.length; j++) {
				
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		solve(0,0);
		
		for (int i = 0; i < map.length; i++) {
			
			for (int j = 0; j < map.length; j++) {
				
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
			
		}
}
