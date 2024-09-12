package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_13073_Sums {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스 수
		int t = Integer.parseInt(br.readLine());
		
		// 테스트 케이스만큼 반복
		for(int tc = 1; tc <= t; tc++) {
			
			// 정수 N
			int N = Integer.parseInt(br.readLine());
			
			// 양의 정수합, 양의 홀수 정수의 합, 양의 짝수 정수의 합
			int S1 = 0;
			int S2 = 0;
			int S3 = 0;
			
			// N까지 반복하면서 해당하는 정수들을 더함
			for(int i = 1; i <= N; i++) {
				
				S1 += i;
				S2 += 2 * i - 1;
				S3 += 2 * i;
				
			}
			sb.append(S1).append(" ").append(S2).append(" ").append(S3).append("\n");
		}
		System.out.println(sb);
	}
}

