package test;

import java.util.Scanner;

public class Main58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int w_max = w;
		int w_min = 0;
		int h_max = h;
		int h_min = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			if (a == 1) {
				if (w_min < x)
					w_min = x;
			} else if (a == 2) {
				if (w_max > x)
					w_max = x;
			} else if (a == 3) {
				if (h_min < y)
					h_min = y;
			} else if (h_max > y) {
				h_max = y;
			}
		}
		int area = w * h;
		if (w_max - w_min > 0 && h_max > h_min) {
			area = (w_max - w_min) * (h_max - h_min);
		} else {
			area = 0;
		}
		System.out.println(area);
	}
}
