package _2024_09._2024_09_12.소남주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제 링크]
- https://www.acmicpc.net/problem/11659
*/

/*
[문제 설명]
- 1 초 / 256 MB

- N개의 수가 주어졌을 때, i번째 수부터 j번째 수까지의 합 구하기
*/

/*
[풀이 방법]
- 누적합 이용
*/

public class BOJ_11659_구간_합_구하기_4 {
	
	static BufferedReader br;
	static StringBuilder sb;
	
	static int N; // 수의 개수 (1 <= N <= 100,000)
	static int M; // 합을 구해야 하는 횟수 (1 <= M <= 100,000)
	
	static int[] SUM; // 누적합 배열
	
	public static void main(String[] args) throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		input = br.readLine().split(" ");
		
		SUM = new int[N + 1];
		
		for (int i = 0; i < N; i++) {
			SUM[i + 1] += SUM[i] + Integer.parseInt(input[i]);
		}
		
		for (int part = 0; part < M; part++) {
			input = br.readLine().split(" ");
			
			int start = Integer.parseInt(input[0]);
			int end = Integer.parseInt(input[1]);
			
			sb.append(SUM[end] - SUM[start - 1]).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
}