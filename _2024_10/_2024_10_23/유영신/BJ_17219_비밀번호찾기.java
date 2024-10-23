package _2024_10._2024_10_23.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_17219_비밀번호찾기 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String siteAddress = st.nextToken();
			String password = st.nextToken();
			map.put(siteAddress, password);
		}
		
		for (int i = 0; i < M; i++) {
			String find = br.readLine();
			if(map.containsKey(find)) {
				sb.append(map.get(find)).append("\n");
			}
		}
		System.out.println(sb);
	}
}
