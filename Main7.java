package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		int point = 0;
		int num = 0;
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				point++;
			}
			if (point == 2) {
				String msg = word.substring(num, i + 1);
				list.add(msg);
				num = i + 1;
				point = 0;
			}
		}
		String output = "";
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		list.forEach(System.out::print);
	}
}
