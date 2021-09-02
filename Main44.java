package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int sum = list.stream().mapToInt(num -> num).sum();
		int rem = x - sum;

		Collections.sort(list, Comparator.naturalOrder());
		int times = rem / list.get(0) + n;
		System.out.println(times);
	}
}
