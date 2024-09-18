package _2024_09._2024_09_18.한병현;

import java.util.Scanner;

public class BJ_29863_ArnosSleepSchedule {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sleep = sc.nextInt();
		int wake = sc.nextInt();

		int result = 0;
		
		if(sleep >= 20) {
			result = (24 - sleep) + wake;
		}else {
			result = wake - sleep;
		}
		
		System.out.println(result);
	}
}
