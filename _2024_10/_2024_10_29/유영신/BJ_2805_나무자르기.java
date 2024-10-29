package _2024_10._2024_10_29.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이분탐색. 설정할 높이 H의 최댓값 구하기.
public class BJ_2805_나무자르기 {
	static int N, M;
	static int[] arr;
	static long sum;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 최댓값을 찾기 위해 정렬
		Arrays.sort(arr);

		findHeight(arr);
	}

	private static void findHeight(int[] arr) {
		int bottom = 0;
		int top = arr[N - 1];
		int result = 0;

		while (top >= bottom) {
			int mid = (bottom + top) / 2;
			sum = 0;
			for (int i = 0; i < N; i++) {
				int tree = arr[i] - mid;
				if (tree > 0) { // 이 조건문이 없으면 -값이 더해지게 됨.
					sum += tree;
//					System.out.println(sum);
				}
			}

			// 적어도 M미터의 나무는 확보했으므로 결과값에 저장하고, 
			if (sum >= M) {
				result = mid;
				bottom = mid + 1; // sum == M이 될 수 도 있으니(나무를 덜 잘라도 될수도 있으니) 한번더 시행.
			} else if (sum < M) {
				top = mid - 1;
			}
		}
		System.out.println(result);
	}
}
