package com.bilgeadam.sinav001;

import java.util.Scanner;

public class Aritmetik {

	public void toplama() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen kac tane sayiyi toplamk istediginizi girin.....");
		int miktar = sc.nextInt();
		int toplam = 0;

		for (int i = 0; i < miktar; i++) {

			System.out.println("Lutfen " + (i + 1) + ". sayiyi girin....");
			toplam += sc.nextInt();
		}
		System.out.println("Toplam = " + toplam);

	}

	public void cikartma() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen birinci sayiyi girin....");
		int birinciSayi = sc.nextInt();
		System.out.println("Lutfen ikinci sayiyi girin....");
		int ikinciSayi = sc.nextInt();
		System.out.println("Fark = " + (birinciSayi - ikinciSayi));
	}

	public void carpma() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen kac tane sayiyi carpmak istediginizi girin.....");
		int miktar = sc.nextInt();
		int sonuc = 1;

		for (int i = 0; i < miktar; i++) {

			System.out.println("Lutfen " + (i + 1) + ". sayiyi girin....");
			sonuc *= sc.nextInt();
		}
		System.out.println("Carpim = " + sonuc);

	}

	public void bolum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bolunen sayiyi girin....");
		int bolunen = sc.nextInt();
		System.out.println("Lutfen bolen sayiyi girin....");
		int bolen = sc.nextInt();
		System.out.println("Bolum = " + (bolunen / bolen));
	}

	public void ucgenAlaniHesapla() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen ucgenin taban uzunlugunu girin....");
		int tabanUzunlugu = sc.nextInt();

		System.out.println("Lutfen ucgenin yuksekligini girin....");
		int yukseklik = sc.nextInt();

		System.out.println("Ucgenin alani = " + ((tabanUzunlugu * yukseklik) / 2));
	}

	public void kareAlaniniHesapla() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen karenin bir kenar uzunlugunu girin.....");
		int kenar = sc.nextInt();
		System.out.println("Karenin alani = " + (kenar * kenar));
	}

	public void dikdortgenAlaniHesapla() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin taban uzunlugunu girin....");
		int taban = sc.nextInt();
		System.out.println("Lutfen dikdortgenin yuksekligini girin....");
		int yukseklik = sc.nextInt();
		System.out.println("Dikdortgenin alani = " + (taban * yukseklik));

	}
}
