package _2024_09._2024_09_13.소남주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제 링크]
-https://www.acmicpc.net/problem/15650
*/

/*
[문제 정리]
- 1 초 / 512 MB

- 자연수 N, M

- 아래 조건을 만족하는 수열 모두 구하기
  1. 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
  2. 오름차순
*/

public class BOJ_15649_N과_M_2 {
	
	static BufferedReader br;
	static StringBuilder sb;
	
	static int N;
	static int M;
	
	static int[] selected;
	
	public static void main(String[] args) throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		// -------------------------- input --------------------------
		
		selected = new int[M];
		perm(0, 0);
		
		System.out.println(sb);
		
	}
	
	static void perm(int idx, int visited) {
		
		// 기저 조건
		if (idx == M) {
			for (int elem: selected) sb.append(elem).append(" ");
			sb.append("\n");
			
			return;
		}
		
		// 재귀 부분
		for (int i = 0; i < N; i++) {
			
			if ((visited & (1 << i)) != 0) continue;
			
			if (idx > 0 && i + 1 <= selected[idx - 1]) continue;
			
			selected[idx] = i + 1;
			perm(idx + 1, visited | 1 << i);
			
		}
		
	}
	
}