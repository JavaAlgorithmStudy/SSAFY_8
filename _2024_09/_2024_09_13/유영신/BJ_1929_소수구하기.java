package _2024_09._2024_09_13.유영신;

import java.io.*;
import java.util.*;

// 소수 구하기 -> M의 소수를 구하려면 1~M까지 돌면서 %했을때 값이 0이 나오는게 2개이면 소수이다.
// 이중 for문을 돌리면 시간초과.
// 에스토스테네스의 체 알고리즘 사용.
// "k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다"
public class BJ_1929_소수구하기 {
	static boolean[] prime;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		prime = new boolean[N + 1];
		get_prime();
		for (int i = M; i <= N; i++) {
			if (!prime[i]) // false인 것들만 = 소수인 것들만 append
				sb.append(i).append("\n");
		}
		System.out.println(sb);
	}

	public static void get_prime() {
		prime[0] = prime[1] = true; // 0과 1인 판별 x -> 소수는 2부터 시작

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i]) continue;
			
			for (int j = i * i; j < prime.length; j += i) { // i의 배수들은 모두 걸러준다
				prime[j] = true;
			}
		}
	}
}
