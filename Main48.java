package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] l = new int[n];

		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {

					if (l[i] != l[j] && l[j] != l[k] && l[i] != l[k]) {
						if (l[i] < l[j] + l[k] && l[j] < l[i] + l[k] && l[k] < l[i] + l[j]) {
							count++;

						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
