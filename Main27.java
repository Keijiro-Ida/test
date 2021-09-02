package test;

import java.util.Scanner;

public class Main27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - 1;
		}
		int now = 0;
		int count = -1;
		for (int i = 0; i < n; i++) {
			now = a[now];
			if (now == 1) {
				count = i + 1;
				break;
			}
		}
		System.out.println(count);
	}
}
