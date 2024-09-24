package _2024_09._2024_09_24.방승윤;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_2108_통계학 {
	
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[8001];
        int[] arr = new int[N];
        int maxCnt = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double total = 0;
        
        for (int i = 0; i < N; i++) {
        	// 배열에 숫자 넣어줌
        	arr[i] = Integer.parseInt(br.readLine());
        	// max 갱신
        	max = Math.max(max, arr[i]);
        	// min 갱신
        	min = Math.min(min, arr[i]);
        	// cnt 배열 0번에 -4000, 4000번에 0, 8000번에 4000을 기준으로 숫자의 번호에 +1 
        	// 최빈값의 등장 횟수의 최댓값 갱신 
        	maxCnt = Math.max(maxCnt, ++cnt[arr[i] + 4000]);
        	// 합에 숫자를 더해줌
        	total += arr[i];
        }
        
        // 산술평균
        // 합을 N으로 나누고 반올림
        bw.write((int) Math.round(total / N) + "\n");
        
        // arr 배열을 정렬
        Arrays.sort(arr);
        
        // 중앙값
        bw.write(arr[N / 2] + "\n");
        
        int modeCnt = 0;
        int mode = 0;
        
        for (int i = 0; i < 8001; i++) {
        	// i가 최빈값이라면 최빈값 갱신하고 최빈값 카운트 +1
        	if (cnt[i] == maxCnt) {
        		mode = i - 4000;
        		modeCnt++;
        	}
        	
        	// 최빈값 카운트가 2라면 두번째로 작은 최빈값을 찾았으므로 break
        	if (modeCnt == 2) {
        		break;
        	}
        }
        // for 반복문을 나왔다면 하나뿐인 최빈값을 찾았거나 두번째로 작은 최빈값을 찾음
        
        // 최빈값
        bw.write(mode + "\n");
        // 범위
        bw.write(max - min + "\n");
        bw.flush();
        
    }
    
}