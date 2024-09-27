package _2024_09._2024_09_27.소남주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SWEA_1227_미로_2 {
	
	static BufferedReader br;
	static StringBuilder sb;
	
	static int N = 100; // 미로의 크기
	
	static int[][] MAZE;
	
	static int[] START; // 시작지점의 좌표
	static int[] END; // 도착지점의 좌표
	
	static boolean[][] visited;
	
	static int[] dr = {-1, 0, 1, 0}; // 북, 동, 남, 서
	static int[] dc = {0, 1, 0, -1};
	
	static int isAble;
	
	public static void main(String[] args) throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		for (int testCase = 1; testCase <= 10; testCase++) {
			sb.append("#").append(Integer.parseInt(br.readLine())).append(" ");
			
			MAZE = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				String[] input = br.readLine().split("");
				
				for (int j = 0; j < N; j++) {
					int value = Integer.parseInt(input[j]);
					
					MAZE[i][j] = value;
					
					if (value == 2) START = new int[] {i, j};
					else if (value == 3) END = new int[] {i, j};
				}
			}
			
			// -------------------------- input --------------------------
			
			isAble = 0;
			
			visited = new boolean[N][N];
			
			dfs(START);
			
			sb.append(isAble).append("\n");
			
		}
		
		System.out.println(sb);
		
	}
	
	static void dfs(int[] start) {
		
		Stack<int[]> stack = new Stack<>();
		
		stack.add(start);
		visited[start[0]][start[1]] = true;
		
		while (!stack.isEmpty()) {
			int[] curr = stack.pop();
			
			for (int k = 0; k < 4; k++) {
				int nr = curr[0] + dr[k];
				int nc = curr[1] + dc[k];
				
				if (nr < 0 || nr >= N || nc < 0 || nc >= N || visited[nr][nc] || MAZE[nr][nc] == 1) continue;
				
				if (MAZE[nr][nc] == 3) isAble = 1;
				
				stack.add(new int[] {nr, nc});
				visited[nr][nc] = true;
			}
		}
		
	}
	
}