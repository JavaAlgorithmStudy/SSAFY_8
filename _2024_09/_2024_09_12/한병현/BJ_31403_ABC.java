package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_31403_ABC {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 세 가지 정수를 담을 변수
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		// 중간에 문자열로 변환하여 계산하기 위한 변수
		String ac = A + "";
		String bc = B + "";
		
		// 정수형으로 계산한 결과를 담을 변수
		int result1 = 0;
		
		// 문자형 계산 후, 정수로 변환하여 계산한 결과를 담을 변수
		int result2 = 0;
		
		result1 = A + B - C;
		result2 = Integer.parseInt(ac + bc) - C;
		
		sb.append(result1).append("\n").append(result2);
		System.out.println(sb);
	}
}