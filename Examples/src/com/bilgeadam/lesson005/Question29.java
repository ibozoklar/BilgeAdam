package com.bilgeadam.lesson005;

public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sayilar = { 0, 125, 5, 85, -256, 16, 1258, 81, 14 };

		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] >= max) {

				max = sayilar[i];
			}

		}
//		for(int i=0; i<sayilar.length;i++) {
//			if(sayilar[i] >= max && )
//		}

	}

}
