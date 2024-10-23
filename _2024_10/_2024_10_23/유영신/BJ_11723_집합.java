package _2024_10._2024_10_23.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

//비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성

//add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
//remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
//check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
//toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
//all: S를 {1, 2, ..., 20} 으로 바꾼다.
//empty: S를 공집합으로 바꾼다.

public class BJ_11723_집합 {
	static int M;
	static HashSet<Integer> set;
	static StringTokenizer st;
	static int result;
	static StringBuilder sb;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		M = Integer.parseInt(br.readLine());
		set = new HashSet<>();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			String op = st.nextToken();
			operation(op);
		}
		System.out.println(sb);

	}

	private static void operation(String op) {
		if (op.equals("add")) {
			int num = Integer.parseInt(st.nextToken());
			set.add(num);

		} else if (op.equals("remove")) {
			int num = Integer.parseInt(st.nextToken());
			set.remove(num);

		} else if (op.equals("check")) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(set.contains(num) ? "1" : "0");
			sb.append("\n");

		} else if (op.equals("toggle")) {
			int num = Integer.parseInt(st.nextToken());
			if (set.contains(num)) {
				set.remove(num);
			} else {
				set.add(num);
			}

		} else if (op.equals("all")) {
			set.clear();
			for (int i = 1; i <= 20; i++) {
				set.add(i);
			}

		} else if (op.equals("empty")) {
			set.clear();
		}
	}
}
