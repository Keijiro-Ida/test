package test;

import java.util.Scanner;

public class Main13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;

		for (int i = 1; i <= n; i++) {
			int sum = 0;
			int num = i;
			boolean res = true;
			while (res) {
				int ans = num % 10;
				sum += ans;
				num /= 10;
				if (num == 0) {
					res = false;
				}
			}
			if (sum >= a && sum <= b) {
				result += i;
			}

		}
		System.out.println(result);

	}

}
