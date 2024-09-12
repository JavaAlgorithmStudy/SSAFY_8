package _2024_09._2024_09_12.이주호;

import java.util.Scanner;

public class SWEA_5215_햄버거_DP {
    static int N,L,answer;
    static int[] arr[];
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1;tc<=T;tc++) {
            N =sc.nextInt();//재료개수
            answer=0;
            L = sc.nextInt();//칼로리 한계
            arr = new int[N+1][2];//각 음식의 맛과 칼로리
            dp = new int[N+1][L+1];//메모이제이션을 위한 2차원 배열
            for(int i = 1 ;i <= N;i++) {//각 물건에 대한
                int V = sc.nextInt();//맛
                int C= sc.nextInt();//칼로리
                arr[i][1] = V;//맛
                arr[i][0] = C;//칼로리
            }
            answer = 0;

            for(int i = 1;i<=N;i++) {
                for(int j =1;j<=L;j++) {
                    if(arr[i][0] > j ) {//만약에 현재 확인혀라는 칼로리보다 큰 칼로리의 음식이면
                        dp[i][j] = dp[i-1][j];//이전 음식의 맛을 기입.
                    }else {//제한 칼로리에 들어갈 수 있는 칼로리의 음식이라면 이전 최적해와 현재 음식의 맛을 더해 반환
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i][0]]+arr[i][1]);
                    }
                }
            }
            answer = dp[N][L];
            System.out.println("#"+tc+" "+answer);
        }//tc
    }//main
}
