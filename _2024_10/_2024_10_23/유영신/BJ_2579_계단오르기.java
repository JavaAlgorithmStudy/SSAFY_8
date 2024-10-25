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

		if (stairs == 1) {
			System.out.println(arr[1]);
			return;
		}

		if (stairs == 2) {
			System.out.println(arr[1] + arr[2]);
			return;
		}

		dp[1] = arr[1];
		dp[2] = arr[1] + arr[2];

		for (int i = 3; i <= stairs; i++) {
			// 3계단 전에서 2칸 1칸뛰는경우, 2계단 전에서 2칸뛰는 경우
			dp[i] = Math.max(dp[i - 3] + arr[i - 1], dp[i - 2]) + arr[i];

		}

		System.out.println(dp[stairs]);

	}
}
