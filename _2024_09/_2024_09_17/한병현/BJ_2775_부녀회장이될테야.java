package _2024_09._2024_09_17.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2775_부녀회장이될테야 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			// 층수
			int k = Integer.parseInt(br.readLine());
			// 호수
			int n = Integer.parseInt(br.readLine());
			
			// 주어진 호수까지의 크기를 갖는 건물 배열
			int[][] floor = new int[k + 1][n];
			
			// 0층을 초기화
			for(int i = 1; i <= n; i++) {
				floor[0][i - 1] = i;
			}
			
			// 1층 부터 반복
			for(int lv = 1; lv <= k; lv++) {
				
				// n개 이므로 n 미만까지
				for(int room = 0; room < n; room++) {
					
					// 인원수를 더할 임의의 변수
					int pers = 0;
					
					// 이전 층의 1호부터 현재 호수까지 반복하여 더함
					for(int i = 0; i <= room; i++) {
						pers += floor[lv - 1][i];
					}
					
					// 더한 값을 해당 호수에 저장
					floor[lv][room] = pers;
				}
			}
			sb.append(floor[k][n - 1]).append("\n");
		}
		System.out.println(sb);
	}
}
