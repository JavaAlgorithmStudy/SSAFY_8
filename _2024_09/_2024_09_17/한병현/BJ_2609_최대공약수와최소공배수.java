package _2024_09._2024_09_17.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2609_최대공약수와최소공배수 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		
		// 두 자연수 입력
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 최대 공약수 계산
		int Max = 1;
		
		// 새로 담아서 사용할 변수를 선언
		int num1 = N;
		int num2 = M;
		
		// 약수를 계산할 div 변수를 선언 및 초기화
		int div = 2;

		// 더 나눌 수 없을 때까지 반복
		while(num1 > div || num2 > div) {
			if(num1 % div == 0 & num2 % div == 0) {
				Max *= div;
				num1 /= div;
				num2 /= div;
			}else {
				div++;
			}
		}		
		// 최소 공배수 계산
		// 각 수에서 최대 공약수를 나눈 값들을 곱하고
		// 다시 최대 공약수를 곱하면 된다.
		int div1 = N / Max;
		int div2 = M / Max;
		
		int Min = div1 * div2 * Max;
		
		// 두 수가 같다면 최소 공배수, 최대 공약수 또한 같다.
		if(N == M) {
			Max = N;
			Min = N;
		}		
		// 결과를 sb에 저장 및 출력
		sb.append(Max).append("\n");
		sb.append(Min);
		System.out.println(sb);
	}
}
