package com.bilgeadam.lesson005;

public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };

		boolean sonuc = false;
		int birler = 0;
		int dortler = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 1) {
				birler++;
			}
			if (sayilar[i] == 4) {
				dortler++;
			}
		}

		if (birler > dortler) {
			sonuc = true;
		}
		System.out.println(sonuc);

	}

}
