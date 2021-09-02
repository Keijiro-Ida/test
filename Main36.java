package test;

import java.util.Scanner;

public class Main36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String c = s.substring(0, 1);
		int l = s.length() - 2;
		String e = s.substring(s.length() - 1, s.length());

		System.out.println(c + l + e);
	}
}
