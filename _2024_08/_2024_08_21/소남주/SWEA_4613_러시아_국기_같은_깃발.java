package _2024_08._2024_08_21.소남주;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_4613_러시아_국기_같은_깃발 {
     
    static BufferedReader br;
    static StringBuilder sb;
     
    static int N; // 열의 수
    static int M; // 행의 수
     
    static String[][] INPUT;
     
    static int answer; // 칠해야 하는 최소 칸 수
     
    public static void main(String[] args) throws IOException {
         
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
         
        final int T = Integer.parseInt(br.readLine());
         
        for (int testCase = 1; testCase <= T; testCase++) {
            sb.append("#").append(testCase).append(" ");
             
            String[] input = br.readLine().split(" ");
            N = Integer.parseInt(input[0]);
            M = Integer.parseInt(input[1]);
             
            INPUT = new String[N][];
            for (int r = 0; r < N; r++) {
                INPUT[r] = br.readLine().split("");
            }
             
            answer = Integer.MAX_VALUE;
             
            for (int white = 0; white < N - 2; white++) {
                for (int blue = white + 1; blue < N - 1; blue++) {
                    int count = 0; // 칠하는 칸의 수
                     
                    for (int r = 0; r < N; r++) {
                        for (int c = 0; c < M; c++) {
                            if (r <= white && !INPUT[r][c].equals("W")) count++;
                            else if (r > white && r <= blue && !INPUT[r][c].equals("B")) count++;
                            else if (r > blue && !INPUT[r][c].equals("R")) count++;
                        }
                    }
                     
                    answer = Math.min(answer, count);
                }
            }
             
            sb.append(answer).append("\n");
        }
         
        System.out.println(sb.toString());
         
    }
     
}