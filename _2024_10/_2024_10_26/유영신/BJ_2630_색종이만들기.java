package _2024_10._2024_10_26.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2630_색종이만들기 {
	static int N;
	static int[][] arr;
	static int countW, countB;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		countW = 0;
		countB = 0;

		countColor(0, 0, N);

		System.out.println(countW);
		System.out.println(countB);
	}

	private static void countColor(int x, int y, int size) {
		// 영역이 모두 같은 색일 경우(isSameColor == true)
		if (isSameColor(x, y, size)) {
			if (arr[x][y] == 0) {
				countW++;
			} else {
				countB++;
			}
			return;
		}

		// 영역이 모두 같은 색이 아닐경우(isSameColor == false)
		int newSize = size / 2;
		countColor(x, y, newSize); // 왼쪽 위
		countColor(x + newSize, y, newSize); // 오른쪽 위
		countColor(x, y + newSize, newSize); // 왼쪽 아래
		countColor(x + newSize, y + newSize, newSize); // 오른쪽 아래
	}

	private static boolean isSameColor(int x, int y, int size) {
		int color = arr[x][y]; // 각영역별 첫번째 비교대상

		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (arr[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
}
