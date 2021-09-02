package test;

import java.util.Scanner;

public class Main30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		int a = Character.getNumericValue(line.charAt(0));
		int b = Character.getNumericValue(line.charAt(1));
		int c = Character.getNumericValue(line.charAt(2));
		int d = Character.getNumericValue(line.charAt(3));

		String op1 = "+", op2 = "+", op3 = "+";

		if (a + b - c + d == 7) {
			op2 = "-";
		} else if (a + b - c - d == 7) {
			op2 = "-";
			op3 = "-";
		} else if (a + b + c - d == 7) {
			op3 = "-";
		} else if (a - b + c + d == 7) {
			op1 = "-";
		} else if (a - b - c + d == 7) {
			op1 = "-";
			op2 = "-";
		} else if (a - b - c - d == 7) {
			op1 = "-";
			op2 = "-";
			op3 = "-";
		} else if (a - b + c - d == 7) {
			op1 = "-";
			op3 = "-";
		}
		System.out.println(a + op1 + b + op2 + c + op3 + d + "=7");
	}

}
