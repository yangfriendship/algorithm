package basic100;

//ÃÖºó¼ö ±¸ÇÏ±â
public class basic3 {
	//1 2 2 3 1 4 2 2 4 3 5 3 2

	public static void main(String[] args) {
		
		String str = "1 2 2 3 1 4 2 2 4 3 5 3 2";
		String[] str2 = str.split(" ");

		int[] inputNum = new int[str2.length];
		int[] count = new int[10];
		
		for(int i = 0 ; i< str2.length ; i++) {
			inputNum[i] = Integer.parseInt(str2[i]);
		}
		
		for(int i =0; i<inputNum.length ; i++) {
			count[inputNum[i]] = count[inputNum[i]]+1;
		}

		int index = 0;
		for (int i = 0; i < count.length-1; i++) {
		
			if (count[i]<count[i+1]) {
				index = i+1;
			}
		}
			System.out.println("ÃÖºó¼ö : " +index +" ÃâÇöÈ½¼ö : " + count[index]);
		
	}
	

}
