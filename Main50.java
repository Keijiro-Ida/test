package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		Collections.sort(list, Comparator.naturalOrder());
		list.forEach(System.out::print);
	}
}
