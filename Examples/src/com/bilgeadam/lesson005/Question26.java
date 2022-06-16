package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String deger = sc.nextLine();
		boolean icindeMi = false;

		String[] dizi = { "Turkiye", "Japonya", "Mogolistan", "Fransa", "Danimarka" };

		for (int i = 0; i < dizi.length; i++) {

			if (deger.equals(dizi[i])) {

				System.out.println("icinde");
				icindeMi = true;
				break;
			}
		}

		if (icindeMi == false) {
			System.out.println("icinde degil");
		}

	}

}
