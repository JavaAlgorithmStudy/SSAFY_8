package _2024_09_10.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1676_팩토리얼_0의_개수 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.print(N / 5 + N / 25 + N / 125);
		
	}
	
}