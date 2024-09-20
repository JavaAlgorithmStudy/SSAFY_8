package _2024_09._2024_09_20.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ_10845_큐 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 명령어의 수
		int N = Integer.parseInt(br.readLine());
		
		// 사용할 Queue를 선언
		Queue<Integer> queue = new LinkedList<>();
		
		// 가장 최근에 push한 수를 임시로 저장하기위한 변수 선언
		int back = 0;
		
		// N만큼 반복
		for(int i = 0; i < N; i++) {
			
			String line = br.readLine();
					
			// push이면
			if(line.contains("push")) {
				
				// 숫자만 뽑아서 큐에 저장
				String[] temp = line.split(" ");
				
				// 미리 back을 저장
				back = Integer.parseInt(temp[1]);
				
				queue.add(Integer.parseInt(temp[1]));
			}
			
			// pop이면
			else if(line.contains("pop")) {
				
				// 수가 없을 경우 -1
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				
				// 있으면 poll
				}else {
					int temp = queue.poll();
					sb.append(temp).append("\n");
				}
			}
			
			// size일때 출력
			else if(line.contains("size")) {
				sb.append(queue.size()).append("\n");
			}
			
			// empty이면
			else if(line.contains("empty")) {
				
				// 수가 없으면 1
				if(queue.isEmpty()) {
					sb.append(1).append("\n");
				}
				
				// 수가 있으면 0
				else {
					sb.append(0).append("\n");
				}
			}
			
			// front면
			else if(line.contains("front")) {
				
				// 수가 없으면 -1
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				}
				
				// 있으면 앞을 출력
				else {
					sb.append(queue.peek()).append("\n");
				}
			}
			
			// back이면
			else if(line.contains("back")) {
				
				// 수가 없으면 -1
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				}
				
				// 있으면 뒤를 출력
				else {
					sb.append(back).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}