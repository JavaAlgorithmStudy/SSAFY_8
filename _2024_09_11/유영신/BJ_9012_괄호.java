package _2024_09_11.유영신;

import java.io.*;
import java.util.*;

// 균형잡힌세상 문제와 동일
public class BJ_9012_괄호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			String st = br.readLine();
			Stack<Character> stack = new Stack<>();
			boolean isVPS = true;

			for (int j = 0; j < st.length(); j++) {
				char ch = st.charAt(j);

				if (ch == '(') { // 여는 괄호가 나오면 push
					stack.push(ch);
				} else { // 닫는괄호가 나올때,
					if (stack.isEmpty()) { // 스택이 비어있다면
						isVPS = false;
						break;
					}
					stack.pop(); // 스택이 비어있지 않다면 = 여는괄호가 있을테니.. pop
				}
			}

			if (!stack.isEmpty()) { // 여는괄호가 남아있을 수 있다.
				isVPS = false;
			}

			if (isVPS) {
				sb.append("YES").append("\n");
			} else {
				sb.append("NO").append("\n");
			}
		}
		System.out.println(sb);
	}
}
