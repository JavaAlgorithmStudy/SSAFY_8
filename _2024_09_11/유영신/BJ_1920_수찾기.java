package _2024_09_11.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이중 for문(O(N^2))을 사용하여 풀이를 하면 시간초과 발생 -> 시간복잡도가 낮은 이분탐색 진행 - O(NlogN)
public class BJ_1920_수찾기 {
	static int[] arrN;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;

		int N = Integer.parseInt(br.readLine());
		arrN = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arrN.length; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}

		// 이분탐색을 위해 배열 오름차순으로 정렬
		Arrays.sort(arrN);

		int M = Integer.parseInt(br.readLine());

		sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		// 값을 입력받으면서 이분탐색 진행. 값이 있으면 return 1, 없으면 return 0
		for (int i = 0; i < M; i++) {
			int result = binarySearch(Integer.parseInt(st.nextToken()), arrN); // 리턴된 값을 result 변수에 담고
			sb.append(result).append('\n'); // sb.append
		}

		System.out.println(sb);

	}

	private static int binarySearch(int i, int[] arrN) {
		int left = 0;
		int right = arrN.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arrN[mid] == i) { // 찾으면 1 반환
				return 1;
			} else if (arrN[mid] < i) { // mid값이 i보다 작다면 -> left 이동
				left = mid + 1;
			} else { // mid값이 i보다 크다면 -> right 이동
				right = mid - 1;
			}
		}
		return 0;
	}
}
