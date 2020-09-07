package codeUpBasic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//5자리의 정수를 입력받아
//각 자리수 만큼 대가리만 출력
public class CodeUp_1021 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		//ex input : 75254
		int[] result = new int[1000];
		int count =0;

		while(num-1 != -1) {
			result[count]= num%10;
			num /= 10;
			count++;
		}
		for (int i = count-1; i >=0; i--) {
			System.out.printf("[%d]\n",(int)(result[i]*Math.pow(10, i)));
		}

	}

}
