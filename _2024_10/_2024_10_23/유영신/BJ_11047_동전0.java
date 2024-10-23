package _2024_10._2024_10_23.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11047_동전0 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int minCount = 0;

//		for (int i = arr.length - 1; i >= 0; i--) {
//			while (K >= arr[i]) {
//				K -= arr[i];
//				minCount++;
//			}
//		}

		for (int i = arr.length - 1; i >= 0; i--) {
			while (K / arr[i] != 0) {
				minCount += K / arr[i];
				K -= arr[i] * (K / arr[i]);
			}
		}
		System.out.println(minCount);

	}
}
