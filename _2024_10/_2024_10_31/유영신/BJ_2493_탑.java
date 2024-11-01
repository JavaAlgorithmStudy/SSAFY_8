package _2024_10._2024_10_31.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_2493_탑 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		Stack<int[]> stack = new Stack<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			stack.add(new int[] { i + 1, num });
		}

		for (int[] a : stack) {
			System.out.println(Arrays.toString(a));
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			int[] tmp = stack.pop();
			while (!stack.isEmpty()) {
				if (stack.peek()[1] > tmp[1]) {
					list.add(stack.peek()[0]);
				} else {
					
				}
			}
		}

	}
}
