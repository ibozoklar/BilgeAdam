package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = -1;
		int min = 101;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			int sayı = sc.nextInt();

			if (sayı >= max) {

				max = sayı;
//				if (sayı <= min) {
//					min = sayı;
//				}
			}

			if (sayı <= min) {
				min = sayı;
			}

		}

		System.out.println("En buyuk: " + max);
		System.out.println("En kucuk: " + min);

	}

}
