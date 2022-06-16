package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Hareket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Tabloyu olusturmak icin bir n degeri girin: ");
		int n = sc.nextInt();
		String str = "";

		for (int i = 1; i <= n * n; i++) {

			str += ". ";
			if (i % n == 0) {
				str += "\n";
			}
		}
		str = str.substring(0, (str.length() / 2) - 1) + "* " + str.substring((str.length() / 2) + 1);

		while (true) {

			System.out.println(str);
			System.out.println("      8");
			System.out.println("4           6");
			System.out.println("      2");
			System.out.println("Hareket icin bu rakamlari kullanin.");
			System.out.println("> bir yon sec ..: ");

			int yon = sc.nextInt();

			int index = str.indexOf("*");

			if (yon == 6) {
				if (str.charAt(index + 2) == '\n') {
					str = str.substring(0, index - ((2 * n) - 2)) + "*"
							+ str.substring(index - ((2 * n) - 2) + 1, index) + "." + str.substring(index + 1);
				} else {
					str = str.substring(0, index) + ". * " + str.substring(index + 4);
				}

			} else if (yon == 4) {

				if (str.charAt(index - 1) == '\n' || str.charAt(index) == 0) {

					str = str.substring(0, index) + "." + str.substring(index + 1, (index + (2 * n) - 2)) + "*"
							+ (str.substring((index + (2 * n) - 2) + 1));

				} else {

					str = str.substring(0, index - 2) + "* . " + str.substring(index + 2);
				}

			} else if (yon == 8) {

				if (index <= (2 * n) - 2) {
					char c;
					String revStr = "";
					str = str.replace('*', '.');
					for (int i = 0; i < str.length(); i++) {
						c = str.charAt(i);
						revStr = c + revStr;
					}
					revStr = revStr.substring(0, (2 * n) - index) + "*" + revStr.substring((2 * n) - (index - 1));

					char ch;
					String newStr = "";
					for (int i = 0; i < str.length(); i++) {
						ch = revStr.charAt(i);
						newStr = ch + newStr;
					}

					str = newStr;

				} else {
					str = str.substring(0, index - ((2 * n) + 1)) + "* "
							+ str.substring(index - ((2 * n) + 1) + 2, index - 1) + " ." + str.substring(index + 1);

				}

			} else if (yon == 2) {

				if (index >= (str.length() - 1) - (2 * n)) {
					char c;
					String revStr = "";
					str = str.replace('*', '.');
					for (int i = 0; i < str.length(); i++) {
						c = str.charAt(i);
						revStr = c + revStr;
					}
					revStr = revStr.substring(0, ((str.length() - 1) - index) - (index / 2)) + "*"
							+ revStr.substring(((str.length() - 1) - index) - (index / 2));

					char ch;
					String newStr = "";
					for (int i = 0; i < str.length(); i++) {
						ch = revStr.charAt(i);
						newStr = ch + newStr;
					}

					str = newStr;

				} else {
					str = str.substring(0, index - 1) + " . " + str.substring(index + 2, index + ((2 * n) + 1)) + "* "
							+ str.substring(index + ((2 * n) + 3));

				}

//				str = str.substring(0, index - 1) + " . " + str.substring(index + 2, index + ((2 * n) + 1)) + "* "
//						+ str.substring(index + ((2 * n) + 3));

			}

		}

	}
}
