import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_12712_파리퇴치3 {
	
	static BufferedReader br;
	static StringBuilder sb;
	
	static int N; // 배열의 크기
	static int M; // 노즐의 중심으로부터 분사되는 칸 수
	
	static int[][] INPUT;
	
	static int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1}; // 북쪽부터 시계 방향
	static int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};
	
	static int maxFlies;
	
	static int r; // 현재 위치
	static int c;
	
	public static void main(String[] args) throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();

		final int T = Integer.parseInt(br.readLine());
		
		for (int testCase = 1; testCase <= T; testCase++) {
			sb.append("#").append(testCase).append(" ");
			
			String[] input = br.readLine().split(" ");
			N = Integer.parseInt(input[0]);
			M = Integer.parseInt(input[1]);
			
			INPUT = new int[N][N];
			for (int i = 0; i < N; i++) {
				input = br.readLine().split(" ");
				
				for (int j = 0; j < N; j++) {
					INPUT[i][j] = Integer.parseInt(input[j]);
				}
			}
			
			maxFlies = 0;
			
			// 모든 요소에 대해 탐색
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					
					int flies1 = INPUT[r][c];
					int flies2 = INPUT[r][c];
					
					// 델타 배열 순회
					for (int k = 0; k < 8; k++) {
						
						// M칸까지의 파리 잡기
						for (int n = 1; n < M; n++) {
							int nr = r + n * dr[k];
							int nc = c + n * dc[k];
							
							if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
							
							// 십자 방향
							if (k % 2 == 0) flies1 += INPUT[nr][nc];
							// 대각선 방향
							else flies2 += INPUT[nr][nc];
						}
						
					}
					
					int tempMax = Math.max(flies1, flies2);
					
					maxFlies = Math.max(maxFlies, tempMax);
					
				}
			}
			
			sb.append(maxFlies).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
}