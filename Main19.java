package test;

import java.util.Scanner;

public class Main19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = 0;
		int x = 0;
		int y = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			t = sc.nextInt() - t;
			x = Math.abs(sc.nextInt() - x);
			y = Math.abs(sc.nextInt() - y);
			if (t >= x + y && (t - x - y) % 2 == 0) {
				count++;
			}
		}
		if (count == n) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
