package _2024_08_29.방승윤;
import java.util.*;
import java.io.*;

public class Solution {
	
	static int N, cnt;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
		
			N = Integer.parseInt(br.readLine());
			cnt = 0;
			
			queen(0, 0, 0, 0);
			
			sb.append("#").append(tc).append(" ").append(cnt).append("\n");
			
		}
		System.out.println(sb);
	}
	
	static void queen(int idx, int down, int left, int right) {

		if (idx == N) {
			cnt++;
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if ((down & (1 << i)) == 0 && (left & (1 << i)) == 0 && (right & (1 << i)) == 0) {
				queen(idx + 1, (down + (1 << i)), ((left + (1 << i)) << 1), ((right + (1 << i)) >> 1));
			}
		}
	}

}