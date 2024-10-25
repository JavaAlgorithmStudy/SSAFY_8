package _2024_10._2024_10_08.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성

// add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
// remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
// check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
// toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
// all: S를 {1, 2, ..., 20} 으로 바꾼다.
// empty: S를 공집합으로 바꾼다.

public class BJ_11723_집합 {
	static int M;
	static List<String> list;
	static StringTokenizer st;
	static int result;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		M = Integer.parseInt(br.readLine());
		list = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			String op = st.nextToken();
			result = 0;
			operation(op);
		}

	}

	private static void operation(String op) {
		if (op.equals("add")) {
			String num = st.nextToken();
			if (!list.contains(num)) {
				list.add(num);
			}
		} else if (op.equals("remove")) {
			String num = st.nextToken();
			if (list.contains(num)) {
				list.remove(num);
			}
		} else if (op.equals("check")) {
			String num = st.nextToken();
//			System.out.println("num =" + num);
			if (list.contains(num)) {
				result = 1;
			} else {
				result = 0;
			}
			System.out.println(result);

		} else if (op.equals("toggle")) {
			String num = st.nextToken();
			if (list.contains(num)) {
				list.remove(num);
			} else { 
				list.add(num);
			}

		} else if (op.equals("all")) {
			for (int i = 1; i <= 20; i++) {
				list.add(String.valueOf(i));
			}
		} else if (op.equals("empty")) {
			list.clear();
		}
	}
}
