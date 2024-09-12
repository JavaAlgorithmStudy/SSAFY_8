package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2741_N찍기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// 그냥 숫자 줄바꿈해서 출력하기...
		for(int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}
}
