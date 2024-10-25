package _2024_10._2024_10_25.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_11726_2n타일링 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		if (n == 1) {
			System.out.println(1);
			return;
		}

		long[] dp = new long[n + 1];

		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
		}
		System.out.println(dp[n]);
	}
}
