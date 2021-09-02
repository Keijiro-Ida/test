package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main60 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			int a = i;
			int j = n - i;
			int total = 0;
			while (a != 0) {
				int rem = a % 10;
				total += rem;
				a /= 10;
			}
			while (j != 0) {
				int rem = j % 10;
				total += rem;
				j /= 10;
			}
			list.add(total);
		}

		int min = list.stream().mapToInt(s -> s).min().getAsInt();
		System.out.println(min);
	}
}
