package _2024_09._2024_09_26.유영신;

import java.io.*;
import java.util.*;

// 중복순열.
public class BJ_15651_N과M3 {
	static int N, M;
	static int[] arr, stack;
	static StringBuilder sb;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		stack = new int[M];

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		sb = new StringBuilder();
		permutation(0);

		System.out.println(sb);
	}

	private static void permutation(int idx) {
		// 기저조건
		if (idx == M) {
			for (int i = 0; i < M; i++) {
				sb.append(stack[i]).append(' ');
			}
			sb.append('\n');
			return;
		}

		// 재귀부분
		for (int i = 0; i < N; i++) {
			stack[idx] = arr[i];
			permutation(idx + 1);
		}

	}
}
