package _2024_08_27.이주호;


import java.util.Scanner;
import java.io.FileInputStream;


class 부분수열의_합_재귀_성공
{
	static int n;
	static int k;
	static int[] arr;
	static int answer;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
		

			n = sc.nextInt();
			k = sc.nextInt();
			answer=0;
			arr = new int[n];
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			recur(0,0);
			System.out.println("#"+test_case+" "+answer);
		}
	}
	
	static void recur(int depth,int tmp) {
		if(depth == n ) {
			if(tmp == k) {
				answer++;	
			}
			return;
		}

//		System.out.println(depth+"i"+tmp+"tmp");
		recur(depth+1,tmp);
		recur(depth+1,tmp+arr[depth]);
	}
}