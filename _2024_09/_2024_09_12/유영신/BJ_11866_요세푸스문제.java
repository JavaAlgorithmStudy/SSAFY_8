package _2024_09._2024_09_12.유영신;

import java.io.*;
import java.util.*;

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
		while (!queue.isEmpty()) {
			for (int i = 0; i < K - 1; i++) {
				int tmp = queue.poll();
				queue.add(tmp);
			}
			int result = queue.poll();
			sb.append(result).append(",").append(" ");

		}
		sb.delete(sb.length() - 2, sb.length());
		System.out.println(sb.append(">"));
	}
}