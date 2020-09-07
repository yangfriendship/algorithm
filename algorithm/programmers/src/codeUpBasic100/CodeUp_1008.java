package codeUpBasic100;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeUp_1008 {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "¦£¦¨¦¤\r\n" + "¦§¦«¦©\r\n" + "¦¦¦ª¦¥";
		bw.write(str);
		bw.close();

	}

}

