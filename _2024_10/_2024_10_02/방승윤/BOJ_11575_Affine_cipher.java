package _2024_10._2024_10_02.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11575_Affine_cipher {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			String s = br.readLine();
			
			for (int j = 0; j < s.length(); j++) {
				sb.append((char)((a * (s.charAt(j) - 'A') + b) % 26 + 'A'));
			}
			
			sb.append("\n");
		}
		
<<<<<<< HEAD
=======
		
>>>>>>> 034651bc62f9d0dd204a0a8a8b926c7e88c054d9
		System.out.println(sb);

	}

}