package programmers.level1;

import java.util.*;

public class Q42842 {

	public static void main(String[] args) {
		
		
	}
	

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int max = brown/2 + 2;

        for(int i = max ; i > 0  ; i --){

            for(int j = 0 ; j < max ; j++  ){

                if(((i-2) * (j -2)) == yellow && i+j == max){
                    answer[0] = Math.max(i,j);
                    answer[1] = Math.min(i,j);
                    break;
                }

            }

        }


        return answer;
    }
}
