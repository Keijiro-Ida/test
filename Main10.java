package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		boolean[][] list = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				list[i][j] = false;
			}
		}

		for (int i = 0; i < q; i++) {
			int num = scan.nextInt();
			if (num == 1) {
				int r = scan.nextInt();
				int m = scan.nextInt();
				list[r - 1][m - 1] = true;
			} else if (num == 2) {
				int r = scan.nextInt();
				for (int j = 0; j < n; j++) {
					if (list[j][r - 1]) {
						list[r - 1][j] = true;
					}
				}
			} else if (num == 3) {
				int r = scan.nextInt();
				ArrayList<Integer> que = new ArrayList<>();
				for (int j = 0; j < n; j++) {
					if (list[r - 1][j])
						que.add(j);
				}
				for (Integer e : que) {
					for (int k = 0; k < n; k++) {
						if (list[e][k])
							list[r - 1][k] = true;

					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (list[i][j] && i != j) {
					System.out.print('Y');
				} else {
					System.out.print('N');
				}
			}
			System.out.println();
		}

	}
}
