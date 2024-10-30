package _2024_10._2024_10_30.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_2178_미로탐색 {
	static int N, M;
	static int[][] arr; // 미로 정보
	static int[][] dist; // 거리 정보를 담을 배열
	static boolean[][] visited; // 방문체크
	static int[] dr = { -1, 0, 1, 0 }; // 상우하좌
	static int[] dc = { 0, 1, 0, -1 }; // 상우하좌

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N + 2][M + 2];
		dist = new int[N + 2][M + 2];
		visited = new boolean[N + 2][M + 2];

		for (int i = 1; i <= N; i++) {
			String s = br.readLine();
			for (int j = 1; j <= M; j++) {
				arr[i][j] = s.charAt(j - 1) - '0';
			}
		}

//		for (int[] a : arr) {
//			System.out.println(Arrays.toString(a));
//		}

		bfs(1, 1);

//		System.out.println("____________________________");
//		for (int[] a : dist) {
//			System.out.println(Arrays.toString(a));
//		}
		System.out.println(dist[N][M]);
	}

	private static void bfs(int r, int c) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] { r, c });
		dist[r][c] = 1;

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int currR = current[0];
			int currC = current[1];

			for (int i = 0; i < 4; i++) {
				visited[r][c] = true;
				int nr = currR + dr[i];
				int nc = currC + dc[i];

				if (arr[nr][nc] == 1 && !visited[nr][nc]) {
					queue.add(new int[] { nr, nc });
					visited[nr][nc] = true;
					dist[nr][nc] = dist[currR][currC] + 1;

				}
			}
		}
	}
}
