package _2024_09._2024_09_12.유영신;

import java.io.*;
import java.util.*;

// DP사용해서 K가주어졌을 때 K+1 크기의 배열을 만들고 각각의 부피마다 들어갈 수 있는 최대 가치를 계산한다.
public class SWEA_Knapsack {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken()); // 가방 총 개수
			int K = Integer.parseInt(st.nextToken()); // 최대부피 = 가방부피

			int[] dp = new int[K + 1]; // 최대 가치 계산하는 배열

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int v = Integer.parseInt(st.nextToken()); // 하나의 가방 부피
				int c = Integer.parseInt(st.nextToken()); // 하나의 가방 가치

				for (int j = K; j >= v; j--) {
					// 넣지 않을 때 vs 넣을때
					dp[j] = Math.max(dp[j], dp[j - v] + c);
				}

			}
			System.out.println("#" + tc + " " + dp[K]);
		}
	}
}

