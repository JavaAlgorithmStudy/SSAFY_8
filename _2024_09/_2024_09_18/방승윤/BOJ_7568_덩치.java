package _2024_09._2024_09_18.방승윤;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_7568_덩치 {
	
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        // 몸무게와 키를 저장할 arr
        int[] arr = new int[N];
        // 순위를 저장할 cnt
        int[] cnt = new int[N];
        
        for (int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine());
        	// 몸무게에 1000을 곱하고 키를 더하면 숫자 하나로 몸무게와 키 저장 가능
        	arr[i] = Integer.parseInt(st.nextToken()) * 1000 + Integer.parseInt(st.nextToken());
        	
        	for (int j = 0; j < i; j++) {
        		// 저장된 숫자에 / 1000을 하면 몸무게가 나오고 % 1000을 하면 키가 나옴
        		// 방금 들어온 친구의 몸무게와 키가 이전에 들어온 친구의 몸무게와 키보다 크면 이전에 들어온 친구의 순위를 1 늘려줌
        		// 방금 들어온 친구의 몸무게와 키가 이전에 들어온 친구의 몸무게와 키보다 작으면 방금 들어온 친구의 순위를 1 늘려줌
        		if (arr[i] / 1000 > arr[j] / 1000 && arr[i] % 1000 > arr[j] % 1000) {
        			cnt[j]++;
        		} else if (arr[j] / 1000 > arr[i] / 1000 && arr[j] % 1000 > arr[i] % 1000) {
        			cnt[i]++;
        		}
        	}
        }
        
        for (int i : cnt) {
        	bw.write(i + 1 + " ");
        }
        
        bw.flush();
        
    }
    
}