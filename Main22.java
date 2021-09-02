package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		int[] e = { a, b, c, d };
		int count = 0;
		Arrays.sort(e);
		for (int i = e[0]; i <= e[3]; i++) {
			if (i > a && i <= b && i > c && i <= d) {
				count++;
			}
		}
		System.out.println(count);
	}
}
