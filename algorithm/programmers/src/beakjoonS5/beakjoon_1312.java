	package beakjoonS5;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.StringTokenizer;
	
	public class beakjoon_1312 {
	
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int result =0;
			a %= b; //0.xx 계산이 시작될 나머지 값을 미리 계산
			
			for (int i = 0; i < n; i++) {
				a%=b;
				a*=10;
			}
			result = a/b;
			System.out.println(result);
			
		}
		
	}
