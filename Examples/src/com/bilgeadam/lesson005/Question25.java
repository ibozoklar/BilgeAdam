package com.bilgeadam.lesson005;

public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dizi = { -1, 0, 1, 2, 3 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i] >= max) {
				max = dizi[i];

			}
			if (dizi[i] <= min) {

				min = dizi[i];
			}

		}

		System.out.println("MAX: " + max + " MIN: " + min);

	}

}
