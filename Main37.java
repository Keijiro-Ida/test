package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();

		Arrays.sort(s1);
		Arrays.sort(t1);
		char[] u1 = new char[t1.length];
		for (int f = 0, l = t1.length - 1; f < t1.length; f++, l--) {
			u1[f] = t1[l];
		}
		System.out.println(s1);
		System.out.println(u1);
		if (new String(s1).compareTo(new String(u1)) < 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
