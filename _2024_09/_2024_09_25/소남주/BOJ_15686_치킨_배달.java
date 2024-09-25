package _2024_09._2024_09_25.소남주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
[문제 링크]
- https://www.acmicpc.net/problem/15686
*/

/*
[문제 정리
- 1 초 / 512 MB

- 빈 칸: 0  |  집: 1  |  치킨집: 2
- 1 <= 집의 개수 <= 2N

- 치킨 거리 = 집과 가장 가까운 치킨집 사이의 거리
- 도시의 치킨 거리 = 모든 집의 치킨 거리의 합

- 최대 M개를 골랐을 때, 도시의 최소 치킨 거리 구하기
*/

public class BOJ_15686_치킨_배달 {
	
	static BufferedReader br;
	
	static int N; // 도시 길이 (2 <= N <= 50)
	static int M; // 폐업시키지 않을 치킨집의 최대 수 (1 <= M <= 13)
	
	static int[][] CITY;
	
	static List<int[]> HOUSES; // 집 좌표
	
	static List<int[]> STORES; // 치킨집 좌표
	static List<int[]> selectedStore; // 남길 치킨집의 좌표
	
	static int chickenDistanceOfCity;
	
	public static void main(String[] args) throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		CITY = new int[N][N];
		
		HOUSES = new ArrayList<>();
		STORES = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			input = br.readLine().split(" ");
			
			for (int j = 0; j < N; j++) {
				int elem = Integer.parseInt(input[j]);
				
				CITY[i][j] = elem;
				
				if (elem == 1) HOUSES.add(new int[] {i, j});
				else if (elem == 2) STORES.add(new int[] {i, j});
			}
		}
		
		// -------------------------- input --------------------------
		
		chickenDistanceOfCity = Integer.MAX_VALUE;
		
		selectedStore = new ArrayList<>();
		selectStore(0);		
		
		System.out.println(chickenDistanceOfCity);
		
	}
	
	// idx: STORES 인덱스
	static void selectStore(int idx) {
		
		// 기저 조건
		if (selectedStore.size() == M) {			
			getChickenDistance();
			
			return;
		}
		
		if (idx >= STORES.size()) return;
		
		// 재귀 부분
		selectedStore.add(STORES.get(idx));
		selectStore(idx + 1);
		
		selectedStore.remove(selectedStore.size() - 1);
		selectStore(idx + 1);
		
	}
	
	static void getChickenDistance() {
		
		int chickenDist = 0;
		
		for (int[] house: HOUSES) {
			int minDist = Integer.MAX_VALUE;
			
			for (int[] store: selectedStore) {
				
				int dist = Math.abs(house[0] - store[0]) + Math.abs(house[1] - store[1]);
				
				minDist = Math.min(minDist, dist);
				
			}
			
			chickenDist += minDist;
		}
		
		chickenDistanceOfCity = Math.min(chickenDistanceOfCity, chickenDist);
		
	}
	
}