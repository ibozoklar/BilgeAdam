package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int index = 0;

		for (int i = 0; i <= str.length(); i++) {

			if (str.charAt(i) == ',') {
				System.out.println(str.substring(index, i));
				index = i + 1;

			}

		}
		System.out.println(str.substring(index));
	}

}
