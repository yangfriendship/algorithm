import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class beakjoon_10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] input = new int[num];
		int idx = 0;
		int value = 0;
		int sum = 0;
		for (int i = 0; i < num; i++) {
			value = Integer.parseInt(br.readLine());
			if(value ==0 && idx !=0 ) {
				idx --;
			}else if(value !=0) {

				input[idx] = value;





				idx ++;
			}
		}
			
			for (int i = 0; i < idx; i++) {
				sum += input[i];
			}
			System.out.println(sum);
	}
}
