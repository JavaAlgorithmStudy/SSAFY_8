package _2024_10._2024_10_25.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11659_구간합구하기4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] prefixSum = new int[N + 1]; // 누적합 배열

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			prefixSum[i] = prefixSum[i - 1] + Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());

			int sum = prefixSum[last] - prefixSum[first - 1];
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}
// 1 2 3 4 5(인풋 배열)
// 0 1 3 6 10 15(누적합배열)
// 0 1 2 3 4 5(인덱스)