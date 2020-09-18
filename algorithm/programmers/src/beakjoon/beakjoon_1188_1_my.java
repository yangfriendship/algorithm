package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//index = 	x/2+1
public class beakjoon_1188_1_my {
	
	// 사람 5명 , 소세지 3개라면
	//	3/5를 n번하면 3개가 되는가?
	//	소세지 2 사람 6 답 4
	//3분의 1개씩 가져가겟다
	//3분의 1 * n = 2

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());	//3
		int num = Integer.parseInt(st.nextToken()); //2
		int result = 0;
		//소시지 == 인원 	자를 필요가 없다. 그대로 종료
		if (s%num==0) {
			System.out.println(0);
			return;
		}
		if(s>num) { // 13 2 
			s %= num;
		}

		int cut = 1; //사실상 컷은 1임
		// n :5/ s:3
		while(true) {
			double value = (s/num+ s%num)*cut; 
			System.out.println(value);
			if(s ==value ) {
				break;
			}
			cut ++;
		}
		
		System.out.println(cut);
		
		
	}
}
