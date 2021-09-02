package test;

import java.util.Scanner;

public class Main42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int begin = s.length();
		int end = 0;
		for (int i = 0; i < s.length(); i++) {
			if (begin > i && s.charAt(i) == 'A') {
				begin = i;
			}
			if (end < i && s.charAt(i) == 'Z') {
				end = i;
			}
		}
		System.out.println(end - begin + 1);
	}
}
