package _2024_09._2024_09_11.이주호;

import java.util.Scanner;

public class 벌집 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //2번부터는 1 7 19 37 ... 인덱스만큼 곱해진 번호가 출력되어야함
        int roomNum = 1;
        int idx = 1;
        int index =0;
        while (n != 1) {
            roomNum = roomNum + (6* index);
            if(roomNum >=n)break;
            idx++;
            index++;
        }
        System.out.println(idx);
    }

}
