package com.bilgeadam.lesson002;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ├žiftToplam = 0;
		int tekToplam = 0;

		for (int i = 1; i < 100; i++) {

			if (i % 2 == 0) {
				├žiftToplam += i;
			} else {
				tekToplam += i;
			}

		}

		System.out.println((double) ├žiftToplam / tekToplam);

	}

}
