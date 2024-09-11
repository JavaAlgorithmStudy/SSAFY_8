package _2024_09._2024_09_10.유영신;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2775_부녀회장이될테야 {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {

			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

			int[][] APT = new int[15][15];

			for (int i = 0; i < APT.length; i++) {
				APT[0][i] = i;
				APT[i][1] = 1;
			}

			for (int i = 1; i < 15; i++) {
				for (int j = 2; j < 15; j++) {
					APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
				}

			}
//			for (int[] a : APT) {
//				System.out.println(Arrays.toString(a));
//			}
//			System.out.println();
			
			System.out.println(APT[k][n]);

		}
	}
}
