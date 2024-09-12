package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11466_Alex_Origami_Squares {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		
		// 종이 높이와 너비를 담을 배열
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		// 만들 수 있는 정사각형의 한변 최대 길이
		double result = 0;
		
		// 정사각형이면 한변의 1/2
		if(h == w) {
			result = (double) h / 2;
		}
		
		// 직사각형이면
		else {
			
			// 긴 변과 짧은 변을 구분
			double a = Math.min(h, w);
			double b = Math.max(h, w);
			
			// 긴 변이 짧은 변 1.5배 이하이면
			if((b / a) <= 1.5) {
				
				// 답은 한변의 절반과 같음
				result = a / 2;
				
			// 1.5배 초과 3배 이하이면
			}else if(1.5 < (b / a) && 3 * a >= b) {
				
				// 긴 변의 1/3과 같음
				result = b / 3;
				
			// 이보다 길다면	
			}else {
				
				// 짧은 변의 길이와 같음
				result = a;
			}
		}
		System.out.println(result);			
	}
}

