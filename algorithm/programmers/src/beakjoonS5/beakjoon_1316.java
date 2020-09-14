package beakjoonS5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class beakjoon_1316 {

	public static boolean solve(String str) {

		boolean[] list = new boolean[26];

		char[] word = str.toCharArray();
		
		for (int i = 0; i < word.length-1; i++) {
			boolean result = false;
			if(list[word[i]- 97]) {
				System.out.println(i +" 해당 글자는 이미 나왔습니다. 종료");
				return false;
			}
			
			if(word[i]!= word[i+1]) {
				System.out.printf("%d인덱스와 %d인덱스의 값이 다릅니다.",i,i+1);
				System.out.println();
				if(!list[word[i]-97]) {
					list[word[i]-97] = true; // 두 인덱스의 값이 다르다 > i인덱스는 이미 나왔다고 true값을 넣어준다.
				}else {
					System.out.println("이미 출현한 index -> return");
					return false;
				}
			}else {
				System.out.printf("%d인덱스와 %d인덱스의 값이 같습니다.",i,i+1);
				System.out.println();
			}
			
			if(list[word[word.length-1]-97]) {
				return false;
			}
			
		}
		return true;
		

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int total = 0;
		
		for (int i = 0; i < num; i++) {
			
			if (solve(sc.nextLine())) {
				System.out.println(i +"번째 단어  true");
				total++;
			}
		}


		System.out.println(total);
	}
}
