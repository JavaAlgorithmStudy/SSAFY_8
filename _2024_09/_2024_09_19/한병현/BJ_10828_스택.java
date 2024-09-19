package _2024_09._2024_09_19.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_10828_스택 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 명령어의 수
		int N = Integer.parseInt(br.readLine());
		
		// 수를 담고 꺼낼 Stack
		Stack<Integer> stack = new Stack<>();
		
		// 명령어 만큼 반복
		for(int i = 0; i < N; i++) {
			
			String line = br.readLine();
			
			// push가 포함되어있을 경우
			if(line.contains("push")) {
				String[] temp = line.split(" ");
				
				// 숫자 부분을 stack에 담기
				stack.add(Integer.parseInt(temp[1]));
			}
			
			// pop일 경유
			else if(line.contains("pop")) {
				
				// 스택이 비지않았을 경우
				if(!stack.isEmpty()) {
					
					// pop진행
					int num = stack.pop();
					sb.append(num).append("\n");
					
				// 비어있을 경우 -1
				}else {
					sb.append(-1).append("\n");
				}
			}
			
			// size일 경우
			else if(line.contains("size")) {			
				sb.append(stack.size()).append("\n");									
			}
			
			// empty일 경우
			else if(line.contains("empty")) {
				
				// 비어있을 경우 1
				if(stack.isEmpty()) {
					sb.append(1).append("\n");
					
				// 수가 있을 경우 0
				}else {
					sb.append(0).append("\n");
				}
			}
			
			// top일 경우
			else if(line.contains("top")) {
				
				// 비어있을 경우 -1
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(stack.peek()).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
