package _2024_09._2024_09_11.이주호;

import java.util.Scanner;

public class 중앙이동알고리즘 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 ~ 15의 범위
        int n = sc.nextInt();
        //1 4 16 64 256 문제에서 그림으로 주어진 정사각형의 개수
        //이에 대한 꼭지점은 4 9 25 81 1089  (가로 또는 세로 선분의 길이는 2**n+1)이므로
        // 2 3 5 9 17..  2의 x승씩 증가.
        System.out.println((int)Math.pow(Math.pow(2,n)+1,2));
    }

}
