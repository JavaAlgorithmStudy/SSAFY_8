package _2024_10._2024_10_23.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_1764_듣보잡 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), 1);
		}

		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (map.containsKey(s)) { // 이미 값이 있다면, 리스트에 담아줌
				list.add(s);
			}
		}

		Collections.sort(list); // 사전순으로 정렬
		
		sb.append(list.size()).append("\n");

		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
	}
}
