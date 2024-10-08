package _2024_09._2024_09_29.소남주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제 링크]
- https://www.acmicpc.net/problem/2293
*/


/*
[문제 정리]
- 0.5 초 / 4 MB

- n가지 종류의 동전 -> 중복 선택 가능
- 가치의 합이 K원이 되도록 하는 경우의 수 구하기

- 순서는 고려하지 않음.
*/

public class BOJ_2293_동전_1 {
	
	static BufferedReader br;
	
	static int N; // 동전의 종류 (1 <= N <= 100)
	static int K; // 만들어야 하는 합 (1 <= K <= 10,000)
	
	static int[] VALUES; // 동전의 가치 (1 <= 가치 <= 100,000)
	
	static int[] dp; // 특정 가치를 만드는 경우의 수
	
	public static void main(String[] args) throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		N = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);
		
		VALUES = new int[N];
		
		for (int i = 0; i < N; i++) {
			VALUES[i] = Integer.parseInt(br.readLine());
		}
		
		// ----------------------- input -----------------------
		
		dp = new int[K + 1];
		dp[0] = 1;
		
		for (int coin: VALUES) {
			
			for (int i = coin; i <= K; i++) {
				dp[i] += dp[i - coin];
			}
			
		}
		
		System.out.println(dp[K]);
		
	}
	
}