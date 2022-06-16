package com.bilgeadam.lesson005;

public class Qurstion30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean sonuc = false;
		boolean sonuc2 = false;

		int[] sayilar = { 0, 125, 5, 85, -256, 16, 1258, 81, 14 };

		int[] sayilar2 = { 0, 125, 5, 2, 2, 85, -256, 16, 1258, 81, 14 };

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] == 2 && sayilar[i + 1] == 2) {
				sonuc = true;
				break;
			}

		}
		for (int i = 0; i < sayilar2.length; i++) {

			if (sayilar2[i] == 2 && sayilar2[i + 1] == 2) {
				sonuc2 = true;
				break;
			}

		}
		System.out.println(sonuc);
		System.out.println(sonuc2);
	}

}
