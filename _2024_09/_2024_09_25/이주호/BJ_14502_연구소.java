package _2024_09._2024_09_25.이주호;
import java.util.*;
import java.io.FileInputStream;

class BJ_14502_연구소
{
	static int n,m,answer,wallCount;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	/*
	 * 3개의 벽 다 써야 (표식 1이 3개 생겨야하는데, 0인 곳을 바꾸자)
	 * 그래서 0의 최댓값을 찾아야하는데 1을 어디다가 둘까를 쭉 돌면서 다 확인하되,
	 * 기존것 보다 커지면 return
	 * 
	 * 
	 * virus 2~10
	 * */
	static boolean[][] visited;//방문 배열이 필요하고, 처음에 0아니면 못감 표시
	static int[][] map;
	public static void main(String[] args) {
		//벽은 다 써야함.
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		visited = new boolean[n][m];
		answer =0;
		map = new int[n][m];
		for(int i = 0 ; i <n;i++) {
			for(int j = 0 ; j <m;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j]!=0) {
					visited[i][j] = true;
				}
			}
		}//방문 및 지도 입력
		wallCount=3;//벽은 3개임
		int depth = wallCount;//변수화
		int[][] clone = new int[map.length][map[0].length];//맵은 고유하며 따로 빼서할 예정
		for(int i = 0 ;i<map.length;i++) {
			clone[i]=map[i].clone();//2차원 깊은 복사는 이런식으로 1차워 배열을 clone()
		}
		recur(depth,clone);//탐색
		
//		for(int[] arr: clone) {
//			System.out.println(Arrays.toString(arr));
//		}
		
		System.out.println(answer);//정답도출
	}
	
	static int[][] idx;
	static boolean[][] check;
	/*2차원 배열들의 복사의 복사..check == visited복사 idx == clone의 clone()
	 * */
	static void recur(int depth,int[][] clone) {
		if(depth==0) {
			idx = new int[clone.length][clone[0].length];
			for(int i = 0 ; i < n ; i++) {
				idx[i]=clone[i].clone();
			}
			check = new boolean[n][m];
			for(int i = 0 ; i<visited.length;i++) {
				check[i]=visited[i].clone();
			}
			//============복사의 복사(새로운 연산의 필요로)
			for(int i = 0 ; i<n;i++) {
				for(int j = 0 ; j<m;j++) {
					doVirus(i,j);//(맵에서 벽 다 세웠으니 바이러스 퍼뜨리기)
				}
			}
//			System.out.println("==============");
//			for(int[] arr : idx) {
//				System.out.println(Arrays.toString(arr));
//			}
//			for(boolean[] arr : check) {
//				System.out.println(Arrays.toString(arr));
//			}
//			System.out.println("===============");
			int result=0;
			for(int i = 0 ; i<n;i++) {
				for(int j = 0 ; j<m;j++) {
					if(idx[i][j]==0) {
						result++;//다 퍼뜨렸으니 안전구역 확인
					}
				}
			}
//			System.out.println(result);
			answer = Math.max(answer, result);//필요시 갱신
			
			return;
		}
//		System.out.println(1+" "+"?");
		for(int i = 0 ; i <n;i++) {
			for(int j = 0 ; j < m;j++) {
				if(clone[i][j] == 0&&!visited[i][j]) {//방문안하고 갈 수 있다면 벽세우기.
					visited[i][j]=true;
					depth--;
					clone[i][j]=1;//벽세우고..
//					System.out.println(i+" "+j);
//					for(int[] arr : clone) {
//						System.out.println(Arrays.toString(arr));
//					}
					recur(depth,clone);//재귀를 통해 모든 0인 부분집합화
					
					visited[i][j]=false;//벽 다썼으면 다음에 또 써야하니 초기화
					depth++;
					clone[i][j]=0;
				}
			}
		}
	}
	
	static void doVirus(int i,int j) {
//		System.out.println(i+"??"+j);
		if(idx[i][j]==2) {//바이러스가 있다면 주변에 퍼뜨린다.
			for(int k=0;k<4;k++) {
				int nx = i+dx[k];//이동 x,y좌표
				int ny = j+dy[k];
				if(0<=nx&&nx<n&&0<=ny&&ny<m && idx[nx][ny] ==0 && !check[nx][ny]) {
					idx[nx][ny]=2;
					check[nx][ny]=true;
//					for(int[] arr : idx) {
//						System.out.println(Arrays.toString(arr));
//					}
					doVirus(nx,ny);
				}
			}
		}
	}
}
