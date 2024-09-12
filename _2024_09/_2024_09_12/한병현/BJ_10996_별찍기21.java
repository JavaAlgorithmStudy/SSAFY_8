package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10996_별찍기21 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		// 행의 길이는 2N
		for(int i = 1; i <= 2 * N; i++) {
			
			// 홀수 행일 때
			if(i % 2 == 1) {
				
				// 열의 길이는 N
				for(int j = 1; j <= N; j++) {
					
					// 홀수 열이면 *
					if(j % 2 == 1) {
						sb.append("*");
						
						// 짝수 열이면 공백
					}else {
						sb.append(" ");
					}
				}
				
				// 새로운 행으로 넘어가기 전에 줄바꿈
				sb.append("\n");
				
				// 짝수 행일 때
			}else {
				for(int j = 1; j <= N; j++) {
					
					// 홀수 열이면 공백
					if(j % 2 == 1) {
						sb.append(" ");
						
						// 짝수 열이면 *
					}else {
						sb.append("*");
					}
				}
				
				// 새로운 행으로 넘어가기 전에 줄바꿈
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}
