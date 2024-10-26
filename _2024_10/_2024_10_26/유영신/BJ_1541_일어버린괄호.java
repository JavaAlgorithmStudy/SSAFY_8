package _2024_10._2024_10_26.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_1541_일어버린괄호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String st = br.readLine();

		String[] divideMinus = st.split("-"); // - 를 기준으로 나눠주기.

		// 55-50+40-30+10
		// [55, 50+40, 30+10]

		int result = 0; // 결과값 담기.

		for (int i = 0; i < divideMinus.length; i++) {
			int sum = 0;

			// +는 "1회 이상 반복"을 의미하는 메타 문자이기 때문에,
			// +를 문자 그대로 사용하고자 할 때는 \\+와 같이 이스케이프 처리해야 한다.
			String[] dividePlus = divideMinus[i].split("\\+"); // + 기준으로 나누기.

			// i = 0 [55]
			// i = 1 [50, 40]
			// i = 2 [30, 10]

			for (String r : dividePlus) {
				sum += Integer.parseInt(r); // i값마다 배열 내 모든 값 더해주기.
			}

			if (i == 0) {
				result += sum; // 처음에 연산이 나올 수 없으므로, 처음은 더해주고,
			} else {
				result -= sum; // 그 후로는 빼준다.
			}

		}
		System.out.println(result);

	}
}
