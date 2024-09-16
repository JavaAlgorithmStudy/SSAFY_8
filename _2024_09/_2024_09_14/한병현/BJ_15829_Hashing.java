package _2024_09._2024_09_14.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_15829_Hashing {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int r = 31;
		int M = 1234567891;
		
		// 문자열 길이
		long L = (long)Integer.parseInt(br.readLine());
		
		// 문자를 담을 변수
		String S= br.readLine();
		
		// 결과를 담을 변수
		long result = 0;
		
		// 제곱할 수
		long pow = 1;
		for(int i = 0; i < L; i++) {
			result += ((S.charAt(i) - 96) * pow);
			
			//pow는 31을 매번 곱해준다. 
			//곱해줄때마다 1234567891을 나눠주면 long을 넘지 않을 것이다.
			pow = (pow * 31) % M;
		}
		System.out.println(result % M);
	}
}
