package basic100_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//	1	2	3	4	5	6	7
//1	1	1	1	1	1	1	1
//2	0	1	1	1	
//3
/*
 * 1만들려면  [1] 				=>1
 * 2만드려면  2 / 1+1 / 		=>2
 * 3만드려면 3/2+1/1+1+1/1+2	=>4
 * 4만드려면 3+1/1+3/2+2/1+1+1+1/2+1+1/1+2+1/1+1+2 => 7
 * 5만드려면 1+1+1+1+1/3+2/2+3/3+1+1/1+3+1/1+1+3/2+2+1/2+1+2/1+2+2/3+1+1 =>13
 * */

//func(n) =

public class basic39_2 {

	public static int doFunc(int num) {
		if (num == 1) {
			return 1;
		}
		if (num == 2) {
			return 2;
		}
		if (num == 3) {
			return 4;
		}

		return doFunc(num - 1) + doFunc(num - 2) + doFunc(num - 3);
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		System.out.println(doFunc(a));
		System.out.println(doFunc(b));
		System.out.println(doFunc(c));

	}

}
