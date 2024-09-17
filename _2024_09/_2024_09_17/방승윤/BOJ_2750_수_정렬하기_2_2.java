package _2024_09._2024_09_17.방승윤;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ_2750_수_정렬하기_2_2 {
	
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        
        for (int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        for (int i : arr) {
        	bw.write(i + "\n");
        }
        
        bw.flush();
        
    }
    
}