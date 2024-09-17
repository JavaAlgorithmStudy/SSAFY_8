package _2024_09._2024_09_17.방승윤;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2750_수_정렬하기_2_3 {
	
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        // 숫자의 범위 -1,000,000 ~ 1,000,000을 담아줄 배열 생성
        boolean[] arr = new boolean[2_000_001];
        
        for (int i = 0; i < N; i++) {
        	// -1,000,000을 0번에 0을 1,000,000번에 1,000,000을 2,000,000번에 저장
        	arr[Integer.parseInt(br.readLine()) + 1_000_000] = true;
        }

        for (int i = 0; i <= 2_000_000; i++) {
        	if (arr[i]) {
        		bw.write(i - 1_000_000 + "\n");        		
        	}
        }

        bw.flush();

    }

}