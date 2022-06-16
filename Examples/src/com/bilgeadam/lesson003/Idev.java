package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Idev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hedefSayı = 74;
		Scanner sc = new Scanner(System.in);
		int oynamaSayısı = 0;

		while (true) {
			int hak = 6;
			System.out.println("*********S A Y I    B U L M A    O Y U N U**********\n");
			System.out.println("Oynama Sayisi = " + oynamaSayısı);
			System.out.println("BASLAMAK ICIN 1'e BAS\n");
			System.out.println("CIKMAK ICIN 2'YE BAS\n");

			System.out.println("Karar: ");
			int karar = sc.nextInt();

			if (karar == 1) {
				System.out.println("Sayi: ");

				while (true) {

					if (hak == 0) {
						System.out.println("KAYBETTINIZ...");
						System.out.println("OYUN BITTI...");
						oynamaSayısı++;
						break;
					} else {

						int sayı = sc.nextInt();

						if (sayı == hedefSayı) {
							hak--;
							hak = 6 - hak;
							System.out.println(" TEBRIKLER! " + hak + ". hakkinizda bildiniz");
							System.out.println("***" + hedefSayı + "***");
							System.out.println("OYUN BITTI...");
							oynamaSayısı++;
							break;

						} else {

							if (hedefSayı - sayı <= 10) {
								System.out.println("YAKLASTINIZ... ARTTIRIN VEYA AZALTIN");
								hak--;
								System.out.println(hak + " HAKKINIZ KALDI");
							} else {
								System.out.println("UZAKLASTINIZ... ARTTIRIN VEYA AZALTIN");
								hak--;
								System.out.println(hak + " HAKKINIZ KALDI");

							}
						}
					}
				} // while

			} else {
				break;
			}

		} // while

		System.out.println("PROGRAM SONLANDI");

	}

}
