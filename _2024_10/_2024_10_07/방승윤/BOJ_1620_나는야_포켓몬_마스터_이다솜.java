package _2024_10._2024_10_07.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_1620_나는야_포켓몬_마스터_이다솜 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> dic = new HashMap<>();
		String[] book = new String[N];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			dic.put(str, i);
			book[i] = str;
		}
		
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			
			if (str.matches("[0-9]*")) {
				sb.append(book[Integer.parseInt(str) - 1]).append("\n");
			} else {
				sb.append(dic.get(str) + 1).append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
		
}