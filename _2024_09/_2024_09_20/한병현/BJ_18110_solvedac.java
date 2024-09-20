package _2024_09._2024_09_20.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*<추가 습득 부분>
Math.round(A)
A를 소수점 첫째자리에서 반올림하는 메서드
내부가 이미 int형이라면 반올림은 당연히 일어나지 않으므로
반올림 이전에 () 내부는 실수형이어야한다.*/

public class BJ_18110_solvedac {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 의견 개수
		int n = Integer.parseInt(br.readLine());
		
		// 난이도 의견을 받을 배열 선언
		int[] levels = new int[n];
		
		// 배열에 의견을 할당
		for(int i = 0; i < n; i++) {
			levels[i] = Integer.parseInt(br.readLine());
		}
		
		// 절사평균을 위한 소팅
		Arrays.sort(levels);
		
		// 전체 중 15%를 계산
		int cut = (int)Math.round(n * 0.15);

		// 15%를 제외한 만큼 제외하고 평균 계산
		int sum = 0;
		for(int i = cut; i < n - cut; i++) {
			sum += levels[i];
		}
		
		// 15%를 제외한 사이즈
		int size = n - 2 * cut;

		// 결과도 반올림
		int result = (int)Math.round((double)sum / size);
		System.out.println(result);
	}
}