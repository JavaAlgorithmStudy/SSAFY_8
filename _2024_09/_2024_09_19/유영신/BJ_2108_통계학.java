package _2024_09._2024_09_19.유영신;

import java.io.*;
import java.util.*;

// N은 홀수라고 가정. N = 1 ~ 500,000
// 산술평균, 중앙값, 최빈값, 범위 출력하기.
// 산술평균 -> 소수점 이하 첫째자리에서 반올림
// 최빈값 -> 여러 개 있을 때에는 최빈값 중 두번째로 작은 값 출력
public class BJ_2108_통계학 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		int max = arr[N-1];
		int[] countArr = new int[max];
		int sum = 0;

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			sum += arr[i];
			countArr[num]++;
		}

		Arrays.sort(arr);


		int mean = 0; // 산술평균
		int median = 0; // 중앙값
		int mode = 0; // 최빈값
		int range = 0; // 범위

		mean = sum / N;
		median = arr[N / 2];
		
		for (int i = 0; i < countArr.length; i++) {
			mode = Math.max(mode, i);
	
		}
	

	}
}
