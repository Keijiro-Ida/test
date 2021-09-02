package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		int m = sc.nextInt();
		String[] t = new String[m];
		for (int i = 0; i < m; i++) {
			t[i] = sc.next();
		}
		int max = 0;
		List<String> list = new ArrayList<>(List.of(s));
		list = list.stream().distinct().collect(Collectors.toList());
		for (int i = 0; i < list.size(); i++) {
			int point = 0;
			for (String str : s) {
				if (list.get(i).equals(str)) {
					point++;
				}
			}
			for (String t_str : t) {
				if (list.get(i).equals(t_str)) {
					point--;
				}
			}
			if (max < point)
				max = point;
		}
		System.out.println(max);
	}
}
