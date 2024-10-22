package _2024_10._2024_10_22.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17162_가희의_수열놀이_small {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int Q = Integer.parseInt(st.nextToken());
		int mod = Integer.parseInt(st.nextToken());
		Stack<Integer> arr = new Stack<>();
		Stack<Integer>[] cnt = new Stack[mod];
		
		for (int i = 0; i < mod; i++) {
			cnt[i] = new Stack<>();
		}
		
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			one: switch (st.nextToken()) {
			case "1":
				int num = Integer.parseInt(st.nextToken()) % mod;
				arr.push(num);
				cnt[num].push(arr.size());
				break;
			case "2":
				if (!arr.isEmpty()) {
					cnt[arr.pop()].pop();
				}
				break;
			case "3":
				int min = Integer.MAX_VALUE;
				for (int j = 0; j < mod; j++) {
					if (cnt[j].isEmpty()) {
						sb.append("-1\n");
						break one;
					}
					min = Math.min(min, cnt[j].peek());
				}
				sb.append(arr.size() + 1 - min).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
		
	}

}