package _2024_09._2024_09_12.이주호;

import java.util.Scanner;

public class SWEA_1952_수영장DP {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int tax[] = new int[5];//요금제
            int month[] = new int[13];// 각 달
            for(int i =1;i<=4;i++){
                tax[i] =sc.nextInt();
            }
            for(int i =1;i<=12;i++){
                month[i] =sc.nextInt();
            }
            int[] dp = new int[13];
            for(int i =1;i<=12;i++){
                dp[i] = dp[i-1]+Math.min(tax[1]*month[i],tax[2]);//이전 달의 최적해 + 1달요금제. 1일*한달 동안의 요금제 중 최저값을 더하자
                if(i>=3){//3요금제를 확인 .. 이전까지의 1달동안의 최적해 vs 3달전까지의 최적해 + 3달요금제
                    dp[i] = Math.min(dp[i],dp[i-3]+tax[3]);
                }
            }
            int answer=0;
            answer = Math.min(dp[12],tax[4]);//마지막으로 1년 요금제와 비교
            System.out.println("#"+test_case+" "+answer);
        }
    }
}