package _2024_09._2024_09_21.방승윤;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_10814_나이순_정렬_2 {
	
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        StringBuilder[] sb = new StringBuilder[201];

        for (int i = 0; i < sb.length; i++) {
        	sb[i] = new StringBuilder();
        }
        
        // 정렬하는 대신 StringBuilder[age]에 생성한 StringBuilder에 출력 값을 들어온 순서대로 넣음
        for (int i = 0; i < N; i++) {
        	st = new StringTokenizer(br.readLine());
        	int age = Integer.parseInt(st.nextToken());
        	sb[age].append(age).append(" ").append(st.nextToken()).append("\n");
        }
        
        // 이미 정렬되어있는 상태이므로 출력만 해주면 됨
        // StringBuilder는 시퀀스형이라서 toString을 이용해서 bw.write에 넣어줌
        for (int i = 1; i <= 200; i++) {
        	bw.write(sb[i].toString());
        }
        
        bw.flush();
        
    }
    
}