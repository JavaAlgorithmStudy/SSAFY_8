package _2024_09._2024_09_20.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_11866_요세푸스문제0 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 사람 수
		int N = Integer.parseInt(st.nextToken());
		
		// 제거될 주기
		int K = Integer.parseInt(st.nextToken());
		
		// 사용할 큐를 선언
		Queue<Integer> queue = new LinkedList<>();
		
		// 큐에 사람들을 저장
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		// 출력 형태 앞부분 먼저 저장
		sb.append("<");
		
		// 큐가 하나 남을 때까지 반복
		// 하나 남기는 이유는 마지막 출력되는 숫자만 형태를 다르게 해주기 위해서
		while(queue.size() > 1) {
			
			// 카운팅은 1부터 시작
			int cnt = 1;
			
			// K를 넘지 않을때까지 반복
			while(cnt < K) {
				
				// 앞부분을 빼서 맨 뒤에 삽입
				int temp = queue.poll();
				queue.add(temp);			
				cnt++;
			}
			
			// K번째가 되었을 때 뽑아서 출력에 저장
			int remove = queue.poll();
			sb.append(remove).append(", ");
		}
		
		// 마지막 하나를 출력
		sb.append(queue.poll()).append(">");
		System.out.println(sb);
	}
}