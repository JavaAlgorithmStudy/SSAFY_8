package _2024_08_27.이주호;
import java.util.Arrays;
import java.util.Scanner;

public class N과M5 {
static int n;
static int m;
static int[] arr;
static int[] ans;
static boolean[] visited;
static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n];
		visited = new boolean[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		ans = new int[m];
		Arrays.sort(arr);
		recur(0);
		System.out.println(sb);
	}
	static void recur(int depth) {
		if(depth == m) {
			for(int i = 0 ; i < m;i++) {
				sb.append(ans[i]+" ");
			}
			sb.append('\n');
			return;
		}
		
		for(int i =0;i<n;i++) {
			if(!visited[i]) {
				visited[i]=true;
				ans[depth]=arr[i];
				recur(depth+1);
				visited[i] = false;
			}
			
		}
	}
}
