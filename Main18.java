package test;

import java.util.Scanner;

public class Main18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		s = s.replaceAll("eraser", "");
		s = s.replaceAll("erase", "");
		s = s.replaceAll("dreamer", "");
		s = s.replaceAll("dream", "");

		if (s.equals("")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
