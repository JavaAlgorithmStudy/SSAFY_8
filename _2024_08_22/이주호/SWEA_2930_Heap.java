package _2024_08_22.이주호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SWEA_2930_Heap {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++){
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(t).append(" ");

            int n = Integer.parseInt(br.readLine());
            for(int i =0;i<n;i++){
                String[] input = br.readLine().split(" "); //br로 받아 바로 나누기
                if (input.length==2){
                    pq.offer(Integer.parseInt(input[1]));
                }else{
                    if(!pq.isEmpty()){
                        sb.append(pq.poll()+" ");
                    }else{
                        sb.append("-1 ");
                    }
                }
            }
            System.out.println(sb);
        }
    }
}
