package _2024_09._2024_09_20.유영신;

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

		int sum = 0;

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			sum += arr[i];
		}

		Arrays.sort(arr);

		boolean flag = false; // 두번쨰로 작은 최빈값을 찾기위한 flag
		int mode_max = 0; // 최빈값의 최대 출현 횟수

		int max = arr[N - 1];
		int min = arr[0];

		int mean = 0; // 산술평균
		int median = 0; // 중앙값
		int mode = 10000; // 최빈값
		int range = 0; // 범위


		for (int i = 0; i < N; i++) {
			int jump = 0;
			int count = 1;
			int i_value = arr[i];

			for (int j = i + 1; j < N; j++) {
				if (i_value != arr[j]) {
					break;
				}
				count++;
				jump++;
			}

			if (count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true;
				
			} else if (count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}

			i += jump;
		}

		mean = (int) Math.round((double) sum / N);
		median = arr[N / 2];
		range = max - min;
		
		
		System.out.println(mean);
		System.out.println(median);
		System.out.println(mode);
		System.out.println(range);

	}
}
