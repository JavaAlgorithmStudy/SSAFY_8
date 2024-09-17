package _2024_09._2024_09_17.방승윤;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2750_수_정렬하기_2_4 {
	
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int [N];
        int[] answer = new int[N];
        int[] cnt = new int[2_000_001];
        
        for (int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(br.readLine()) + 1_000_000;
//        	arr 5 2 3
        }
        
    	// -1,000,000을 0번에 0을 1,000,000번에 1,000,000을 2,000,000번에 해당하는 인덱스에 숫자를 올려줌
        for (int i = 0; i < N; i++) {
            cnt[arr[i]]++;
//          arr 5 2 3
//          cnt 0 1 1 0 1
        }

        // cnt를 누적합으로 바꿔줌
        for (int i = 1; i <= 2_000_000; i++) {
        	cnt[i] += cnt[i - 1];
//        	cnt 0 1 2 2 3
        }
        
        // arr[i] 값의 인덱스 번호에 해당하는 cnt값의 -1 값의 인덱스 번호에 해당하는 answer에 arr[i]를 넣어줌
        for (int i = N - 1; i >= 0; i--) {
        	answer[--cnt[arr[i]]] = arr[i];
        }
        
        for (int i = 0; i < N; i++) {
        	bw.write(answer[i] - 1_000_000 + "\n");
        }

        bw.flush();

    }

}
