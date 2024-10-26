package _2024_10._2024_10_26.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_2606_바이러스 {
	static int[][] arr;
	static boolean[] visited;
	static int V, E, count;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		V = Integer.parseInt(br.readLine()); // 정점개수

		E = Integer.parseInt(br.readLine()); // 간선개수

		arr = new int[V + 1][V + 1];
		visited = new boolean[V + 1];
		
		count = 0;

		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());

			arr[first][second] = 1; // 무향이므로
			arr[second][first] = 1;
		}
		
		dfs(1);
		
		System.out.println(count);

	}

	private static void dfs(int v) {
		// 방문한 정점은 방문 체크!
		visited[v] = true;
		for (int i = 1; i <= V; i++) {
			// 방문하지 않고, 간선이 존재하는 곳
			if (!visited[i] && arr[v][i] == 1) {
				count++;
				dfs(i);
			}
		}
	}
}
