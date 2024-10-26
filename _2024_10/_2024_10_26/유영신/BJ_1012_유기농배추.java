package _2024_10._2024_10_26.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//DFS, BFS
public class BJ_1012_유기농배추 {
	static int[][] arr; // 인풋 배열
	static boolean[][] visited; // 방문 배열
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static int count;
	static int M, N, K;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());

			M = Integer.parseInt(st.nextToken()); // 가로
			N = Integer.parseInt(st.nextToken()); // 세로
			K = Integer.parseInt(st.nextToken()); // 배추 개수

			arr = new int[M][N];
			visited = new boolean[M][N];

			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int f = Integer.parseInt(st.nextToken());
				int s = Integer.parseInt(st.nextToken());

				arr[f][s] = 1; // 배추 심기
			}

			count = 0;

			for (int j = 0; j < M; j++) {
				for (int k = 0; k < N; k++) {
					// 배추가 있는 곳만 탐색. 
					if (arr[j][k] == 1 && !visited[j][k]) {
						visited[j][k] = true; // 방문 체크
						dfs(j, k);
						count++;
					}
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}

	private static void dfs(int r, int c) {
		for (int i = 0; i < 4; i++) {
			int nr = dr[i] + r;
			int nc = dc[i] + c;
			if (nr >= 0 && nr < M && nc >= 0 && nc < N && arr[nr][nc] == 1 && !visited[nr][nc]) {
				visited[nr][nc] = true; // 방문 체크
				dfs(nr, nc);
			}

		}

	}
}
