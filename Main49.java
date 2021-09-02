package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		int max = 0;
		int[] rev = new int[n];
		for (int i = 0, j = n - 1; i < n; i++, j--) {
			rev[i] = l[j];
		}
		for (int i = 0; i < k; i++) {
			max += rev[i];
		}
		System.out.println(max);
	}
}
