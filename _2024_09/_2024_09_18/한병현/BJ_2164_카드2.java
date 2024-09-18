package _2024_09._2024_09_18.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ_2164_카드2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> cards = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		// 반복문을 통해 큐에 번호를 순서대로 저장
		for(int i = 1; i <= N; i++) {
			cards.add(i);
		}
		
		// 카드가 하나가 남을 때까지 반복
		while(cards.size() > 1) {
			
			// 맨 위 제거
			cards.poll();

			// 다음 맨 위를 맨 마지막으로
			int temp = cards.poll();
			cards.add(temp);
		}
		System.out.println(cards.poll());
	}
}
