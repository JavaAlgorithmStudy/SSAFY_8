package _2024_10._2024_10_29.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697_숨바꼭질 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		boolean[] visited = new boolean[K + 2];
		Queue<Integer> queue = new LinkedList<>();
		
		if (N >= K) {
			System.out.println(N - K);
		} else {
			int time = 0;
			queue.offer(N);
			visited[N] = true;

			while (true) {
				int repeat = queue.size();
				
				for (int i = 0; i < repeat; i++) {
					int curr = queue.poll();
					
					if (curr == K) {
						System.out.println(time);
						return;
					}
					
					if (curr - 1 >= 0 && !visited[curr - 1]) {
						visited[curr - 1] = true;
						queue.offer(curr - 1);
					}
					
					if (curr + 1 <= K && !visited[curr + 1]) {
						visited[curr + 1] = true;
						queue.offer(curr + 1);
					}
					
					if (curr * 2 <= K + 1 && !visited[curr * 2]) {
						visited[curr * 2] = true;
						queue.offer(curr * 2);
					}
				}
				
				time++;
			}
			
		}

	}

}