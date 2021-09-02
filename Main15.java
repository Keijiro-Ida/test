package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		long count = list.stream().distinct().count();
		System.out.println(count);
	}

}
