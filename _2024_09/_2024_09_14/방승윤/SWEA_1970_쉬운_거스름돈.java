package _2024_09._2024_09_14.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1970_쉬운_거스름돈 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			
			int N = Integer.parseInt(br.readLine());
			int[] cnt = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
			
			for (int i = 0; i < 8; i++) {
				if (N != 0) {
					int temp = cnt[i];
					cnt[i] = N / cnt[i];
					N %= temp;					
				} else {
					cnt[i] = 0;
				}
			}
			
			sb.append("#").append(tc).append(" ").append("\n");
			
			for (int i = 0; i < 8; i++) {
				sb.append(cnt[i]).append(" ");
			}
			
			sb.append("\n");
			
		}
		
		System.out.println(sb);
		
	}
	
}