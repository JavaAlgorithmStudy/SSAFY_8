package _2024_08._2024_08_27.이주호;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class N과M3
{
	static int n;
	static int m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
//		n = sc.nextInt();
//		m = sc.nextInt();
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		recur(0);
		System.out.println(sb);
		
	}
	
	static void recur(int depth) {
		if(depth==m) {
			for(int x : arr) {
				sb.append(x+" ");
			}
			sb.append('\n');
			return;
		}
		
		for(int i = 0 ;i<n;i++) {
			arr[depth]=i+1;
			recur(depth+1);
		}
	}
}