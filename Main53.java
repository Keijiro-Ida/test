package test;

import java.util.Scanner;

public class Main53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] array = s.toCharArray();
		int[] a = new int[26];
		for (char c : array) {
			a[c - 'a']++;
		}
		String res = "None";
		for (int i = 0; i < array.length; i++) {
			if (a[i] == 0) {
				res = String.valueOf((char) ('a' + i));
				break;
			}
		}
		System.out.println(res);
	}

}
