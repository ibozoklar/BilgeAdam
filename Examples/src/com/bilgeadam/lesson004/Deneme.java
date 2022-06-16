package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Deneme {

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
		System.out.print(str);
		System.out.print(str.length());

	}

}
