package _2024_10._2024_10_23.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1463_1로만들기 {
    static int[] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];  // dp 배열을 N에 맞춰 설정

        dp[1] = 0;  // 1은 연산이 필요 없음

        for (int i = 2; i <= N; i++) {
            // 1을 빼는 경우
            dp[i] = dp[i - 1] + 1;
            
            // 2로 나누어 떨어지는 경우
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            
            // 3으로 나누어 떨어지는 경우
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[N]);
    }
}

