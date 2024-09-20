package _2024_09._2024_09_20.유영신;

import java.io.*;
import java.util.*;

public class BJ_1654_랜선자르기 {
	static int min;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];
		int maxLen = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			maxLen = Math.max(maxLen, arr[i]);
		}
		

		long left = 0;
		long right = maxLen - 1;
		long answer = 0;
		
		while(left <= right) {
			long mid = (left + right) / 2;
			long count = 0;
			for (int i = 0; i < N; i++) {
				count += arr[i] / mid;
			}
			
			if(count >= M) {
				answer = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		System.out.println(answer);

	}
}
