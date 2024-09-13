package _2024_09._2024_09_13.유영신;

import java.io.*;
import java.util.*;

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
			PriorityQueue<Integer> queue = new PriorityQueue<>();
			List<Integer> list = new ArrayList<>();
			
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				list.add(Integer.parseInt(st.nextToken()));
				queue.add(list.get(i));
			}
			
			for (int i = 0; i < N; i++) {
				queue.poll();
				count++;
				if(queue.peek() == list.get(M)) {
					break;
				}
			}
			System.out.println(count);
		}
	}
}
