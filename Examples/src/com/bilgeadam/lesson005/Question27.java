package com.bilgeadam.lesson005;

public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sayilar = { 0, 125, 5, 85, -256, 16, 1258, 81, 14 };

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++) {

			toplam += sayilar[i];

			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + " sayisi cifttir");

			} else {
				System.out.println(sayilar[i] + " sayisi tektir");
			}

		}
		System.out.println("Toplam: " + toplam);

	}

}
