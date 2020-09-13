package beakjoonS5;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class test {

	public static char[] change(int x, int r) {

		int cnt =0;
		String str = "0123456789ABCDEFGHIJKL";
		char[] result = new char[10];
		while(x!=0) {
			
			result[cnt] = (str.charAt(x%r));
			
			cnt ++;
			x/= r;
		}

		
			
		return result;
		}
	
	
	public static void main(String[] args) {


		char[] c = change(10,8);
		
		for (int i = c.length-1; i >=0 ; i--) {
			if (c[i]==0) {
				continue;
			}else {
				System.out.println(c[i]);
			}
			
		}
	}

}
