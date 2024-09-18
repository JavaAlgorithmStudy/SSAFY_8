package _2024_09._2024_09_18.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_20361_일우는야바위꾼 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		// 컵의 개수
		int N = Integer.parseInt(st.nextToken());
		
		// 공의 위치
		int X = Integer.parseInt(st.nextToken());
		
		// 교환 횟수
		int K = Integer.parseInt(st.nextToken());
		
		// 컵의 배열을 만든다
		// 1부터 시작하기에 크기는 N + 1
		int[] cups = new int[N + 1];
		
		// 공이 있는 인덱스를 초기화
		cups[X] = 1;
		
		// 교환 작업
		for(int i = 1; i <= K; i++) {
			st = new StringTokenizer(br.readLine());
			
			// 교환 하려는 두 컵
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			// 공이 있는 컵을 교환하려 할때만 진행
			if(A == X) {
				cups[B] = 1;
				cups[A] = 0;
				X = B;
			}else if(B == X) {
				cups[A] = 1;
				cups[B] = 0;
				X = A;
			}
		}
		System.out.println(X);
	}
}
