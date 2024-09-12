package _2024_09._2024_09_12.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2839_설탕_배달 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int answer = -1;
		
		
		// 5kg 봉지를 N / 5개부터 하나씩 줄여가면서 남은 무게가 3kg으로 나누어 떨어지는지 확인
		for (int i = N / 5; i >= 0; i--) {
			if (i == 0) {
				if (N % 3 == 0) {
					answer = N / 3;
				}
			} else if ((N - (5 * i)) % 3 == 0) {
				answer = i + (N - (5 * i)) / 3;
				break;
			}
		}
		
		System.out.println(answer);
		
	}
	
}
