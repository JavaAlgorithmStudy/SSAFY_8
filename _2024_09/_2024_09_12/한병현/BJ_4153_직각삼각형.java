package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_4153_직각삼각형 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String S = "";
		
		// 입력값이 있을 때만 반복
		while((S = br.readLine()) != null) {
			st = new StringTokenizer(S);
			
			// 숫자를 담을 배열
			int[] lines = new int[3];
			
			// 배열을 초기화
			lines[0] = Integer.parseInt(st.nextToken());
			lines[1] = Integer.parseInt(st.nextToken());
			lines[2] = Integer.parseInt(st.nextToken());
			
			// 모든 수가 0으로 입력되면 break
			if(lines[0] == 0 && lines[1] == 0 && lines[2] == 0) {
				break;
			}
			
			// 정렬
			Arrays.sort(lines);
			
			// 각 숫자의 제곱으로 초기화
			int a = lines[0] * lines[0];
			int b = lines[1] * lines[1];
			int c = lines[2] * lines[2];
			
			// 피타고라스 정의를 만족하면 right 아니면 wrong
			if(a + b == c) {
				sb.append("right").append("\n");
			}else {
				sb.append("wrong").append("\n");
			}
		}
		System.out.println(sb);
	}
}
