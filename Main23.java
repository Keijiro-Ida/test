package test;

import java.util.Scanner;

public class Main23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long power = 1;

		for (int i = 1; i <= n; i++) {
			power *= i;
			power = power % 1000000007;
		}
		System.out.println(power);
	}

}
