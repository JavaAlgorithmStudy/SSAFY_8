package _2024_09_10.이주호;

import java.util.Scanner;

class Knapsack
{
    static int N,K,answer;
    static int[] arr[];
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1;tc<=T;tc++) {
            N =sc.nextInt();//물건개수
            answer=0;
            K = sc.nextInt();//가방크기
            arr = new int[N+1][2];//물건 정보 저장 배열
            dp = new int[N+1][K+1];//DP배열 선언(문제에서 1부터 시작하므로 0번째 배열은 버림)
            for(int i = 1 ;i <= N;i++) {//각 물건에 대한
                int V = sc.nextInt();//부피
                int C= sc.nextInt();//가치
                arr[i][0] = V;
                arr[i][1] = C;
            }
            answer = 0;

            for(int i = 1;i<=N;i++) {
                for(int j =1;j<=K;j++) {
                    if(arr[i][0] > j ) {//가방에 담을 수 없는 무게인 경우에는
                        dp[i][j] = dp[i-1][j]; //이전에서 탐색했던 값 중 가장 큰 값을 가져옴.
                    }else {
                        /* 가방에 담을 수 있다면
                        *현재까지의 탐색했던 무게에서 가장 의미 있는 값과
                        * 현재 탐색중인 물건의 가치 + 현재 탐색중인 물건의 무게를 제외하고 남은 무게 중에 가치 있는 값
                        * 중에서 더 큰 값으로 배열을 구성.
                        * */
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i][0]]+arr[i][1]);
                    }
                }
            }
            //DP의 마지막에 가장 큰 가치의 값이 반환됨.
            answer = dp[N][K];
            System.out.println("#"+tc+" "+answer);
        }//tc
    }//main

}