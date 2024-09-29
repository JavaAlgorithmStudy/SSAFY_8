package _2024_09._2024_09_29.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2293_동전_1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] cnt = new int[K + 1];

		// 0원을 만들 수 있는 경우의 수는 1가지
		cnt[0] = 1;

		for (int i = 0; i < N; i++) {
			// 동전의 종류 coin
			int coin = Integer.parseInt(br.readLine());

			// j원을 만드는 경우의 수는 (j - coin)원에 coin원을 더하면 j원이기 때문에 (j - coin)원을 만들 수 있는 경우의 수에
			// coin원을 쓰지 않고 j원을 만드는 경우의 수를 더해주면 된다.
			for (int j = coin; j <= K; j++) {
				cnt[j] += cnt[j - coin];
			}
		}

		System.out.println(cnt[K]);

	}

}