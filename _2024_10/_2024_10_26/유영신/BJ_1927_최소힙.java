package _2024_10._2024_10_26.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 우선순위 큐 사용해보자.
public class BJ_1927_최소힙 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> q = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if (x == 0) {
				if (q.isEmpty()) { // 비어있으면 0출력
					sb.append(0).append("\n");
				} else {
					sb.append(q.peek()).append("\n"); // 아니면 가장 작은값 출력
					q.poll();
				}
			} else {  // 0이 아닌 자연수는 q.add()
				q.add(x);
			}

		}
		System.out.println(sb);
	}
}
