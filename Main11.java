package test;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		boolean b = true;
		while (b) {
			for (int i = 0; i < n; i++) {
				if (a[i] % 2 == 0) {
					a[i] /= 2;
				} else {
					b = false;
					break;
				}
			}
			if (b)
				count++;
		}
		System.out.println(count);
	}

}
