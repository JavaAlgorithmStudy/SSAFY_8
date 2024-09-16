package _2024_09._2024_09_16.방승윤;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1873_상호의_배틀필드 {
	
	static int r, c, d, H, W;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static String[][] field;
    
    public static void main(String[] args) throws Exception {
        
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int T = Integer.parseInt(st.nextToken());
        
        for (int tc = 1; tc <= T; tc++) {
            
        	st = new StringTokenizer(br.readLine());
        	H = Integer.parseInt(st.nextToken());
        	W = Integer.parseInt(st.nextToken());
        	field = new String[H][W];
        	
        	// 필드를 받으면서 탱크의 위치와 방향을 r, c, d에 초기화
        	for (int i = 0; i < H; i++) {
        		String str = br.readLine();
        		field[i] = str.split("");
        		
        		if (str.contains("^")) {
        			r = i;
        			c = str.indexOf("^");
        			d = 0;
        		} else if (str.contains("v")) {
        			r = i;
        			c = str.indexOf("v");
        			d = 1;
        		} else if (str.contains("<")) {
        			r = i;
        			c = str.indexOf("<");
        			d = 2;
        		} else if (str.contains(">")) {
        			r = i;
        			c = str.indexOf(">");
        			d = 3;
        		}
        	}
        	
        	int N = Integer.parseInt(br.readLine());
        	String act = br.readLine();
        	
        	// S면 shoot, U, D, L, R면 move 실행
        	for (int i = 0; i < N; i++) {
        		if (act.charAt(i) == 'S') {
        			shoot();
        		} else {
        			move(act.charAt(i));
        		}
        	}
        	
            sb.append("#").append(tc).append(" ");
            
            // 필드를 출력
            for (int i = 0; i < H; i++) {
            	for (String answer : field[i]) {
            		sb.append(answer);
            	}
            	
            	sb.append("\n");
            }
            
        }
        
        System.out.println(sb);
        
    }
    
    static void shoot() {
    	
    	// 포탄의 위치를 nr, nc에 초기화
    	int nr = r + dr[d];
    	int nc = c + dc[d];
    	
    	// 포탄이 벽돌벽을 만나면 평지로 바꿔주고 실행 중지, 범위를 벗어나거나 강철벽을 만나면 실행 중지
    	while (nr >= 0 && nr < H && nc >= 0 && nc < W && !field[nr][nc].equals("#")) {
    		if (field[nr][nc].equals("*")) {
    			field[nr][nc] = ".";
    			break;
    		}
    		
    		nr += dr[d];
    		nc += dc[d];
    	}
    	
    }
    
    static void move(char direction) {
    	
    	// U, D, L, R일 때 탱크의 방향을 바꿔줌
    	if (direction == 'U') {
    		d = 0;
    		field[r][c] = "^";
    	} else if (direction == 'D') {
    		d = 1;
    		field[r][c] = "v";
    	} else if (direction == 'L') {
    		d = 2;
    		field[r][c] = "<";
    	} else if (direction == 'R') {
    		d = 3;
    		field[r][c] = ">";
    	}
    	
    	int nr = r + dr[d];
    	int nc = c + dc[d];
    	
    	// 탱크의 방향에서 한 칸 움직인 위치가 필드를 벗어나지 않았고 평지라면 탱크를 이동하고 원래 탱크 위치는 평지로 바꿔줌
    	if (nr >= 0 && nr < H && nc >= 0 && nc < W && field[nr][nc].equals(".")) {
    		field[nr][nc] = field[r][c];
    		field[r][c] = ".";
    		r = nr;
    		c = nc;
    	}
    	
    }
    
}