package _2024_10._2024_10_26.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

// 방문할 수 있는 정점이 여러개인 경우 정점 번호가 작은것을 먼저 방문. 더 이상 방문 불가시 종료.
public class BJ_1260_DFS와BFS {
	static int N, M, V;
	static List<Integer>[] adj;
	static boolean[] visitedDFS, visitedBFS;
	static StringBuilder sb;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		visitedDFS = new boolean[N + 1];
		visitedBFS = new boolean[N + 1];

		adj = new ArrayList[N + 1];

		for (int i = 0; i < N + 1; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());

			int first = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());

			adj[first].add(last);
			adj[last].add(first);
		}

		// 정점 번호가 작은 것을 먼저 방문하기 위해 정렬
		for (int i = 0; i < N + 1; i++) {
			Collections.sort(adj[i]);
		}

		dfs(V);
		sb.append("\n");
		bfs(V);

		System.out.println(sb);
	}

	private static void dfs(int n) {
		visitedDFS[n] = true;
		sb.append(n).append(" ");

		for (int neigbor : adj[n]) {
			if (!visitedDFS[neigbor]) { // 인접 정점중 방문하지 않은것들만.
				dfs(neigbor);
			}
		}

	}

	private static void bfs(int n) {
		Queue<Integer> queue = new LinkedList<>();

		visitedBFS[n] = true;
		queue.add(n);

		while (!queue.isEmpty()) {

			int node = queue.poll();
			sb.append(node).append(" ");

			for (int neigbor : adj[node]) { // 인접 정점을 모두 확인한후
				if (!visitedBFS[neigbor]) { // 방문하지 않았다면 
					visitedBFS[neigbor] = true; // 그때 방문체크.
					queue.add(neigbor);  // 큐에 넣기.

				}
			}
		}

	}
}
