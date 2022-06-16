package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Bir sayi giriniz...");

		int sayı = sc.nextInt();
		int basamak = 0;
		int toplam = 0;

		do {
			basamak = sayı % 10;
			toplam += basamak;
			sayı = sayı / 10;

		} while (sayı / 10 != 0);

		System.out.println(toplam);

	}

}
