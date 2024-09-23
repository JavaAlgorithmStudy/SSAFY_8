package _2024_09._2024_09_21.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*큐는 인덱스로 순회할 수 없음
queue[i] -> 불가
다른 반복문으로는 가능
for(int i : queue) -> 가능*/

public class BJ_1966_프린터큐 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스 수
		int T = Integer.parseInt(br.readLine());
		
		// 테스트 케이스 만큼 반복
		for(int tc = 1; tc <= T; tc++) {
			
			st = new StringTokenizer(br.readLine());
			
			// 문서의 개수 N, 궁금한 문서 위치 M
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			// 문서를 저장할 큐와 인덱스를 저장할 큐
			Queue<Integer> queue = new LinkedList<>();
			Queue<Integer> index = new LinkedList<>();
			
			// 반복문을 통해 문서와 인덱스를 저장
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				int temp = Integer.parseInt(st.nextToken());
				queue.add(temp);
				index.add(i);
			}
			
			// 뽑은 순서를 저장할 카운트 변수
			int print = 0;
			
			// 반복문을 통해 작업 수행
			while(!queue.isEmpty()) {
				
				// 큐에서 뽑은 값을 임시 저장
				int numT = queue.poll();
				int indexT = index.poll();
				
				// 다시 삽입할지 확인할 boolean 변수
				boolean check = false;
				
				// 뽑은 문서보다 우선순위가 높은게 있다면 true로
				for(int i : queue) {
					if(numT < i) {
						check = true;
					}
				}
				
				// 높은 우선순위가 존재하면 다시 큐에 삽입
				if(check) {
					queue.add(numT);
					index.add(indexT);
				}
				
				// 없다면 그대로 추출
				else {
					print++;
					
					// 처음 문서 인덱스와 동일하다면 저장
					if(indexT == M) {
						sb.append(print).append("\n");
					}
				}
			}
		}
		System.out.println(sb);
	}
}
