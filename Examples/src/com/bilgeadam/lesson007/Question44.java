package com.bilgeadam.lesson007;

import java.util.Scanner;

public class Question44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int input = 0;

		do {
			System.out.println("==HESAP MAKINESI===\n");
			System.out.println("1- Topla");
			System.out.println("2- Cikar");
			System.out.println("3- Carp");
			System.out.println("4- Bol");
			System.out.println("5- Faktoriyel");
			System.out.println("6- Us hesaplama");
			System.out.println("7- Asal kontrolu");
			System.out.println("0- Cikis");
			System.out.println("Bir islem seciniz");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				topla();
				break;

			case 0:
				System.out.println("gule gulee ...");
				break;

			case 3:
				carp();
				break;
			case 4:
				bol();
				break;
			case 5:
				faktoriyel();
				break;
			case 6:
				usHesapla();
				break;
			case 7:
				asalKontrolu();
				break;

			default:
				break;
			}

		} while (input != 0);

	}

	public static void asalKontrolu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen asal sayi olup olmadıgini kontrol etmek istedginiz bir sayi girin....:");
		int sayi = sc.nextInt();

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
		} else {
			System.out.println(sayi + " Asal sayi degildir");
		}

	}

	public static void usHesapla() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen kuvvetini almak istedginiz bir sayi girin....:");
		int sayi = sc.nextInt();
		System.out.println("Lutfen almak istedginiz kuvveti girin....:");
		int kuvvet = sc.nextInt();
		System.out.println("Sonuc = " + Math.pow(sayi, kuvvet));

	}

	public static void faktoriyel() {
		Scanner sc = new Scanner(System.in);
		int sonuc = 1;
		System.out.println("Lutfen faktoriyelini almak istediginiz bir sayi girin....:");
		int sayi = sc.nextInt();

		for (int i = 1; i <= sayi; i++) {
			sonuc *= i;
		}
		System.out.println("sonuc = " + sonuc);
	}

	public static void bol() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayi;
		int sonuc = 1;
		do {
			System.out.println("Lutfen bir sayi giriniz");
			sayi = scanner.nextInt();
			scanner.nextLine();
			sonuc /= sayi;
			System.out.println(
					"Islemi sonlandirmak icin = tusuna basin devam etmek icin herhangi bir tusa basabilirsiniz");
			input = scanner.nextLine();
		} while (!input.equals("="));
		System.out.println("bolum = " + sonuc);
	}

	public static void carp() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayi;
		int sonuc = 1;
		do {
			System.out.println("Lutfen bir sayi giriniz");
			sayi = scanner.nextInt();
			scanner.nextLine();
			sonuc *= sayi;
			System.out.println(
					"Islemi sonlandirmak icin = tusuna basin devam etmek icin herhangi bir tusa basabilirsiniz");
			input = scanner.nextLine();
		} while (!input.equals("="));
		System.out.println("carpim = " + sonuc);
	}

	public static void topla() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayi;
		int toplam = 0;
		do {
			System.out.println("Lutfen bir sayi giriniz");
			sayi = scanner.nextInt();
			scanner.nextLine();
			toplam += sayi;
			System.out.println(
					"Islemi sonlandirmak icin = tusuna basin devam etmek icin herhangi bir tusa basabilirsiniz");
			input = scanner.nextLine();
		} while (!input.equals("="));
		System.out.println("toplam = " + toplam);
	}
}
