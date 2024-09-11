package _2024_09._2024_09_11.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_6236_용돈_관리 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] cost = new int[N];
		int money = 0;
		int total = 0;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int temp = Integer.parseInt(st.nextToken());
			
			total += temp;
			cost[i] = temp;
			// 한 번에 인출하는 금액이 무조건 하루에 쓰는 금액의 최댓값보다 크거나 같아야 함 
			money = Math.max(cost[i], money);
		}
		
		// 총 인출하는 금액이 써야하는 금액의 총 합 보다 크거나 같아야 함
		money = Math.max(money, (int) Math.ceil((double) total / M));
		
		// temp에 현재 남은 돈을 저장하고 현재 남은 돈보다 써야하는 돈이 적거나 같으면 돈을 씀
		// 현재 남은 돈보다 써야하는 돈이 크면 돈을 다시 인출해야 하므로 cnt를 1 올려줌
		// cnt가 M보다 커지면 한 번에 인출하는 금액을 1 올리고 다시 반복함
		// 모든 날에 돈을 썼는데 cnt가 M보다 적으면 그 때의 한 번에 인출하는 금액의 최솟값
		while (true) {
			int temp = money;
			int cnt = 1;
			
			for (int i = 0; i < N; i++) {
				if (temp >= cost[i]) {
					temp -= cost[i];
				} else {
					temp = money - cost[i];
					cnt++;
				}
				if (cnt > M) {
					money++;
					break;
				}
			}
			if (cnt <= M) {
				break;
			}
		}
		
		System.out.println(money);
		
	}
	
}
