package _2024_10._2024_10_23.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ_1003_피보나치함수 {
	static List<Integer> zeroList;
	static List<Integer> oneList;
	static StringBuilder sb;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		zeroList = new ArrayList<>();
		oneList = new ArrayList<>();

		for (int i = 0; i < T; i++) {
			zeroList.clear(); // T값마다 리스트 초기화
			oneList.clear(); // T값마다 리스트 초기화
			zeroList.add(1);
			zeroList.add(0);
			oneList.add(0);
			oneList.add(1);

			int N = Integer.parseInt(br.readLine());

			if (N >= 2) {
				for (int j = 2; j <= N; j++) {
					zeroList.add(zeroList.get(j - 2) + zeroList.get(j - 1));
					oneList.add(oneList.get(j - 2) + oneList.get(j - 1));
				}
			}
			count(N);
		}

		System.out.println(sb);
	}

	private static void count(int N) {
		sb.append(zeroList.get(N)).append(" ").append(oneList.get(N)).append("\n");
	}

}
