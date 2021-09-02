package test;

import java.util.Scanner;

public class Main54 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int count = 0;
		for (int i = a; i <= b; i++) {
			String num_str = String.valueOf(i);
			if (num_str.charAt(0) == num_str.charAt(4) && num_str.charAt(1) == num_str.charAt(3)) {
				count++;
			}

		}
		System.out.println(count);
	}

}
