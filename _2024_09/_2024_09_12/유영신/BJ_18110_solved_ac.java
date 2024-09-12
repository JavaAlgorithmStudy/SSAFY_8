package _2024_09._2024_09_12.유영신;

import java.io.*;
import java.util.*;

// 30% 절사 평균을 구하는 문제
// 특별한 알고리즘은 필요 없고, 반올림계산 과정에 신경써서 풀이한다.
public class BJ_18110_solved_ac {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(arr);
//		System.out.println(arr);

		int percent = (int) Math.round(n * 0.15); // 반올림하고 int형으로 형변환
//		System.out.println(percent);

		double sum = 0;
		for (int i = percent; i < n - percent; i++) { // 상위, 하위 percent만큼을 제외한 값들을 더해주고
			sum += arr.get(i);
		}

		int result = (int) Math.round(sum / (n - (2 * percent))); // 평균을 구한다. 이때도 반올림 시행
		System.out.println(result);
	}
}
