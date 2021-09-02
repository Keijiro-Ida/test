package test;

import java.util.Scanner;

public class Main16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		int a = -1, b = -1, c = -1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n - i; j++) {
				for (int k = 0; k <= n - i - j; k++) {
					int total = 10000 * i + 5000 * j + 1000 * k;
					if (total == y && i + j + k == n) {
						a = i;
						b = j;
						c = k;

					}
				}
			}

		}
		System.out.println(a + " " + b + " " + c);
	}

}
