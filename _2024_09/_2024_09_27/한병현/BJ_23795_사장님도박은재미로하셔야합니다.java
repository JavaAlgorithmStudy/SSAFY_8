package _2024_09._2024_09_27.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_23795_사장님도박은재미로하셔야합니다 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 정답을 담을 변수
		int result = 0;
		
		// -1일때까지 무한 반복
		while(true) {
			int money = Integer.parseInt(br.readLine());
			
			// -1이면 종료
			if(money == -1) break;
			
			// 아니라면 잃은 돈에 저장
			else result += money;
		}
		System.out.println(result);
	}
}
