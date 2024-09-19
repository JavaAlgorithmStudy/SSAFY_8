package _2024_09._2024_09_19.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_9012_괄호 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트 케이스 수
		int Tc = Integer.parseInt(br.readLine());
		
		// Tc만큼 반복
		start :
		for(int T = 1; T <= Tc; T++) {
			
			// 주어진 문자열 저장
			String line = br.readLine();
			
			// 문자열을 쪼개 배열로 저장
			char[] ch = line.toCharArray();
			
			Stack<Character> stack = new Stack<>();
			
			// 배열을 순회하면서 VPS인지 판별
			for(int i = 0; i < ch.length; i++) {
				
				// 여는 괄호이면 담음
				if(ch[i] == '(') {
					stack.add(ch[i]);
				}
				
				// 닫는 괄호일 경우
				else if(ch[i] == ')') {
					
					// 스택이 비어있거나 이전에 담긴 것도 닫는 괄호이면 "NO"
					if(stack.isEmpty() || stack.peek() != '(') {
						sb.append("NO").append("\n");
						continue start;
					}
					
					// 정상적이라면 pop
					stack.pop();
				}
			}
			
			// 작업이 끝나도 스택이 비어있지않다면 "NO"
			if(!stack.isEmpty()) {
				sb.append("NO").append("\n");
			}else {
				sb.append("YES").append("\n");
			}
		}
		System.out.println(sb);
	}
}
