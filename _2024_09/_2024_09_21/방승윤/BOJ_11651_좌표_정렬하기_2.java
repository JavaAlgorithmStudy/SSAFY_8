package _2024_09._2024_09_21.방승윤;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_11651_좌표_정렬하기_2 {
	
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int[][] dots = new int[N][2];
        
        for (int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine());
        	dots[i][0] = Integer.parseInt(st.nextToken());
        	dots[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(dots, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] != o2[1]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});
        
        for (int i = 0; i < N; i++) {
        	bw.write(dots[i][0] + " " + dots[i][1] + "\n");
        }
        
        bw.flush();
        
    }
    
}