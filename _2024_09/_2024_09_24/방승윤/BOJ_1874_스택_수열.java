package _2024_09._2024_09_24.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874_스택_수열 {
	
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        int idx = 0;

        out : for (int i = 1; i <= N; i++) {
        	// i보다 arr[idx]가 크거나 같으면 stack 안에 없을 것이니 push
        	if (arr[idx] >= i) {
        		sb.append("+\n");
        		stack.push(i);
        	}
        	
        	// idx >= N이면 arr의 index 범위 벗어남
        	// i보다 arr[idx]가 작거나 같으면 stack 안에 들어 있을테니 pop
        	while (idx < N && arr[idx] <= i) {
        		// pop한게 arr[idx]와 같으면 문제 없음
        		if (stack.pop() == arr[idx]) {
        			sb.append("-\n");
        			idx++;
    			// pop한게 arr[idx]와 다르면 sb 초기화하고 NO 넣고 반복문 탈출
        		} else {
        			sb = new StringBuilder();
        			sb.append("NO");
        			break out;
        		}
        	}
        }
        
        System.out.println(sb);
        
    }
    
}