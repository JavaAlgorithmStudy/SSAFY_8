package _2024_08_27.이주호;
import java.util.*;
import java.io.*;


class 이진수_표현
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n =sc.nextInt();
			int m = sc.nextInt();
			String answer="ON";
			//5 31 11111 //m=31;
			int mask = (1<<n) -1;
			System.out.println(mask);
			if((m&mask) == mask) {//101111 & 1111 == 1111 므로 true
				System.out.println("#"+test_case+" "+answer);
			}else {
				System.out.println("#"+test_case+" "+"OFF");
			}
		}
	}
}