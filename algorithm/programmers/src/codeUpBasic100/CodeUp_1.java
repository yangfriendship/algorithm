package codeUpBasic100;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeUp_1 {
	
	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "Hello";
		bw.write(str);
		bw.close();
	}

}
