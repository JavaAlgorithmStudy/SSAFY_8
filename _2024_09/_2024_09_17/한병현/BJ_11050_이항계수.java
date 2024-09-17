package _2024_09._2024_09_17.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11050_이항계수 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		// 분자 계산
		int a = 1;
		for(int i = 1; i <= N; i++) {
			a *= i;
		}
		
		// 분모1 계산
		int b = 1;
		for(int i = 1; i <= N - K; i++) {
			b *= i;
		}
		
		// 분모2 계산
		int c = 1;
		for(int i = 1; i <= K; i++) {
			c *= i;
		}
		
		// 결과 계산
		int result = a / (b * c);
		
		System.out.println(result);
	}	
}
