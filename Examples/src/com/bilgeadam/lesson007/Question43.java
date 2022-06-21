package com.bilgeadam.lesson007;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Kac sayi ile islem yapilacak?");
		int secenek = sc.nextInt();

		if (secenek == 2) {
			System.out.println("1. sayiyi girin...");
			int sayi1 = sc.nextInt();
			System.out.println("2. sayiyi girin...");
			int sayi2 = sc.nextInt();
			System.out.println("Sonuc " + topla(sayi1, sayi2));
		}
		if (secenek == 3) {
			System.out.println("1. sayiyi girin...");
			int sayi1 = sc.nextInt();
			System.out.println("2. sayiyi girin...");
			int sayi2 = sc.nextInt();
			System.out.println("3. sayiyi girin...");
			int sayi3 = sc.nextInt();
			System.out.println("Sonuc " + topla(sayi1, sayi2, sayi3));
		}
	}

	public static int topla(int a, int b) {
		return a + b;
	}

	public static int topla(int a, int b, int c) {
		return a + b + c;
	}

}
