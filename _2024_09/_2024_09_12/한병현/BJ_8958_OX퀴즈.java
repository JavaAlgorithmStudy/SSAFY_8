package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_8958_OX퀴즈 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스 수 
		int T = Integer.parseInt(br.readLine());
		
		// T만큼 반복
		for(int tc= 1; tc <= T; tc++) {
			
			// OX답을 담을 result
			String result = br.readLine();
			
			// 문제당 점수
			int score = 0;
			
			// 총 점수
			int sum = 0;
			
			// OX답 길이만큼 반복
			for(int i = 0; i < result.length(); i++) {
				
				// O면 배점이 1씩 증가하고 총점에 추가
				if(result.charAt(i) == 'O') {
					score++;
					sum += score;
					
				// X면 배점이 0으로 다시 초기화
				}else {
					score = 0;
					sum += score;
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}