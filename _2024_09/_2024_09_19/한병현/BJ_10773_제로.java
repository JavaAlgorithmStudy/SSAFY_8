package _2024_09._2024_09_19.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_10773_제로 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자를 넣고 가장 최근을 지워야하므로 Stack사용
		Stack<Integer> stack = new Stack<>();
		
		// 정수의 개수
		int K = Integer.parseInt(br.readLine());
		
		// K만큼 반복
		for(int i = 0; i < K; i++) {
			
			// 정수를 입력받을 변수
			int num = Integer.parseInt(br.readLine());
			
			// 0이 아니면 넣고
			if(num != 0) {
				stack.add(num);
				
			// 0이면 가장 최근을 제거
			}else {
				stack.pop();
			}
		}
		
		// stack에 담긴 값들을 더함
		long result = 0;
		
		// stack이 빌때까지 반복
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			
			result += temp;
		}
		
		System.out.println(result);
	}
}
