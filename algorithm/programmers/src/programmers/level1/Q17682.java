package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q17682 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[][] input;
	static Queue<Integer> moves = new LinkedList<Integer>();
	static int N;
	static Stack<Integer> basket = new Stack<Integer>();
	static int result = 0;

	public static void main(String[] args) throws IOException {

		setField();
		setMoves();

		while (!moves.isEmpty()) {
			System.out.println("catch input value : " + moves.peek());
			catchNum(moves.poll());
			receiveNum();
		}

		System.out.println(result);

	}

	public static void setMoves() throws IOException {
		String str = br.readLine();
		System.out.println(str);
		str = str.replaceAll("\\p{Punct}", " ");
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str);

		while (st.hasMoreTokens()) {
			moves.add(Integer.parseInt(st.nextToken()));
		}

		System.out.println(moves.toString());

	}

	public static void setField() throws IOException {

		String str = br.readLine();
		str = str.replaceAll("\\p{Punct}", " ");
		StringTokenizer st = new StringTokenizer(str);
		int cnt = 0;
		N = (int) findN(str);
		System.out.println(N);
		input = new int[N][N];
		st = new StringTokenizer(str);
		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length; j++) {

				input[i][j] = Integer.parseInt(st.nextToken());
			}

		}

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length; j++) {
				System.out.printf("%2d", input[i][j]);
			}
			System.out.println();

		}
	}

	public static int findN(String str) {
		StringTokenizer st = new StringTokenizer(str);
		String temp;
		int cnt = 0;
		while (st.hasMoreTokens()) {
			temp = st.nextToken();
			cnt++;
		}

		return (int) Math.sqrt(cnt);
	}

	public static void catchNum(int x) {
		int result = 0;
		for (int i = 0; i < N; i++) {
			if (input[i][x - 1] != 0) {
				result = input[i][x - 1];
				input[i][x - 1] = 0;
				moveNum(result);
				break;
			}
		}

	}

	public static void moveNum(int result) {
		basket.push(result);
		System.out.println("basket : " + basket.toString());
	}

	public static void receiveNum() {
		int size = basket.size();

		if (size == 1) {
			return;
		} else {
			if (basket.get(size - 1) == basket.get(size - 2)) {
				result += 2;
				basket.pop();
				basket.pop();
				System.out.println("count : " + basket.toString());
			}
		}

	}

}
