package _2024_09._2024_09_12.유영신;

import java.io.*;
import java.util.*;

// 리스트를 이용할 수 있지만, 인덱스 설정이 어려울 것 같아서 큐로 구현
public class BJ_11866_요세푸스문제 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
//       System.out.println(queue);
		while (!queue.isEmpty()) { // 큐가 빌때까지 반복
			for (int i = 0; i < K - 1; i++) { // K = 3이라면 2명만 poll해주고 다시 add
				int tmp = queue.poll();
				queue.add(tmp);
			}
			int result = queue.poll(); // 세번째 사람은 poll 해주고
			sb.append(result).append(",").append(" "); // 결과값에 추가

		}
		sb.delete(sb.length() - 2, sb.length());
		System.out.println(sb.append(">"));
	}
}