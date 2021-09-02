package test;

import java.util.Scanner;

public class Main47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();

		int[][] x = new int[n][d];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int dis = 0;
				for (int k = 0; k < d; k++) {
					dis += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);

				}
				if (Math.sqrt(dis) % 1 == 0) {
					count++;
				}

			}
		}
		System.out.println(count);
	}
}
