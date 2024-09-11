package _2024_09._2024_09_11.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// 여는 가로가 나오면 stack에 push, 닫는괄호가 나오면 top에 짝이 맞는 괄호가 있다면 pop
// 닫는 괄호가 나올때, 스택이 비어있거나 짝이맞지않는 괄호가 top에 있다면 X
// 문자열 끝까지 보고 .이 나올때 스택이 비어있다면 = yes
// .이 나올때 스택이 비어있지 않다면 = no

public class BJ_4949_균형잡힌세상 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String st;

		while (!(st = br.readLine()).equals(".")) { // .만 나올때까지 반복
			Stack<Character> stack = new Stack<>();
			boolean isBalanced = true; // 괄호의 짝이 맞는지 확인!

			for (int i = 0; i < st.length(); i++) {
				char ch = st.charAt(i);

				if (ch == '(' || ch == '[') { // 여는 괄호가 나오면 그냥 넣어준다.
					stack.push(ch);
				} else if (ch == ')') { // 닫는 소괄호가 나왔을때,
					if (stack.isEmpty() || stack.peek() != '(') { // 스택이 비어있거나, 짝이 맞지않는 괄호라면
						isBalanced = false;
						break;
					}
					stack.pop(); // 여기는 짝이맞는 괄호만 오게됨 -> pop
				} else if (ch == ']') {
					if (stack.isEmpty() || stack.peek() != '[') { // 스택이 비어있거나, 짝이 맞지않는 괄호라면
						isBalanced = false;
						break;
					}
					stack.pop();
				}

			}
			// 문자열 끝까지 돌고나서 스택을 확인해보자.
			// 스택이 비어있지 않다면 false
			if (!stack.isEmpty()) {
				isBalanced = false;
			}

			// isBalanced가 false라는건 무언가 문제가 있다는 뜻
			if (isBalanced) {
				sb.append("yes").append("\n");
			} else {
				sb.append("no").append("\n");
			}
		}
		System.out.println(sb);
	}
}
