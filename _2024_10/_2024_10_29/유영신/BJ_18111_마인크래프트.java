package _2024_10._2024_10_29.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_18111_마인크래프트 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N][M]; // 인풋 배열

		int maxHeight = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int land = Integer.parseInt(st.nextToken());
				arr[i][j] = land;
				maxHeight = Math.max(maxHeight, land); // 최댓값 만큼만 카운팅배열의 크기를 지정해주기 위해.
			}
		}

		int[] countArr = new int[maxHeight + 1]; // 땅높이 분포를 확인하기 위한 카운팅 배열

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				countArr[arr[i][j]]++;
			}
		}

//		for(int[] a : arr) {
//			System.out.println(Arrays.toString(a));
//		}
//		
//		System.out.println(Arrays.toString(countArr));

		int time = 0;
		for (int i = 0; i < countArr.length; i++) {
			for (int j = 0; j < countArr.length; j++) {
				time += (countArr[j - i] * 2 * (j - i));
			}
		}

	}
}
