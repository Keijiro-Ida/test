package test;

import java.util.Scanner;

public class Main43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int res = s.lastIndexOf("Z") - s.indexOf("A") + 1;
		System.out.println(res);
	}

}
