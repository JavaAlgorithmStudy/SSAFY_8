package _2024_09._2024_09_23.한병현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_2108_통계학 {
	
	static int N;
	static int[] nums;
	static int[] temp;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 정수의 개수
		N = Integer.parseInt(br.readLine());
		
		// 정수들을 담을 배열
		nums = new int[N];
		
		// 병합정렬을 위한 임시 배열
		temp = new int[N];
		
		// 산술평균을 위한 합 변수
		int sum = 0;
		
		// 최빈값을 위한 cnt 배열
		// 양수 배열과 음수 배열로 각각 선언
		int[] cntP = new int[4001];
		int[] cntM = new int[4001];
		
		// 최댓값과 최솟값을 담을 배열
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			// 정수 배열에 수들을 초기화
			nums[i] = num;
			
			// 합을 진행
			sum += num;
			
			// 최댓값, 최솟값을 진행
			if(num >= Max) Max = num;
			if(num <= Min) Min = num;
			
			// 최빈값을 진행
			if(num >= 0) cntP[num]++;
			if(num < 0) cntM[-num]++;
		}
		
		// 병합정렬 진행
		merge(0, N - 1);
		
		// 결과 출력
		// 산술평균 result1
		int result1 = (int)Math.round((double)sum / N);
		sb.append(result1).append("\n");
		
		// 중앙값 result2
		int result2 = nums[N / 2];
		sb.append(result2).append("\n");
		
		// 최빈값 result3
        int result3 = 0;
        
        // 최빈값의 개수를 셀 변수 cnt, 최빈값을 담을 변수 max
		int cnt = 0;
		int max = 0;
		
        // 반복문을 통해 최빈값을 저장
		for(int i = 0; i < 4001; i++) {
			if(cntP[i] >= max && cntP[i] != 0) {
				max = cntP[i];
			}
			
			if(cntM[i] >= max && cntM[i] != 0) {
				max = cntM[i];
			}
		}	
		
        // 음수 배열부터 최빈값과 동일한 빈도를 찾는 과정
		for(int i = 4000 ; i >= 0; i--) {
			if(cntM[i] == max) {
                
                // 음수이기 때문에 음수로 변환
				result3 = -i;
                
                // 개수를 세주고
				cnt++;
                
                // 여러개라면 2개째에서 걸림
				if(cnt == 2) break;
			}
		}
		
        // 음수에서 걸리지 않았다면 양수로 넘어와서 두 번째 수를 탐색
		for(int i = 0 ; i < 4001; i++) {
			if(cntP[i] == max && cnt < 2) {
				result3 = i;
				cnt++;
				
				if(cnt == 2) break;
			}
		}
		sb.append(result3).append("\n");
		
		// 범위 result4
		int result4 = Max - Min;
		sb.append(result4).append("\n");
		
		System.out.println(sb);
	}
	
	// 병합정렬을 위해 반으로 나누어 줄 메서드
	static void merge(int left, int right) {
		if(left == right) {
			return;
		}
		
		int mid = (left + right) / 2;
		
		merge(left, mid);
		merge(mid + 1, right);
		sort(left, mid, right);
	}
	
	// 병합정렬을 진행하여 합칠 메서드
	static void sort(int left, int mid, int right){
		int L = left;
		int R = mid + 1;
		
		int idx = left;
		
		while(L <= mid && R <= right) {
			if(nums[L] <= nums[R]) {
				temp[idx++] = nums[L++];
			}else {
				temp[idx++] = nums[R++];
			}
		}
		
		while(L <= mid) {
			temp[idx++] = nums[L++];
		}
		
		while(R <= right) {
			temp[idx++] = nums[R++];
		}
		
		for(int i = left; i <= right; i++) {
			nums[i] = temp[i];
		}
	}
}