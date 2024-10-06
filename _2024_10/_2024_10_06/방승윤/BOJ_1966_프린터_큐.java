package _2024_10._2024_10_06.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1966_프린터_큐 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			// 중요도 카운팅
			int[] priCnt = new int[10];
			
			Queue<Integer> queue = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < N; i++) {
				int pri = Integer.parseInt(st.nextToken());
				priCnt[pri]++;
				queue.offer(pri);
			}
			
			// 뽑은 순서 카운트
			int cnt = 1;
			
			// 중요도 9부터 시작
			one: for (int i = 9; i > 0; i--) {
				// 중요도 카운팅이 0이되면 반복문 탈출
				while (priCnt[i] != 0) {
					// 큐에서 뽑아서 num에 저장
					int num = queue.poll();
					// 큐에서 하나를 뽑았으므로 찾아야하는 문서의 위치도 한 칸 앞으로 움직임
					M--;
					
					// 뽑은 문서의 중요도가 i와 같고 우리가 찾는 문서가 아니라면
					if (num == i && M != -1) {
						// 중요도 카운팅을 하나 줄여주고
						priCnt[i]--;
						// 뽑은 순서를 하나 올려줌
						cnt++;
					// 뽑은 문서의 중요도가 i와 같고 우리가 찾는 문서라면
					} else if (num == i && M == -1) {
						// 출력하고 반복문 탈출
						sb.append(cnt).append("\n");
						break one;
					// 뽑은 문서의 중요도가 i와 같지 않다면
					} else if (num != i) {
						// 뽑은 문서가 찾는 문서라면 찾는 문서의 위치가 다시 큐의 마지막으로 이동
						if (M == -1) {
							M = queue.size();
						}
						
						// 다시 큐에다 넣어줌
						queue.offer(num);
					}
				}
				
			}
		}
		
		System.out.println(sb);
			
	}
		
}