package _2024_09._2024_09_17.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1259_팰린드롬수 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 입력값이 존재하면 반복
		String s;
		
		cycle :
		while((s = br.readLine()) != null) {
			int num = Integer.parseInt(s);
			
			// 결과는 yes로 초기화
			String result = "yes";
			
			// 0이면 끝
			if(num == 0) break;
			
			// 정수열을 문자로 변환후 배열에 저장
			char[] nums = s.toCharArray();
			int size = nums.length;
			
			// 중앙 인덱스를 지정
			int mid = size / 2;
			
			// 중앙까지 반복하며, 앞과 뒤를 하나씩 줄여가며 비교
			for(int i = 0; i < mid; i++) {
				
				// 다를경우
				if(nums[i] != nums[size - 1 - i]) {
					
					// no로 초기화
					result = "no";
					
					// sb에 저장
					sb.append(result).append("\n");
					continue cycle;					
				}
			}
			// 모두 같을 경우 yes를 그대로 sb에 저장
			sb.append(result).append("\n");
		}
		// 전체 결과를 출력
		System.out.println(sb);
	}
}
