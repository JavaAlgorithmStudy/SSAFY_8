package _2024_09._2024_09_29.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_5568_카드_놓기 {
	
	static int N, K;
	static int[] cards;
	static HashSet<String> nums;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		cards = new int[N];
		nums = new HashSet<>();

		for (int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(br.readLine());
		}
		
		makeNum(0, "");
		
		System.out.println(nums.size());

	}

	static void makeNum(int idx, String num) {
		
		if (idx == K) {
			nums.add(num);
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if (cards[i] / 100 == 0) {
				cards[i] += 100;
				makeNum(idx + 1, num + cards[i] % 100);
				cards[i] -= 100;
			}
		}
		
	}

}