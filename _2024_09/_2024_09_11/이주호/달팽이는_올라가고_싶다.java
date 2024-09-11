package _2024_09._2024_09_11.이주호;

import java.util.Scanner;

public class 달팽이는_올라가고_싶다 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();
        System.out.println((int)Math.ceil((double)(V - B)/(A - B)));
    }
}
