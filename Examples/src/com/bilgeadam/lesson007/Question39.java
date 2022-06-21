package com.bilgeadam.lesson007;

public class Question39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 1000; i++) {

			asalmi(i);
		}
	}

	private static void asalmi(int sayi) {

		boolean kontrol = true;

		if (sayi == 1) {
			kontrol = false;
		} else {

			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					kontrol = false;
					break;
				}
			}
		}

		if (kontrol) {
			System.out.println(sayi + " Asal sayidir");
		}
	}
}
