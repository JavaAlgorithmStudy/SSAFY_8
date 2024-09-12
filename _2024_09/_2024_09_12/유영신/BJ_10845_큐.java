package _2024_09._2024_09_12.유영신;

import java.io.*;
import java.util.*;

// 큐를 직접 구현하는 문제.
// push, pop, size, empty, front, back
// push : 스택에 넣기. 출력값 없음.
// pop : 스택이 비어있다면 -1 출력. 가장 앞에 있는 정수 빼기
// size : 스택에 들어있는 정수 개수 출력
// empty : 비어있으면 1, 아니면 0 출력
// front : 스택이 비어있다면, -1 출력. 가장 앞에 있는 정수 출력
// back : 스택이 비어있다면, -1 출력. 가장 뒤에 있는 정수 출력
public class BJ_10845_큐 {
	static int N;
	static int[] queue;
	static int first = -1;
	static int last = -1;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		queue = new int[N];

		for (int i = 0; i < queue.length; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			if (command.equals("push")) {
				push(Integer.parseInt(st.nextToken()));
			} else if (command.equals("pop")) {
				sb.append(pop()).append("\n");
			} else if (command.equals("size")) {
				sb.append(size()).append("\n");
			} else if (command.equals("empty")) {
				sb.append(empty()).append("\n");
			} else if (command.equals("front")) {
				sb.append(front()).append("\n");
			} else if (command.equals("back")) {
				sb.append(back()).append("\n");
			}
		}
		System.out.println(sb);
	}

	private static void push(int item) {
		queue[++last] = item;
	}
	
	private static int pop() {
		if(first == last) {
			return -1;
		}
		return queue[++first];
	}
	
	private static int size() {
		return last - first;
	}
	
	private static int empty() {
		if(first == last) {
			return 1;
		}
		return 0;
	}
	
	private static int front() {
		if(first == last) {
			return -1;
		}
		return queue[first + 1];
	}
	
	private static int back() {
		if(first == last) {
			return -1;
		}
		return queue[last];
	}
}
