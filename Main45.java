package test;

import java.util.Scanner;

public class Main45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "No";
		for (int i = 0; i <= n / 4; i++) {
			for (int j = 0; j <= n / 7; j++) {
				if (4 * i + 7 * j == n) {
					ans = "Yes";
				}
			}
		}
		System.out.println(ans);
	}

}
