package _2024_09._2024_09_19.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_28135_Since1973 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 찾을 수
		int N = Integer.parseInt(br.readLine());
		
		// 50이 포함되어있는지 확인하기 위해 문자열로 변환
		String st = N + "";
		
		// 시작할 수
		int num = 0;
		
		// 카운팅 변수
		int cnt = 0;
		
		// 해당 수까지 반복
		while(num != N) {
			
			// 50이 포함되어있는지 확인하기 위해 임시로 문자열로 변환
			String temp = num + "";
			
			// 포함되어있다면 2번 카운팅
			if(temp.contains("50")) {
				cnt += 2;
				num++;
			}else {
				cnt++;
				num++;
			}
		}
		System.out.println(cnt);
	}
}
