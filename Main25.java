package test;

import java.util.Scanner;

public class Main25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		long result = 0;

		if (a == 0) {
			result += b / x + 1;

		} else {
			result += (b / x + 1) - ((a - 1) / x + 1);
		}
		System.out.println(result);
	}
}
