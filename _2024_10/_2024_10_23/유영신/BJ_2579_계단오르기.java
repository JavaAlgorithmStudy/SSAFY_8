package _2024_10._2024_10_23.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2579_계단오르기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int stairs = Integer.parseInt(br.readLine());

		int[] arr = new int[stairs + 1];
		int[] dp = new int[stairs + 1];

		for (int i = 1; i <= stairs; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(Arrays.toString(arr));

		dp[1] = arr[1];
		dp[2] = arr[2];

		for (int i = 3; i <= stairs; i++) {
			dp[i] = arr[i] + Math.max(dp[i - 2], dp[i - 1]);
		}

		System.out.println(Arrays.toString(dp));

	}
}
