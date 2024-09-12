package _2024_09._2024_09_12.유영신;

import java.io.*;
import java.util.*;

// DP로 풀기에는 배열의 사이즈가 너무 커질것같다.
// 그리디 기법을 사용해서 큰금액부터 써주면서 값을 찾아준다.
public class SWEA_쉬운거스름돈 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append("\n");
			int N = Integer.parseInt(br.readLine());
			int[] coins = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
			int[] countCoins = new int[8]; // 각 종류의 돈의 개수를 담을 배열
			
			for (int i = 0; i < coins.length; i++) {
				if(N >= coins[i]) { // 사용가능!
					countCoins[i] = N / coins[i]; // 몫 = 사용한 동전개수
					N = N % coins[i]; // 나머지 = 동전을 사용하고 남은 금액
				}
			}
			for (int i = 0; i < countCoins.length; i++) {
				sb.append(countCoins[i]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
