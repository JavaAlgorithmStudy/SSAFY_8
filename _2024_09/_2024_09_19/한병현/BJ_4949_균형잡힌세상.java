package _2024_09._2024_09_19.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_4949_균형잡힌세상 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String tc = br.readLine();
            if (tc.equals(".")) break;
            
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true; // 균형이 맞는지 확인하는 변수
            
            for (int i = 0; i < tc.length(); i++) {
                char ch = tc.charAt(i);
                
                // 여는 괄호일 경우 스택에 push
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                }
                // 닫는 괄호일 경우 짝이 맞는지 확인
                else if (ch == ')' || ch == ']') {
                    if (stack.isEmpty()) {
                        isBalanced = false; // 스택이 비어있으면 균형이 맞지 않음
                        break;
                    }
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') || (ch == ']' && top != '[')) {
                        isBalanced = false; // 여는 괄호와 닫는 괄호가 짝이 맞지 않음
                        break;
                    }
                }
            }
            
            // 스택이 비어있지 않거나, 이미 균형이 안 맞으면 no 출력
            if (!stack.isEmpty() || !isBalanced) {
                sb.append("no").append("\n");
            } else {
                sb.append("yes").append("\n");
            }
        }
        System.out.println(sb);
    }
}
