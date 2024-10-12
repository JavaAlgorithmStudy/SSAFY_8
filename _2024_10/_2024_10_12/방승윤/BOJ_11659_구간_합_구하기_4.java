package _2024_10._2024_10_12.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659_구간_합_구하기_4 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] dp = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			dp[i] = dp[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			sb.append(dp[R] - dp[L - 1]).append("\n");
		}
		
		System.out.println(sb);
		
	}

}