package _2024_10._2024_10_28.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BJ_1269_대칭차집합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		
		// setA에 원소 입력
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		
		// setB에 원소 입력
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < B; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		
		// A - B 계산
        Set<Integer> tempA = new HashSet<>(setA);
        tempA.removeAll(setB); // A에서 B에 있는 원소들을 제거

        // B - A 계산
        Set<Integer> tempB = new HashSet<>(setB);
        tempB.removeAll(setA); // B에서 A에 있는 원소들을 제거

        // 대칭 차집합 크기 출력 (A - B의 원소 수 + B - A의 원소 수)
        int result = tempA.size() + tempB.size();
        System.out.println(result);
		
		
	}
}
