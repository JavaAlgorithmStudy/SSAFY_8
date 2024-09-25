package _2024_09._2024_09_25.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_11399_ATM {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 사람의 수 N
		int N = Integer.parseInt(br.readLine());
		
		// 각 사람이 돈을 인출하는데 걸리는 시간을 담은 배열
		int[] time = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		
		// 오름차순일때 최솟값이므로 소팅
		Arrays.sort(time);
		
		// 반복문을 통해 누적합을 구하고 누적합을 다시 결과에 더하기
		int result = 0;
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += time[i];
			result += sum;
		}
		System.out.println(result);
	}
}
