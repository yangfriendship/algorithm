package beakjoonS5;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class test {
	

	public static String reserve(String str) {

		char temp;
		char[] c = str.toCharArray();
		int lastIndex = (str.length() / 2);
		for (int i = 0; i < lastIndex; i++) {
			temp = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = temp;
		}
		return new String(c);
	}

	public static void main(String[] args) {

		String str = "ef gh";
		
		System.out.println(reserve(str));
		
		
	}
}
