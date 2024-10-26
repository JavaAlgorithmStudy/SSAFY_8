package _2024_10._2024_10_27.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// DFS
public class BJ_21736_헌내기는친구가필요해 {
	static int N, M;
	static int[] dr = { -1, 0, 1, 0 }; // 상우하좌
	static int[] dc = { 0, 1, 0, -1 };
	static char[][] arr;
	static boolean[][] visitied;
	static int count; // 만난 사람의 수

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new char[N][M];
		visitied = new boolean[N][M];

		int x = 0;
		int y = 0;

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j);
				if (arr[i][j] == 'I') { // 도연이의 위치 찾아서 저장.
					x = i;
					y = j;
				}
			}
		}

		count = 0;
		dfs(x, y);

		if (count == 0) {
			System.out.println("TT");
		} else {
			System.out.println(count);
		}

	}

	private static void dfs(int r, int c) {
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			 
			// 범위 내, 방문하지 않은곳, 벽이아닌곳만 가기!
			if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visitied[nr][nc] && arr[nr][nc] != 'X') {
				visitied[nr][nc] = true;
				if (arr[nr][nc] == 'P')
					count++;
				dfs(nr, nc);
			}
		}

	}
}
