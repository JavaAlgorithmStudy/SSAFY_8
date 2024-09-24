package _2024_09._2024_09_24.소남주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
[문제 링크]
- https://www.acmicpc.net/problem/7576
*/

/*
[문제 정리]
- 1 초 / 256 MB

- N * M 크기의 상자
- 익은 토마토: 1  |  안익은 토마토: 0  |  토마토 없음: -1

- 하루가 지나면, 인접한 토마토가 익음.

- 모든 토마토가 익는 최소 일수 구하기

- 토마토가 없는 칸이 있을 수 있음.
*/

public class BOJ_7576_토마토 {
	
	static BufferedReader br;
	
	static int M; // 상자 가로 길이 (2 <= M, N <= 1,000)
	static int N; // 상자 세로 길이
	
	static int[][] BOX;
	
	static int[] dr = {-1, 0, 1, 0}; // 북, 동, 남, 서
	static int[] dc = {0, 1, 0, -1};
	
	static boolean[][] visited;
	
	static int numOfRipenTomatoes;
	
	static int minDay;
	
	public static void main(String[] args) throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		M = Integer.parseInt(input[0]);
		N = Integer.parseInt(input[1]);
		
		BOX = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			input = br.readLine().split(" ");
			
			for (int j = 0; j < M; j++) {
				BOX[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		// ------------------------ input ------------------------
		
		minDay = 0;

		numOfRipenTomatoes = 0;
		
		ripenTomatoes();
		
		System.out.println(numOfRipenTomatoes == M * N ? minDay : -1);
		
	}
	
	static void ripenTomatoes() {
		
		Queue<int[]> queue = new LinkedList<>();
		
		visited = new boolean[N][M];
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				
				if (BOX[r][c] == -1) numOfRipenTomatoes++;
				
				if (BOX[r][c] != 1 || visited[r][c]) continue;
				
				numOfRipenTomatoes++;
				
				queue.add(new int[] {r, c, 0});				
				visited[r][c] = true;
				
			}
		}
		
		bfs(queue);
		
	}
	
	static void bfs(Queue<int[]> queue) {
		
		while (!queue.isEmpty()) {
			
			int[] curr = queue.poll();
			
			for (int k = 0; k < 4; k++) {
				int nr = curr[0] + dr[k];
				int nc = curr[1] + dc[k];
				
				int day = curr[2];
				
				if (nr < 0 || nr >= N || nc < 0 || nc >= M || BOX[nr][nc] != 0 || visited[nr][nc]) continue;
				
				queue.add(new int[] {nr, nc, ++day});
				visited[nr][nc] = true;
				
				BOX[nr][nc] = 1;
				numOfRipenTomatoes++;
				
				minDay = Math.max(minDay, day);
			}
			
		}
		
	}
	
}