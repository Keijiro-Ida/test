package test;

import java.util.Scanner;

public class Main62 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		int[] a = new int[3];
		int[] b = new int[3];
		a[0] = 0;
		for (int i = 0; i < 3; i++) {
			b[i] = c[0][i] - a[0];
		}
		for (int j = 0; j < 3; j++) {
			a[j] = c[j][0] - b[0];
		}
		boolean result = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (c[i][j] != a[i] + b[j]) {
					result = false;
				}
			}
		}
		System.out.println(result ? "Yes" : "No");
	}
}
