package _2024_09._2024_09_12.이주호;

import java.util.Scanner;

public class 피보나치2 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
    static long[] dp = new long[91];//dp배열 46이상은 long형 처리.
    static long fibo(int n) {
        if(n<2) {
            return n;
        }
        if(dp[n]!=0) {
            return dp[n];
        }
        return dp[n] = fibo(n-1)+fibo(n-2);
    }
}