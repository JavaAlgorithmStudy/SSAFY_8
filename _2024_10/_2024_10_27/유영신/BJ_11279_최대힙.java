package _2024_10._2024_10_27.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

// 배열에서 가장 큰 값 출력하고 그값을 제거.

public class BJ_11279_최대힙 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		
		// Collections.reverseOrder() 사용함으로써 큰수부터 출력
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (q.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(q.poll()).append("\n");
				}
			} else {
				q.add(x);
			}
		}
		System.out.println(sb);
	}
}
