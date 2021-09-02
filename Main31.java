package test;

import java.util.Scanner;

public class Main31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();

		int result = r * 100 + g * 10 + b * 1;
		if (result % 4 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
