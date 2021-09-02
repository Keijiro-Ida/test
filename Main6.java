package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		List<String> list = new ArrayList<String>();
		StringBuilder sb = null;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				if (sb == null) {
					sb = new StringBuilder();
					sb.append(word.charAt(i));
				} else {
					sb.append(word.charAt(i));
					list.add(sb.toString());
					sb = null;
				}

			} else if (Character.isLowerCase(word.charAt(i))) {
				sb.append(word.charAt(i));
			}
		}
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		list.forEach(System.out::print);
	}
}
