package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Islemler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = new int[2];
		int i = 0;
		int sonuc = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir ifade girin....: ");
		String str = sc.nextLine();

		Scanner scanner = new Scanner(str);
		while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				sayilar[i] = scanner.nextInt();
				i++;
			}
			scanner.next();
		}

		if (str.contains("carp")) {
			sonuc = sayilar[0] * sayilar[1];

		} else if (str.contains("bol")) {
			sonuc = sayilar[0] / sayilar[1];

		} else if (str.contains("cikar")) {
			sonuc = sayilar[0] - sayilar[1];

		} else if (str.contains("topla")) {
			sonuc = sayilar[0] + sayilar[1];

		}
		System.out.println("SONUC =  " + sonuc);

	}

}
