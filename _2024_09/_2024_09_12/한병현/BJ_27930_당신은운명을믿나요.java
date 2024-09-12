package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_27930_당신은운명을믿나요 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// 점괘 S
		String S = br.readLine();
		
		// 문자찾기위해 문자열을 각 변수에 담아 초기화
		String YONSEI = "YONSEI";
		String KOREA = "KOREA";		
		String result = "";
		
		// 인덱스를 가리킬 변수
		int Y = 0;
		int K = 0;
		
		// 점괘 길이만큼 반복문을 진행
		for(int i = 0; i < S.length(); i++) {
			
			// 해당 문자가 등장할 때 인덱스 1증가
			if(S.charAt(i) == YONSEI.charAt(Y)) {
				Y++;
				
				// 길이만큼 문자를 찾으면 끝
				if(Y == YONSEI.length()) {
					result = YONSEI;
					break;
				}
            }	
			if(S.charAt(i) == KOREA.charAt(K)) {
				K++;
				
				// 길이만큼 문자를 찾으면 끝
				if(K == KOREA.length()) {
					result = KOREA;
					break;
				}			
			}
		}
		System.out.println(result);
	}
}
