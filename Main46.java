package test;

import java.util.Scanner;

public class Main46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "No";

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i * j == n) {
					ans = "Yes";
				}
			}
		}
		System.out.println(ans);
	}
}
