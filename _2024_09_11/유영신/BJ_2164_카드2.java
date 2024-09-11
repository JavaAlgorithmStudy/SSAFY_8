package _2024_09_11.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// Queue를 활용하여 poll -> poll + add 반복하다가 마지막으로 poll했을때 queue가 비어있다면, 그 값이 정답
public class BJ_2164_카드2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		// 큐의 사이즈가 1이 될때까지 반복
		while(queue.size() > 1) {
			queue.poll(); // 맨 윗장 버림
			int tmp = queue.poll(); // 맨 윗장 뽑아서
			queue.add(tmp); // 큐의 맨 뒤에 추가
		}

		System.out.println(queue.poll());
	}
}
