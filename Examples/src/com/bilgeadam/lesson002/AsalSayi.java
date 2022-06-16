package com.bilgeadam.lesson002;

import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin: ");
		int sayı = sc.nextInt();

		boolean isPrime = true;

		if (sayı <= 1) {

			isPrime = false;
		}

		for (int i = 2; i < sayı; i++) {

			if (sayı % i == 0) {

				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("ASAL SAYI");
		} else {
			System.out.println("ASAL SAYI DEGIL");
		}
	}// main

}// class
