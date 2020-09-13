package beakjoonS5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class beakjoon_1316 {

	public static boolean solve(String str) {

		boolean[] list = new boolean[26];

		char[] word = str.toCharArray();

		int abcIndex = 0;

		for (int i = 0; i < word.length - 1; i++) {
			abcIndex = word[i] - 97;

			if (word[i] != word[i + 1]) {

				if (list[word[i + 1] - 97]) {
					return false;
				} else {
					return true;
				}

			}  
		if(list[word[word.length-1]]) {
			System.out.println("dfadsfadf");
			return false;
		}

		}

		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int total = 0;
		if (solve("abcdea")) {
			total++;
		}

		System.out.println(total);
	}
}
