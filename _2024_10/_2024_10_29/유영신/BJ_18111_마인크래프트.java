package _2024_10._2024_10_29.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_18111_마인크래프트 {
	static int N, M, B;
	static int[][] arr;
	static int maxHeight, minHeight;
	static int time, height;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		arr = new int[N][M]; // 인풋 배열

		maxHeight = Integer.MIN_VALUE;
		minHeight = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int land = Integer.parseInt(st.nextToken());
				arr[i][j] = land;
				maxHeight = Math.max(maxHeight, land);
				minHeight = Math.min(minHeight, land);
			}
		}

		// 최소 높이 ~ 최대 높이까지 확인.
		time = Integer.MAX_VALUE;
		height = 0;

		for (int i = minHeight; i <= maxHeight; i++) {
			int tmp = timeSum(i);
			if (time >= tmp) {
				time = tmp;
				height = i;
			}
		}
		System.out.println(time + " " + height);
	}

	private static int timeSum(int i) {
		int removeblock = 0; // 제거할 블록 수
		int addblock = 0; // 추가할 블록 수
		int totalTime = 0; // 총 시간

		for (int j = 0; j < N; j++) {
			for (int k = 0; k < M; k++) {
				if (arr[j][k] > i) {
					removeblock += arr[j][k] - i; // 현재 높이보다 크면 블록 제거
					totalTime += 2 * (arr[j][k] - i); // 제거 시 2초 소요
				} else if (arr[j][k] < i) {
					addblock += i - arr[j][k]; // 현재 높이보다 낮으면 블록 추가
					totalTime += i - arr[j][k]; // 추가 시 1초 소요
				}
			}
		}

		// 블록 인벤토리로 블록을 충분히 추가할 수 있는지 확인
		if (removeblock + B >= addblock) {
			return totalTime;
		} else {
			return Integer.MAX_VALUE; // 블록이 부족하면 불가능한 값 반환
		}
	}

}
