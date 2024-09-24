package _2024_09._2024_09_23.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1292_쉽게푸는문제 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		// 시작 수 A, 끝 수 B
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		// 수열 사이클 중 해당 수열 사이클까지의 합을 저장할 배열
		// 범위는 0부터 1000까지
		int[] sums = new int[1001];
		
		// 반복문을 통해 배열 초기화
		for(int i = 0; i < 1000; i++) {
			
			// 현재 인덱스에 들어갈 수는 이전 인덱스의 수 + 현재 세려고 하는 수의 개수
			sums[i + 1] = sums[i] + i + 1;
		}
		
		// 수열을 담을 배열을 선언
		int[] nums = new int[1000000];
		
		// 반복문을 통해 배열에 저장
		for(int i = 1; i < 1000; i++) {
			
			// i를 넣을 범위는 sums배열에서 i - 1 부터 i 인덱스 까지
			for(int j = sums[i - 1]; j < sums[i]; j++) {
				nums[j] = i;
			}
		}

		// 결과 계산
		int result = 0;
		for(int i = A - 1; i <= B - 1; i++) {
			result += nums[i];
		}
		
		System.out.println(result);
	}
}
