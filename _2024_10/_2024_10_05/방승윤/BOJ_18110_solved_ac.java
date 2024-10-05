package _2024_10._2024_10_05.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_18110_solved_ac {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); 
		int[] cntLevel = new int[31];
		int level = 0;
		
		for (int i = 0; i < N; i++) {
			cntLevel[Integer.parseInt(br.readLine())]++;
		}
		
		// 아래 절삭평균
		int lower = (int) Math.round(N * 0.15);
		// 뽑아야하는 개수
		int upper = N - 2 * lower;
		// 뽑은 개수
		int cnt = 0;
		// 난이도
		int idx = 1;
		
		// N이 0이면 level은 0이므로 N일 때 while 들어가지 않음
		while (true && N != 0) {
			// 절삭 평균의 수 만큼 카운트 하지 않음
			if (cntLevel[idx] <= lower) {
				lower -= cntLevel[idx++];
			} else {
				// 절삭 평균의 수 만큼 카운트 하지 않고 카운트함
				cnt += cntLevel[idx] - lower;
				// 해당 난이도를 카운트한 숫자만큼 곱해줌
				level += idx * (cntLevel[idx] - lower);
				// 절삭 평균의 수 만큼 넘겼으므로 lower를 0으로 초기화
				lower = 0;
				
				// cnt를 뽑아야하는 만큼 뽑았다면
				if (cnt >= upper) {
					// 초과로 뽑은걸 제거해주고 반복문 탈출
					level -= idx * (cnt - upper);
					break;
				}
				
				// cnt를 뽑아야하는 만큼 뽑지 않았다면 다음 난이도로 넘어감
				idx++;
			}
			
			
		}
		
		// 난이도를 평균으로 만들어줌
		System.out.println(Math.round((double) level / upper));

	}

}