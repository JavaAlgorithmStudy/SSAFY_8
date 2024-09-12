package _2024_09._2024_09_12.유영신;

// 스택을 직접 구현하는 문제.
// push, pop, size, empty,top
// push : 스택에 넣기. 출력값 없음.
// pop : 스택이 비어있다면, -1 출력
// size : 스택에 들어있는 정수 개수 출력
// empty : 비어있으면 1, 아니면 0 출력
// top : 스택이 비어있다면, -1 출력

import java.io.*;
import java.util.*;

public class BJ_10828_스택 {
    static int N; // 명령어 개수
    static int[] stack;
    static int top = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        stack = new int[N]; // N 크기로 스택 배열 초기화

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken(); // 명령어 추출

            if (command.equals("push")) {
                push(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                sb.append(pop()).append("\n");
            } else if (command.equals("size")) {
                sb.append(size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(empty()).append("\n");
            } else if (command.equals("top")) {
                sb.append(top()).append("\n");
            }
        }
        System.out.print(sb);
    }

    private static void push(int item) {
        stack[++top] = item;
    }

    private static int pop() {
        if (top == -1) { // 스택이 비어있다는 뜻
            return -1;
        }
        return stack[top--]; // 비어있지 않다면 stack[top] 출력하고, top--
    }

    private static int size() {
        return top + 1;
    }

    private static int empty() {
        return (top == -1) ? 1 : 0; // 비어있으면 1, 아니면 0
    }

    private static int top() {
        if (top == -1) { // 스택이 비어있다면
            return -1;
        }
        return stack[top]; // 비어있지 않다면 stack[top] 출력만
    }
}
