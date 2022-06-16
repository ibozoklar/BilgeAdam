package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Basamak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin: ");
		int sayı = sc.nextInt();

		int i = 1;

		while (sayı / 10 >= 1) {

			System.out.println(i + "'ler basamagi = " + (sayı % 10));
			sayı = sayı / 10;
			i *= 10;
		}
		System.out.println(i + "'ler basamagi = " + (sayı % 10));
	}

}
