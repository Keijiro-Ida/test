package test;

import java.util.Scanner;

public class Main34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int noodle = 700;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o') {
				noodle += 100;
			}
		}
		System.out.println(noodle);
	}
}
