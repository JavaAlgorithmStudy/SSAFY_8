package _2024_09._2024_09_11.유영신;

// 스택을 직접 구현하는 문제.
// push, pop, size, empty,top
// push : 스택에 넣기. 출력값 없음.
// pop : 스택이 비어있다면, -1 출력
// size : 스택에 들어있는 정수 개수 출력
// empty : 비어있으면 1, 아니면 0 출력
// top : 스택이 비어있다면, -1 출력

import java.io.*;
import java.util.*;

public class BOJ_10828_스택 {
	static int N; // 명령어 개수
	static int[] stack = new int[N];
	static int result;
	static int top = -1;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			result = 0;
			if(st.nextToken().equals("push")) {
				push(Integer.parseInt(st.nextToken()));
			} else if(st.nextToken().equals("pop")) {
				pop();
				sb.append(result).append("\n");
			} else if(st.nextToken().equals("size")) {
				size();
				sb.append(result).append("\n");
			} else if(st.nextToken().equals("empty")) {
				empty();
				sb.append(result).append("\n");
			} else if(st.nextToken().equals("top")) {
				sb.append(top).append("\n");
			}
		}
		System.out.println(sb);
	}

	private static void empty() {
		if(top == -1) {
			result = 1;
		} else {
			result = 0;
		}
		
	}
	private static void size() {
		for (int i = 0; i < stack.length; i++) {
			if(stack[i] > 0) {
				result++;
			} else {
				break;
			}
		}
		
	}
	private static int pop() {
		if(result == 0) {
			result = -1;
		}
		return stack[top--];
		
	}
	private static void push(int item) {
		if(result == 1) {
			return;
		}
		stack[++top] = item;
	}
}
