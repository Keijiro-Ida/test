package test;

import java.util.Scanner;

public class Main57 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] m_res = new int[n];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			m_res[a - 1]++;
			m_res[b - 1]++;
		}
		for (int res : m_res) {
			System.out.println(res);
		}
	}
}
