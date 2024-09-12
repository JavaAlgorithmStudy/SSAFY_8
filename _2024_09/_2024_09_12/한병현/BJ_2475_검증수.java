package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2475_검증수 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		// 제곱한 수들의 합을 저장할 변수 sum
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			int num = Integer.parseInt(st.nextToken());
			sum += num * num;
		}
		// 일의 자리를 출력하기 위해 %10
		System.out.println(sum % 10);
	}
}
