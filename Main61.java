package test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main61 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt() - 1;
			a[c]++;
		}
		LinkedList<Integer> list = new LinkedList<>();
		for (int d : a) {
			list.add(d);
		}
		Collections.sort(list);
		int res = 0;
		while (list.size() > k) {
			res += list.poll();
		}
		System.out.println(res);
	}
}
