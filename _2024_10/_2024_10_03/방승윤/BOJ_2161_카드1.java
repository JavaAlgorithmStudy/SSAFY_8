package _2024_10._2024_10_03.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2161_카드1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		
		while (queue.size() > 1) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		sb.append(queue.poll());
		
		System.out.println(sb);

	}

}