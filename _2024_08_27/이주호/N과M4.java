import java.util.Scanner;

public class N과M4 {

	static int n;
	static int m;
	static int[] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		visited = new boolean[n];
		recur(0,0);
		System.out.println(sb);
	}
	
	static void recur(int depth, int at) {
		if(depth == m) {
			for(int i = 0 ; i < m;i++) {
				sb.append(arr[i]+" ");
			}
			sb.append('\n');
			return;
		}
		
		for(int i = at;i<n;i++) {
			arr[depth]=i+1;
			recur(depth+1,i);
		}
	}
}
