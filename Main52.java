package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[3 * n];

		for (int i = 0; i < 3 * n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		long total = 0;
		for (int i = n; i < 3 * n; i += 2) {
			total += a[i];

		}
		System.out.println(total);
	}

}
