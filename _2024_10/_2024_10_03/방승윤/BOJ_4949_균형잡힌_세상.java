package _2024_10._2024_10_03.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949_균형잡힌_세상 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		one: while (true) {
			String str = br.readLine();
			
			if (str.equals(".")) {
				break;
			}
			
			Stack<Character> stack = new Stack<>();
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if (stack.isEmpty() && (c == ')' || c == ']')) {
					sb.append("no\n");
					continue one;
				}
				
				if (c == '(' || c == '[') {
					stack.push(c);
				} else if (c == ')') {
					if (stack.pop() != '(') {
						sb.append("no\n");
						continue one;
					}
				} else if (c == ']') {
					if (stack.pop() != '[') {
						sb.append("no\n");
						continue one;
					}
				}
			}
			
			if (stack.isEmpty()) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
		}
		
		System.out.println(sb);

	}

}