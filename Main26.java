package test;

import java.util.Scanner;

public class Main26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		for (int i = 1; i <= b; i++) {
			int aa = a * i;

			if (aa % b == c) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");

	}

}
