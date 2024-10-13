package _2024_10._2024_10_13.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_11727_2xn_타일링_2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n + 1];
		
		dp[0] = 1;
		dp[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10_007;
		}
		
		System.out.println(dp[n]);
		
	}

}