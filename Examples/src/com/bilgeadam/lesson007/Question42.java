package com.bilgeadam.lesson007;

public class Question42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi1 = 100;
		int sayi2 = 60;
		int obeb = obeb(sayi1, sayi2);
		int okek = sayi1 * sayi2 / obeb;

		System.out.println(obeb);
		System.out.println(okek);

	}

	public static int obeb(int sayi1, int sayi2) {

		int ebob = 1;
		int count;

		if (sayi2 > sayi1) {
			count = sayi1;
		} else {
			count = sayi2;
		}

		while (count > 0) {
			if (sayi1 % count == 0 && sayi2 % count == 0) {
				ebob = count;
				break;
			}
			count--;

		}

		return ebob;
	}

}
