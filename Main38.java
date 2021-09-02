package test;

import java.util.Scanner;

public class Main38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			int j = i;
			int num = 0;
			while (j % 2 == 0) {
				num++;
				j /= 2;
			}
			if (max <= num) {
				max = num;
				ans = i;
			}
		}
		System.out.println(ans);

	}
}
