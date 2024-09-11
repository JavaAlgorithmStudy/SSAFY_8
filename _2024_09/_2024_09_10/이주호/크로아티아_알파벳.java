package _2024_09._2024_09_10.이주호;
import java.io.IOException;
import java.util.Scanner;
class 크로아티아_알파벳 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //문제에서 해당 내용은 한 글자임을 제시. 이에 대해 임의의 문자로 변환 및 문제에서 요구하는 문자의 길이 반환
        input = input.replaceAll("c=", "1");
        input = input.replaceAll("c-", "2");
        input = input.replaceAll("dz=", "3");
        input = input.replaceAll("d-", "4");
        input = input.replaceAll("lj", "5");
        input = input.replaceAll("nj", "6");
        input = input.replaceAll("s=", "7");
        input = input.replaceAll("z=", "8");
        System.out.println(input.length());
    }
}
