package _2024_09._2024_09_17.한병현;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_1920_수찾기 {
	
	static int N, M;
	static long[] A;
	static long[] Ms;
	
	public static void main(String[] args) throws Exception{
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		// 기존 정수의 개수
		N = sc.nextInt();
		
		// 기존 정수들을 갖는 배열
		A = new long[N];
		
		// 기존 배열을 초기화
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		
		// 이진탐색을 사용하기 위한 소팅
		Arrays.sort(A);
		
		// 비교할 정수의 개수
		M = sc.nextInt();
		
		// 비교할 정수들을 갖는 배열
		Ms = new long[M];
		
		// 비교 배열을 초기화
		for(int i = 0; i < M; i++) {
			Ms[i] = sc.nextLong();
		}
		
		// 배열을 순회하면서 수가 존재하는지 이진탐색 활용
		for(int i = 0; i < M; i++) {
			sb.append(search(i, 0 , N - 1)).append("\n");
		}
		
		System.out.println(sb);
	}
	// 이진 탐색 구현
	private static int search(int idx, int left, int right) {
		
		// 중앙 인덱스 변수 선언
		int mid;
		
		// 왼쪽 끝이 오른쪽 끝보다 작거나 같을 때까지 반복
		while(left <= right) {
			
			// 중앙 인덱스 초기화
			mid = (left + right) / 2;
			
			// 비교하는 수가 중앙값보다 작을 경우
			if(A[mid] > Ms[idx]) {
				
				// 오른쪽 끝을 중앙에서 한 칸 왼쪽으로 재설정
				right = mid - 1;
				
			// 비교하는 수가 중앙값보다 클 경우	
			}else if(A[mid] < Ms[idx]) {
				
				// 왼쪽 끝을 중앙에서 한 칸 오른쪽으로 재설정
				left = mid + 1;
			
			// 일치할 경우 1	
			}else {
				return 1;
			}
		}
		
		// 다 찾아도 없으면 0
		return 0;
	}
}
