package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10250_ACM호텔 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스 T
		int T = Integer.parseInt(br.readLine());
		
		// T만큼 반복
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			
			// 높이 H, 너비 W, 손님 수 N
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			// 층수와 호수 변수
			String floor = (((N - 1) % H) + 1) + "";
			String room = "";
			
			// 일의 자리 수면 0을 앞에 붙여주고
			if(((N - 1)/ H + 1) < 10) {
				room = "0" + (((N - 1)/ H + 1) + "");
			
			// 아니라면 그대로
			}else {
				room = ((N - 1)/ H + 1) + "";				
			}
			
			int result = Integer.parseInt(floor + room);
			
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
}