package _2024_10._2024_10_25.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_17626_FourSquares {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] dp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			dp[i] = i; // 최악의 경우(1^2으로만 만드는 경우)
			for (int j = 1; j * j <= i; j++) {
				// i 보다 작은 제곱수들을 빼주면 된다.
				// 1~3까지는 1번전. 4~8까지는 1번전,4번전. 9~15까지는 1,4,9번전 보기
				dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
			}

		}
		System.out.println(dp[n]);
	}
}
