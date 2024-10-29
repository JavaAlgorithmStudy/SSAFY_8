package _2024_10._2024_10_29.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_18870_좌표압축 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N]; // 입력 배열
		int[] sortedArr = new int[N]; // 정렬 배열
		HashMap<Integer, Integer> map = new HashMap<>(); // 중복을 확인하기 위한 HashMap

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sortedArr[i] = arr[i];
		}
		
		Arrays.sort(sortedArr);
		// arr = [2, 4, -10, 4, -9]
		// sortedArr = [-10, -9, 2, 4, 4]
		
		int rank = 0;
		// HashMap()을 이용하여 중복을 제거하면서 등수가 몇등인지(자신보다 작은 값이 몇개인지) 확인.
		for (int i = 0; i < N; i++) {
			if(!map.containsKey(sortedArr[i])) {
				map.put(sortedArr[i], rank);
				rank++;
			}
		}
		
//		System.out.println(map);
		
		// 결과값 출력
		for (int i = 0; i < N; i++) {
			sb.append(map.get(arr[i])).append(" ");
		}
		System.out.println(sb);
	}
}
