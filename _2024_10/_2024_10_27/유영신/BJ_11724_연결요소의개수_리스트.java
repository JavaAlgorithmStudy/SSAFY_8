package _2024_10._2024_10_27.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

// 인접행렬 vs 인접리스트 2가지 방법으로 풀어보기.
public class BJ_11724_연결요소의개수_리스트 {
	static int N, M;
	static List<Integer>[] list;
	static boolean[] visited; // 방문체크
	static int count; // 연결 요소의 개수

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		list = new ArrayList[N + 1];

		for (int i = 0; i < list.length; i++) {
			list[i] = new ArrayList<>();
		}

		visited = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());

			list[first].add(last);
			list[last].add(first);

		}
		count = 0;
		for (int i = 1; i <= N; i++) {
//			System.out.println(Arrays.toString(visited));
			if (!visited[i]) { // 방문체크가 안됐다는거는 새로운 연결요소라는 뜻
				count++;
				check(i);
			}
		}

		System.out.println(count);

	}

	private static void check(int V) {

		visited[V] = true;

		for (int m : list[V]) {
			if (!visited[m]) {
				visited[m] = true;
				check(m);
			}
		}
	}
}
