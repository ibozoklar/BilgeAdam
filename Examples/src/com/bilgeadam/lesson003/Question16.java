package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin: ");
		int sayi = sc.nextInt();

		int toplam = 0;
		for (int i = 1; i < sayi; i++) {

			if (sayi % i == 0) {

				toplam += i;

			}

		}

		if (toplam == sayi) {
			System.out.println("Mukemmel sayi");
		} else {
			System.out.println("Mukemmel sayi degil");
		}

	}

}
