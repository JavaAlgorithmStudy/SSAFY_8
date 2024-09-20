package _2024_09._2024_09_20.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1929_소수구하기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		// 두 자연수를 담는 배열
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		// 주어진 범위 만큼 크기를 갖는 카운팅 배열을 선언
		// 0부터 존재하므로 배열크기는 +1
		int[] nums = new int[1000001];
		
		// 반복문을 통해 i로 나누어지는 인덱스를 1로 변경
		// 소수는 2부터 시작, N의 절반을 넘을 수 없으므로 범위 설정
		for(int i = 2; i <= N / 2; i++) {
			
			// 자기 자신을 제외한 배수들을 고르는 작업
			// 범위가 N / 2이기 때문에 소수가 골라질 일이 없다.
			for(int j = i * 2; j <= N; j += i) {
				nums[j] = 1;
			}
		}
		
		// 1은 소수가 아니므로 제외
		if(nums[1] == 0) nums[1] = 1;
		
		// 반복문으로 0인 인덱스만 추출
		for(int i = M; i <= N; i++) {
			if(nums[i] == 0) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
}
