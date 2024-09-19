package _2024_09._2024_09_19.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_14682_ShiftySum {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 시작 수
		String N = br.readLine();
		
		// shifting 횟수
		int k = Integer.parseInt(br.readLine());
		
		// 더한 결과를 담을 변수
		int result = Integer.parseInt(N);
		
		// k만큼 반복
		for(int i = 0; i < k; i++) {
			N += "0";
			result += Integer.parseInt(N); 
		}
		System.out.println(result);
	}
}

