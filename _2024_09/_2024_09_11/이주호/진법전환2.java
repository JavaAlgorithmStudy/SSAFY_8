package _2024_09._2024_09_11.이주호;

import java.util.Scanner;

public class 진법전환2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
//        System.out.println(n / b);
//        System.out.println(n % b);
        StringBuilder answer= new StringBuilder();
        while (n > 0) {
            //나머지 연산시 10의 자리를 넘는 다면 추가 처리
            int mo = n % b;

            if (mo >= 10) {
                answer.append((char) (mo + 'A' - 10));
            } else {
                answer.append((char) (mo + '0'));
            }
            n /= b;
        }
        //높은 자리를 앞으로 변경
        System.out.println(answer.reverse());
    }

}
