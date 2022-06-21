package com.bilgeadam.lesson006;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int i = 0;
		int sayi1 = 0;
		int sayi2 = 0;
		int toplam = 0;

		while (true) {

			System.out.println("Bir sayi giriniz...:");

			sayi1 = sc.nextInt();

			if (sayi1 == sayi2) {

				break;
			}

			toplam += sayi1;
			sayi2 = sayi1;

			i++;

		}

		System.out.println("Ortalama..: " + toplam / i);

	}

}
