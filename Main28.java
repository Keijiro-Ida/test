package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] a = new int[2][n];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int l = 0; l < n; l++) {
			int result = 0;
			for (int i = 0; i <= l; i++) {
				result += a[0][i];
			}
			for (int j = l; j < n; j++) {
				result += a[1][j];
			}
			list.add(result);
		}
		int max = list.stream().mapToInt(num -> num).max().getAsInt();
		System.out.println(max);
	}

}
