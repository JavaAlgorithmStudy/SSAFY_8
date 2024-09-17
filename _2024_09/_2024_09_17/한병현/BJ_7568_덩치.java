package _2024_09._2024_09_17.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_7568_덩치 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// 사람 수
		int N = Integer.parseInt(br.readLine());
		
		// 키와 몸무게를 담을 배열
		int[] x = new int[N];
		int[] y = new int[N];
		
		// 반복문으로 배열 초기화
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		// 비교하여 키와 몸무게 둘 다 큰 경우를 카운팅
		for(int i = 0; i < N; i++) {
			
			// 비교할 때마다 카운팅 초기화
			// 순위 이므로 시작은 1
			int cnt = 1;
			
			Com :
			for(int j = 0; j < N; j++) {
				
				// 비교하는 수가 자기 자신일 경우 continue
				if(i == j) continue Com;
				
				// 둘 다 클 경우
				if(x[i] < x[j] && y[i] < y[j]) {
					cnt++;
				}
			}
			// 해당 순위를 결과에 저장
			sb.append(cnt).append(" ");
		}
		System.out.println(sb);
	}
}
