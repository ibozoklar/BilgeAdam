package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin: ");
		int sayı = sc.nextInt();
		boolean besinKuvveti = false;

		for (int i = 1; i <= sayı; i++) {

			if (Math.pow(5, i) == sayı) {

				besinKuvveti = true;
				break;
			}
		}

		if (besinKuvveti) {
			System.out.println("besin kuvveti");
		} else {
			System.out.println("besin kuvveti degil");
		}

	}
}