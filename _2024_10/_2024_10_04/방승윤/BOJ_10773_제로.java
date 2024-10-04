package _2024_10._2024_10_04.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10773_제로 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) {
				stack.pop();
				continue;
			} else {
				stack.push(num);
			}
		}
		
		int sum = 0;
		
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		
		System.out.println(sum);
		
	}

}