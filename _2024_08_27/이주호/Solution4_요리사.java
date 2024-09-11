package _2024_08_27.이주호;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Solution4_요리사
{
	static int n;
	static int[][] map;
	static int answer;
	static boolean[] visited;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{

			n = sc.nextInt();
			answer=Integer.MAX_VALUE;
			map = new int[n][n];
			for(int i =0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			visited = new boolean[n];
			
			recur(0,0);
			
			System.out.println("#"+test_case+" "+answer);
		}
	}
	
	static void recur(int depth,int at) {
		if(depth == n/2) {
			answer=Math.min(cal(), answer);
			return;
		}
		
		for(int i = at ; i <n;i++) {
			visited[i]=true;
			recur(depth+1,i+1);
			
			visited[i]=false;
		}
	}
	
	static int cal() {
		int ans1=0;
		int ans2=0;
		for(int i =0;i<n;i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i==j)continue;
				if(visited[i] && visited[j]) {
					ans1+=map[i][j];
				}else if(!(visited[i]) && !(visited[j])) {
					ans2+=map[i][j];
				}
			}
		}
		return Math.abs(ans1-ans2);
	}
}