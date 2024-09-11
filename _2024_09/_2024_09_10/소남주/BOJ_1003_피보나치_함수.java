package _2024_09._2024_09_10.소남주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/1003


N	|	N번째 피보나치 수	|	(0 개수, 1 개수)
----------------------------------------------
0	|		  0 		|	   (1, 0)
1	| 		  1 		|	   (0, 1)
----------------------------------------------
2	| 		0 + 1 		|	   (1, 1)
3	| 	 1  +  0 + 1 	|	   (1, 2)


2번째 피보나치 수의 (0 개수, 1 개수)는 0번째 피보나치 수의 (1, 0)과 1번째 피보나치 수의 (0, 1)을 더한 (1, 1)이다.
3번째 피보나치 수의 (0 개수, 1 개수)는 1번째 피보나치 수의 (0, 1)과 2번째 피보나치 수의 (1, 1)을 더한 (1, 2)이다.
*/

public class BOJ_1003_피보나치_함수 {
	
	static BufferedReader br;
	static StringBuilder sb;
	
	static int N;
	
	static int[][] count; // N-2번째 피보나치 수와 N-1번째 피보나치 수의 (0 개수, 1개수)를 저장하기 위한 이차원 배열
	
	public static void main(String[] args) throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		final int T = Integer.parseInt(br.readLine());
		
		for (int testCase = 1; testCase <= T; testCase++) {
			N = Integer.parseInt(br.readLine());
			
			count = new int[2][2];
			
			fibonacci(N);
			
			if (N == 0) { // fibonacci 함수 로직 상, N이 0인 경우를 처리할 수 없기 때문에, 따로 코드 작성
				sb.append(1).append(" ").append(0).append("\n");
				continue;
			}
			
			sb.append(count[1][0]).append(" ").append(count[1][1]).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	static void fibonacci(int n) {
		
		for (int i = 0; i <= n; i++) { // n번째 피보나치 수를 구해야하므로, 0부터 n까지 반복
			if (i == 0) { // 0은 (1, 0)으로 지정
				count[0][0]++;
				continue;
			}
			else if (i == 1) {
				count[1][1]++; // 1은 (0, 1)로 지정
				continue;
			}
			
			// N-2번째 피보나치 수와 N-1번쨰 피보나치 수의 (0 개수, 1 개수)를 더해서, temp에 임시 저장
			int[] temp = new int[2];
			temp[0] = count[0][0] + count[1][0];
			temp[1] = count[1][0] + count[1][1];
			
			// 배열 값 하나씩 미뤄서 저장
			count[0][0] = count[1][0];
			count[0][1] = count[1][1];
			
			count[1][0] = temp[0];
			count[1][1] = temp[1];
		}
		
	}
	
}