package _2024_10._2024_10_27.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

// 절댓값이 가장 작은 값이 여러개일때는, 가장 작은 수 출력.

public class BJ_11286_절댓값힙 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		// comparator로 정렬조건 지정해주기.
		PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (Math.abs(o1) == Math.abs(o2)) { // 절대값 같으면 작은수가 먼저
					return o1 - o2;
				}
				return Math.abs(o1) - Math.abs(o2); // 절대값 다르면 절대값 작은게 먼저
			}

		});

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