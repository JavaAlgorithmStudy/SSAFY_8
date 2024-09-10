package _2024_09_10.이주호;

import java.util.Scanner;

class fibo_no_memoization
{
    static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int tc=1;tc<=5;tc++) {
            int n = sc.nextInt();
            answer=0;
            answer=fibo(n);
            System.out.println(answer);
        }
    }

    static int fibo(int n) {
        if(n<=1) {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}