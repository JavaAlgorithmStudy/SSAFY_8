package _2024_09_10.이주호;
import java.io.IOException;
import java.util.Scanner;
class 크로아티아_알파벳 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
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
