package _2024_09._2024_09_11.유영신;

import java.io.*;
import java.util.*;

// 시간제한이 1초라서 이중for문을 통한 탐색은 시간초과가 날 것 같다.
// 탐색시간이 짧은 이분탐색을 사용해 보자.
// 중복된 값들을 전부 찾기 위해 -> 찾는 값보다 큰 위치 - 찾는 값의 첫번쨰 위치
public class BJ_10816_숫자카드2 {
	static int[] arrN; // N개의 숫자를 담을 배열
	static int N, M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		arrN = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrN); // 이분탐색을 위한 정렬

		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			int count = upper(num) - lower(num);
			sb.append(count).append(" ");
		}
		System.out.println(sb.toString());
	}

	public static int lower(int key) {
		int left = 0;
		int right = arrN.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arrN[mid] >= key) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	public static int upper(int key) {
		int left = 0;
		int right = arrN.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arrN[mid] > key) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

}