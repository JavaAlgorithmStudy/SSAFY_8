package _2024_11._2024_11_01.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_14940_쉬운최단거리 {
	static int n, m;
	static int[][] arr;
	static int[] dr = { -1, 0, 1, 0 }; // 상우하좌
	static int[] dc = { 0, 1, 0, -1 };
	static boolean[][] visited; // 방문체크
	static int[][] result; // 결과값 배열

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n][m];
		visited = new boolean[n][m];
		result = new int[n][m];

		int startR = -1;
		int startC = -1;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 2) {
					startR = i;
					startC = j;
				}
			}
		}

//		for(int[] a : arr) {
//			System.out.println(Arrays.toString(a));
//		}

		bfs(startR, startC);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(!visited[i][j] && arr[i][j] == 1) {
					result[i][j] = -1;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sb.append(result[i][j]).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);

	}

	private static void bfs(int r, int c) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { r, c });
		result[r][c] = 0;
		visited[r][c] = true;

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int currR = current[0];
			int currC = current[1];
			
			for (int i = 0; i < 4; i++) {
				int nr = currR + dr[i];
				int nc = currC + dc[i];

				if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
					if (arr[nr][nc] == 1 && !visited[nr][nc]) {
						queue.add(new int[] { nr, nc });
						visited[nr][nc] = true;
						result[nr][nc] = result[currR][currC] + 1;
					}
				}
			}

		}

	}
}
