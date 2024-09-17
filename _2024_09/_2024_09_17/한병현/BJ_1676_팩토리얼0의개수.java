package _2024_09._2024_09_17.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1676_팩토리얼0의개수 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// 5의 배수의 개수
		int a = N / 5;
		
		// 25의 배수의 개수
		int b = N / 25;
		
		// 125의 배수의 개수
		int c = N / 125;
		
		int result = a + b + c;
		
		System.out.println(result);
	}
}
