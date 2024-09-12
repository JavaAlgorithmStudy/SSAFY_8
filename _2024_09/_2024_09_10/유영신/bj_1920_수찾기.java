package _2024_09._2024_09_10.유영신;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1920_수찾기 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int N = Integer.parseInt(br.readLine());
            int[] arrN = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arrN[i] = Integer.parseInt(st.nextToken());
            }

            int M = Integer.parseInt(br.readLine());
            int[] arrM = new int[M];
            boolean[] result = new boolean[M]; // 결과값 담는 boolean 타입 배열

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                arrM[i] = Integer.parseInt(st.nextToken());
                for (int j = 0; j < N; j++) {
                    if (arrN[j] == arrM[i]) { // arrN 배열의 인덱스를 돌면서 arrM 배열과 같은 값이 있다면,
                        result[i] = true; // 해당 result 인덱스 값 true로 변환
                        break; // 찾았으면 for문 종료
                    }

                }
            }

            for (int i = 0; i < M; i++) {
                if (result[i]) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

        }
    }


