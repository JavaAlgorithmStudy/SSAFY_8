package _2024_09_11.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_10815_숫자카드 {
	static int N, M;
	static int[] card;
	static int[] exam;
	static int[] result;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		// 카드 크기 N과 값을 담을 배열 card 선언 및 초기화
		N = Integer.parseInt(br.readLine());
		card = new int[N];
		
		// card 배열에 정수 입력
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		// 이진 탐색을 하기위한 정렬
		Arrays.sort(card);
		
		// 찾을 정수 개수 M과 담을 배열 exam 선언 및 초기화
		M = Integer.parseInt(br.readLine());
		exam = new int[M];
		
		// 결과를 담을 result 배열
		result = new int[M];
		
		// exam에 정수를 입력
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			exam[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < M; i++) {
			search(i);
			sb.append(result[i]).append(" ");
		}
		
		System.out.println(sb);
	}
	
	static void search(int idx) {
		int L = 0;
		int R = card.length - 1;
		
		while(L <= R) {
			int mid = (L + R) / 2;

			if(card[mid] > exam[idx]) {
				R = mid - 1;
				
			}else if(card[mid] < exam[idx]) {
				L = mid + 1;
				
			}else if(card[mid] == exam[idx]) {
				result[idx] = 1;
				break;
				
			}else {
				result[idx] = 0;
				break;
			}
		}
	}
}

