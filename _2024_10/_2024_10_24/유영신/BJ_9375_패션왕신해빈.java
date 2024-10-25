package _2024_10._2024_10_24.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BJ_9375_패션왕신해빈 {
	static int result;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());

			if (n == 0) {
				System.out.println(0);
				continue;
			}

			Map<String, Integer> map = new HashMap<>();

			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				String var = st.nextToken();

				if (map.containsKey(var)) {
					map.put(var, map.get(var) + 1); // 이미 있으면 + 1
				} else {
					map.put(var, 1); // 이미 없으면 새롭게 1
				}
			}
			
			result = 1;
			for (int count : map.values()) {
				result *= (count + 1);
				}
			System.out.println(result - 1); // 공집합은 빼준다.

		}
	}
}
