package _2024_09._2024_09_15.방승윤;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_모의SW역량테스트_미생물_격리 {
    
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, -1, 0, 1};    
    
    public static void main(String[] args) throws Exception {
        
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int T = Integer.parseInt(st.nextToken());
        
        for (int tc = 1; tc <= T; tc++) {
            
            st = new StringTokenizer(br.readLine());
            
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] microbe = new int [K][4];
            
            // microbe[i][0] == r, [i][1] == c, [i][2] == 미생물 수, [i][3] == 방향
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                microbe[i][0] = Integer.parseInt(st.nextToken());
                microbe[i][1] = Integer.parseInt(st.nextToken());
                microbe[i][2] = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                
                if (d == 1) {
                    microbe[i][3] = 0;
                } else if (d == 2) {
                    microbe[i][3] = 2;
                } else if (d == 3) {
                    microbe[i][3] = 1;
                } else if (d == 4) {
                    microbe[i][3] = 3;
                }
            }
            
            // temp[r][c][0] == microbe 번호, [r][c][1] == 최대 군집의 미생물 수
            for (int i = 0; i < M; i++) {
                int[][][] temp = new int[N][N][2];
                
                // 미생물 수가 0이면 없어진 군집으로 생각하고 넘어감
                for (int j = 0; j < K; j++) {
                	if (microbe[j][2] == 0) {
                		continue;
                	}
                	
                	int nr = microbe[j][0] + dr[microbe[j][3]];
                	int nc = microbe[j][1] + dc[microbe[j][3]];
                	
                	// 최대 군집의 미생물 수가 0이면 아무런 군집도 없으므로 microbe의 정보를 담아줌
                	if (temp[nr][nc][1] == 0) {
                		temp[nr][nc][0] = j;
                		temp[nr][nc][1] = microbe[j][2];
                		microbe[j][0] = nr;
                    	microbe[j][1] = nc;
                    	
                    	// 가장자리에 도달하면 방향을 반대로 바꾸고 미생물의 수를 반으로 줄임
                    	if (microbe[j][0] == 0 || microbe[j][0] == N - 1 || microbe[j][1] == 0 || microbe[j][1] == N - 1) {
                    		microbe[j][3] = (microbe[j][3] + 2) % 4;
                    		microbe[j][2] /= 2;
                    	}
                	// 최대 군집의 미생물 수가 0이 아니면 미생물 수를 합치고 최대 군집인지 판단해서 방향 결정
                	} else {
                		microbe[temp[nr][nc][0]][2] += microbe[j][2];
                		
                		if (temp[nr][nc][1] < microbe[j][2]) {
                			temp[nr][nc][1] = microbe[j][2];
                			microbe[temp[nr][nc][0]][3] = microbe[j][3];
                		}
                		
                		// 군집을 합쳤으므로 원래 있던 군집은 0으로 초기화
                		microbe[j][2] = 0;
                	}
                }
            }
            
            int num = 0;
            
            // 모든 군집의 미생물 수를 더해줌
            for (int i = 0; i < K; i++) {
            	num += microbe[i][2];
            }
            
            sb.append("#").append(tc).append(" ").append(num).append("\n");
            
        }
        
        System.out.println(sb);
        
    }
    
}