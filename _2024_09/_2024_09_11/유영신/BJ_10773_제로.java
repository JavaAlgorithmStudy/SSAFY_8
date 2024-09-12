package _2024_09._2024_09_11.유영신;

import java.io.*;
import java.util.*;

// 0이 아닌 숫자가 들어오면 sum에 더해주고, 0이 나오면 직전값 빼준다.
// 스택을 이용하면 편할 것 같다.
public class BJ_10773_제로 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int K = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();
		int sum = 0;
		for (int i = 0; i < K; i++) {
			int n = Integer.parseInt(br.readLine());

			if (n != 0) { // n이 0이 아니면 push
				stack.push(n);
			} else { // n이 0이면 top에 있는 값 pop
				stack.pop();
			}
		}
		
		// 스택에 쌓여있는 값들을 비어있을때까지 돌면서 sum에 더해준다.
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}
}
