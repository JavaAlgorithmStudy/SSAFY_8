package _2024_09._2024_09_17.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_28702_FizzBuzz {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		
		String result = "";
		
		// 첫 번째가 숫자일 경우
		if(!a.contains("Fizz") && !a.contains("Buzz") && !a.contains("FizzBuzz")) {
			int temp = Integer.parseInt(a) + 3;
			
			if(temp % 3 == 0 && temp % 5 == 0) {
				result = "FizzBuzz";
			}else if(temp % 3 == 0 && temp % 5 != 0) {
				result = "Fizz";
			}else if(temp % 3 != 0 && temp % 5 == 0) {
				result = "Buzz";
			}else {
				result = temp + "";
			}
		}
		
		// 두 번째가 숫자일 경우
		else if(!b.contains("Fizz") && !b.contains("Buzz") && !b.contains("FizzBuzz")) {
			int temp = Integer.parseInt(b) + 2;
			
			if(temp % 3 == 0 && temp % 5 == 0) {
				result = "FizzBuzz";
			}else if(temp % 3 == 0 && temp % 5 != 0) {
				result = "Fizz";
			}else if(temp % 3 != 0 && temp % 5 == 0) {
				result = "Buzz";
			}else {
				result = temp + "";
			}
		}
		
		// 세 번째가 숫자일 경우
		else if(!c.contains("Fizz") && !c.contains("Buzz") && !c.contains("FizzBuzz")) {
			int temp = Integer.parseInt(c) + 1;
					
			if(temp % 3 == 0 && temp % 5 == 0) {
				result = "FizzBuzz";
			}else if(temp % 3 == 0 && temp % 5 != 0) {
				result = "Fizz";
			}else if(temp % 3 != 0 && temp % 5 == 0) {
				result = "Buzz";
			}else {
				result = temp + "";
			}
		}
		System.out.println(result);
	}
}
