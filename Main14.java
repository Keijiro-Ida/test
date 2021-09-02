package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int alice = 0;
		int bob = 0;
		Arrays.sort(a, Comparator.reverseOrder());
		for (int i = 0; i < n; i += 2) {
			alice += a[i];
			if (i < n - 1)
				bob += a[i + 1];
		}
		System.out.println(alice - bob);
	}

}
