package _2024_10._2024_10_23.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BJ_1620_포켓몬마스터이다솜 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 2개의 해시맵 사용
		HashMap<String, Integer> mapS = new HashMap<>(); // 이름,번호
		HashMap<Integer, String> mapI = new HashMap<>(); // 번호,이름
		
		
		for (int i = 1; i <= N; i++) {
			String s = br.readLine();
			mapS.put(s, i);
			mapI.put(i, s);
		}
		
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if('A' <= s.charAt(0) && s.charAt(0) <= 'Z') { // 이름이 들어오면
				sb.append(mapS.get(s));
			} else { 									// 번호가 들어오면
				sb.append(mapI.get(Integer.parseInt(s)));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}	
}
