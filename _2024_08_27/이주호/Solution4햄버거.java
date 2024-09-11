package _2024_08_27.이주호;
import java.util.Scanner;
import java.io.FileInputStream;


class Solution4햄버거
{
    static int n;
    static int l;
    static int[] score;
    static int[] cal;
    static int answer;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n =sc.nextInt();
            l = sc.nextInt();
            score = new int[n];
            cal = new int[n];
            for(int i=0;i<n;i++){
            	score[i] = sc.nextInt();
                cal[i] = sc.nextInt();
            }
            answer = 0;
            recur(0,0,0);
            System.out.println("#"+test_case+" "+answer);
		}
	}
    
    static void recur(int depth, int totalScore, int totalCal){
    	if(depth == n) {
    		if(totalCal <= l){
            	answer=Math.max(totalScore,answer);
                return;
            }
    	}
        
    	if(totalCal > l){
        	return;
        }
        
        recur(depth+1,totalScore,totalCal);
    	recur(depth+1,totalScore+score[depth],totalCal+cal[depth]);
    }
}