package test;

import java.util.Scanner;

public class Main24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int result = 1;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				result *= k;
			} else {
				result *= k - 1;
			}
		}
		System.out.println(result);
	}

}
