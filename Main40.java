package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		double a = sc.nextDouble();

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		double min = Math.abs(a - (t - list.get(0) * 0.006));
		int spot = 0;
		for (int i = 0; i < n; i++) {
			double ave = t - list.get(i) * 0.006;

			if (min >= Math.abs(a - ave)) {
				min = Math.abs(a - ave);
				spot = i + 1;
			}
		}
		System.out.println(spot);
	}
}
