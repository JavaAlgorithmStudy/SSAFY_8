package _2024_10._2024_10_24.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_9095_123더하기 {
	static int[] dp;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		dp = new int[12];

		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;

		int T = Integer.parseInt(br.readLine());

		for (int n = 4; n <= 11; n++) {
			if (n >= 4) {
				dp[n] = dp[n - 1] + dp[n - 2] + dp[n - 3];
			}
		}

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(dp[n]);
		}

	}
}
