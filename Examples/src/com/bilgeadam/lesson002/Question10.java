package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int sayı = 0;
		int toplam = 0;
		int ortalama = 0;
		int i = 1;

		do {
			sayı = sc.nextInt();
			toplam += sayı;

			i++;

		} while (sayı != 0);
		ortalama = toplam / (i - 1);
		System.out.println(ortalama);
		System.out.println(toplam);

	}

}
