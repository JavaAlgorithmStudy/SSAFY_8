package _2024_10._2024_10_24.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_9461_파도반수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		long[] dp = new long[101];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		dp[4] = 2;
		dp[5] = 2;

		for (int j = 6; j <= 100; j++) {
			dp[j] = dp[j - 1] + dp[j - 5];
		}

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			System.out.println(dp[N]);
		}
	}
}
