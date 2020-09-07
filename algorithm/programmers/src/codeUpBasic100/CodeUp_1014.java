package codeUpBasic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp_1014 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		char a = (st.nextToken()).charAt(0);
		char b = (st.nextToken()).charAt(0);
				
		System.out.printf("%c %c",a,b);
	}
	
}
