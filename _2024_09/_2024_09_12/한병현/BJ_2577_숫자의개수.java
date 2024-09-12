package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2577_숫자의개수 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 세 정수를 담을 변수
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		// 세 정수를 곱한 수
		int num = A * B * C;
		
		// 사용한 숫자를 세기 위한 cnt 배열
		int[] cnt = new int[10];
		
		// 각 자리 숫자들을 추출
		// 배열에서 해당 숫자의 인덱스를 가질때 +1
		while(num > 0) {
			int temp = num % 10;			
			cnt[temp]++;			
			num /= 10;
		}
		
		// 주어진 형식대로 출력
		for(int i = 0; i < 10; i++) {
			sb.append(cnt[i]).append("\n");
		}
		System.out.println(sb);
	}
}