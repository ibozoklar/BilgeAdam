package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String kelime = sc.nextLine();

		for (int i = 0; i < kelime.length(); i++) {

			System.out.println("index: " + i + " " + kelime.charAt(i));

		}

	}

}
