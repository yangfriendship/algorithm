package programmers.level1;

class Solution {
	public String solution(String s) {

		String answer = "";

		char[] word = s.toCharArray();

		for (int i = 0; i < word.length; i++) {

			if ((int) word[i] == 32) {
			}
			else if (i % 2 == 0) {
				word[i] = (char) (word[i] - 32);
			} else if (i % 2 == 1) {
				word[i] = (char) (word[i] + 32);
			}

		}
		
		answer = new String(word);

		return answer;

	}
	
	public static void main(String[] args) {
		
		String input = "abcdef";
		
		Solution sv = new Solution();
		
		String result=sv.solution(input);
		System.out.println(result);
	}
}