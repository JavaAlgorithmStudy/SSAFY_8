package _2024_09_11.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 총 킬로그램 N(3~5000)이 나오고, 3과5킬로그램 봉지로 N을 만들어야함 -> 최소개수 봉지수 찾기
// DP로 풀어보자. 길이가 N인 배열을 만들고 인덱스 값마다 최적의 봉지수를 입력하기.
// N번 인덱스 값이 0이라면 -1리턴
public class BJ_2839_설탕배달 {
	static int N; // 배달해야하는 양
	static int[] countBag; // 봉지 수 합을 저장할 배열

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		System.out.println(DP(N));

	}

	private static int DP(int i) {
		if (i <= 2)
			return -1;
		if (i == 3)
			return 1;
		if (i == 4)
			return -1;
		if (i == 5)
			return 1;

		countBag = new int[N + 1];

		// 초기값 설정
		for (int j = 0; j <= N; j++) {
			countBag[j] = -1;
		}
		countBag[3] = 1;
		countBag[5] = 1;

		// 처음 풀이 -> 조건문은 그럴싸 하지만 i = 6부터 값을 저장하지 않고 있음.
		// i = 9부터 값이 안나옴 => i = 4는 값이 있지만 i = 6 값이 2로 저장되어있어야 하는데,
		// 초기값 -1이 담겨 있음.
//		if (countBag[i - 3] != 0 && countBag[i - 5] != 0) {
//			return Math.min(countBag[i - 3], countBag[i - 5]) + 1;
//		} else if (countBag[i - 3] != 0 && countBag[i - 5] == 0) {
//			return countBag[i - 3] + 1;
//		} else if (countBag[i - 3] == 0 && countBag[i - 5] != 0)
//			return countBag[i - 5] + 1;
//		return countBag[i];

		// i = 6부터 배열값을 채워나가면서 찾아보자
		for (int j = 6; j <= N; j++) {
			if (countBag[j - 3] != -1) { // 3번전부터 보고 값이 -1이 아니라면, 그 값에 +1
				countBag[j] = countBag[j - 3] + 1;
			}
			if (countBag[j - 5] != -1) { // 5번전을 볼텐데
				// 값이 갱신이 안되었거나, 
				if (countBag[j] == -1 || countBag[j] > countBag[j - 5] + 1) {
					countBag[j] = countBag[j - 5] + 1;
				}
			}
		}
		return countBag[i];
	}
}
