package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q17683_2 {

	public static void main(String[] args) throws IOException {

	int[][]input=	{{0,0,0,0,0}
					,{0,0,1,0,3}
					,{0,2,5,0,1}
					,{4,2,4,4,2}
					,{3,5,1,3,1}};
	int[] moves =	 {1,5,3,5,1,2,1,4};
	int pointer = 0;
	int value = 0;
	while (pointer > moves.length) {

		for (int i = 0; i < input.length; i++) {
			
			if(moves[pointer]!=0) { // 해당 열이 0이 아닐때
				value = moves[pointer];
				moves[pointer]= 0;
				pointer ++;
			}else { // 해당열이 0일때
				pointer ++;
			}
		}
		
		
	}//while

}//
}
