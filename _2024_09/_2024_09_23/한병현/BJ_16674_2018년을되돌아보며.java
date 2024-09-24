package _2024_09._2024_09_23.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_16674_2018년을되돌아보며 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 처음 입력 수
		String line = br.readLine();
		int N = Integer.parseInt(line);
		
		// 2018 카운팅 배열을 선언
		// 각 인덱스에 해당되는 수를 카운팅
		int[] cnt = new int[10];
		
		// 나머지, 몫 연산을 통해 각 자리수를 탐색, 카운팅 배열을 +1
		while(N > 0) {
			int num = N % 10;
			cnt[num]++;
			N /= 10;
		}
		
		// 결과를 저장할 변수
		int result = 0;
		
		// 0, 1, 2, 8 만으로 구성되어있으면 관련 있는 수 -> 1
		if(cnt[0] + cnt[1] + cnt[2] + cnt[8] == line.length()) {
			result = 1;
			
			// 0, 1, 2, 8 을 모두 포함하면 밀접한 수 -> 2
			if(cnt[0] != 0 && cnt[1] != 0 && cnt[2] != 0 && cnt[8] != 0) {
				result = 2;
				
				// 0, 1, 2, 8 개수가 모두 동일하면 묶여있는 수 -> 8
				if(cnt[0] == cnt[1] && cnt[1] == cnt[2] && cnt[2] == cnt[8]) {
					result = 8;
				}
			}
			
		// 0, 1, 2, 8 이외의 정수가 있다면 관련 없는 수 -> 0
		}else {
			result = 0;
		}
		
		System.out.println(result);
	}
}
