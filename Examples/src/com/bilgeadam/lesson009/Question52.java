package com.bilgeadam.lesson009;

public class Question52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kartTurleri[] = { "Kupa", "Maca", "Karo", "Sinek" };
		String kartNumaralari[] = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String deste[] = new String[52];

		deste = desteyiOlustur(kartTurleri, kartNumaralari);
		for (String i : deste) {
			System.out.println(i);
		}

	}

	public static String[] desteyiOlustur(String[] turler, String[] numaralar) {
		String[] deste = new String[52];
		int index = 0;
		for (int i = 0; i < turler.length; i++) {
			for (int j = 0; j < numaralar.length; j++) {
				deste[index] = turler[i] + " " + numaralar[j];
				index++;
			}

		}
		return deste;
	}
}
