package _2024_09._2024_09_19.유영신;

import java.io.*;
import java.util.*;

// Queue에 인덱스와 중요도를 저장하고, PriorityQueue를 활용하여 값을 비교하며 원하는 답을 찾는다.
// Collections.reverseOrder()를 이용하여, 내림차순으로 정렬.
public class BJ_1966_프린터큐 {
	static int count;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			Queue<int[]> queue = new LinkedList<>();
			PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int important = Integer.parseInt(st.nextToken());
				queue.add(new int[] { i, important }); // [인덱스, 중요도] 저장
				priorityQueue.add(important); // 중요도만 저장
			}

			count = 0;
			while (!queue.isEmpty()) {
				int[] current = queue.poll();

				if (current[1] == priorityQueue.peek()) { // poll한 배열의 1번인덱스(중요도)가 우선순위큐 peek과 같다면
					priorityQueue.poll(); // 여기서도 poll
					count++; // count 증가

					if (current[0] == M) { // 이중에서 인덱스가 M과 같다면,
						System.out.println(count); // 그게 정답!
						break;
					}
				} else {
					queue.add(current); // poll한 배열의 1번인덱스(중요도)가 우선순위큐 peek과 다르다면?
										// 현재 문서보다 중요도가 높은 문서가 있다는 뜻
				}
			}
		}
	}
}
