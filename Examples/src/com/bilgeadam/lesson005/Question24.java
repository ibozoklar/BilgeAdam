package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String iban = sc.nextLine();

		if (iban.startsWith("TR")) {

			if (iban.endsWith("5001")) {
				System.out.println("ziraat");

			} else if (iban.endsWith("5002")) {
				System.out.println("garanti");

			} else if (iban.endsWith("5003")) {
				System.out.println("is bankasi");
			}

		} else if (iban.startsWith("OTH")) {

			System.out.println("Yurt disi islemler");

			if (iban.endsWith("2000")) {

				System.out.println("kita ici islemler");
				System.out.println("KI" + iban.substring(3));

			} else {
				System.out.println("Kita disi islemler");
				System.out.println("KD" + iban.substring(2));

			}
		}

	}

}
