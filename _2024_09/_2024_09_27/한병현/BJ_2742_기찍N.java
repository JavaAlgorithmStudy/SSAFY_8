package _2024_09._2024_09_27.한병현;

import java.util.Scanner;

public class BJ_2742_기찍N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		// 자연수 입력
		int N = sc.nextInt();
		
		// 반복문을 통해 저장
		for(int i = N; i >= 1; i--) {
			sb.append(i).append("\n");
		}
		
		System.out.println(sb);
	}
}
