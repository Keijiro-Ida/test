package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int count = 0;
		for (int i = 0; i < n; i++) {
			x -= a[i];
			if (x < 0)
				break;
			if ((i != n - 1 && x >= 0) || (i == n - 1 && x == 0))
				count++;
		}
		System.out.println(count);
	}
}
