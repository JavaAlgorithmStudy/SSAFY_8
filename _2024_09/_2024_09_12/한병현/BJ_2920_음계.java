package _2024_09._2024_09_12.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2920_음계 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 숫자 배열
		int[] music = new int[8];
		
		// 오름차순인지 내림차순인지 확인할 카운트 변수 2개
		int up = 0;
		int down = 0;
		
		// 이전 인덱스보다 커지면 up + 1
		// 작아지면 down + 1
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 8; i++) {
			music[i] = Integer.parseInt(st.nextToken());
			
			if(i >= 1 && music[i] > music[i - 1]) {
				up++;
			}else if(i >= 1 && music[i] < music[i - 1]) {
				down++;
			}
		}
		
        // up으로만 이루어져있으면
		if(up == 7) System.out.println("ascending");
        
        // down으로만 이루어져있으면
		else if(down == 7) System.out.println("descending");
        
        // 아무것도 아니면
		else System.out.println("mixed");
	}
}