package test;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int count = 0;
		for (char c1 : c) {
			if (c1 == '1') {
				count++;
			}
		}
		System.out.println(count);
	}
}
