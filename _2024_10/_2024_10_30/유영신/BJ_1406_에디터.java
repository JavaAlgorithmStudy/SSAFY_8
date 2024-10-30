package _2024_10._2024_10_30.유영신;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_1406_에디터 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		String s = br.readLine();

		Stack<Character> stackA = new Stack<>();
		Stack<Character> stackB = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			stackA.add(s.charAt(i));
		}

		int M = Integer.parseInt(br.readLine());

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
//			System.out.println("command : " + command);

			if (command.equals("P")) {
				char letter = st.nextToken().charAt(0);
				stackA.add(letter);
				
			} else if (command.equals("L") && !stackA.isEmpty()) {
				char tmp = stackA.pop();
				stackB.add(tmp);
				
			} else if (command.equals("D") && !stackB.isEmpty()) {
				char tmp = stackB.pop();
				stackA.add(tmp);
				
			} else if(command.equals("B") && !stackA.isEmpty()){
				stackA.pop();
			}
//			System.out.println(stackA);
//			System.out.println(stackB);
//			System.out.println("---------------------------");
		}
		
		while(!stackB.isEmpty()) {
			stackA.add(stackB.pop());
		}
//		System.out.println(stackA);
//		System.out.println(stackB);
//		
		while(!stackA.isEmpty()) {
			sb.append(stackA.pop());
		}
		
		System.out.println(sb.reverse());
		
	}

}
