package _2024_10._2024_10_03.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_9012_괄호 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			
			for (int j = 0; j < 50; j++) {
				str = str.replace("()", "");
			}
			
			if (str.equals("")) {
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}
		}
		
		System.out.println(sb);

	}

}