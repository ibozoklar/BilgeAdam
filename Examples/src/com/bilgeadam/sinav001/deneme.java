package com.bilgeadam.sinav001;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int dizi[] = { 1, 2, 3, 4, 5, 6 };

		String str = "";

		for (int i = 0; i < dizi.length; i++) {

			str += dizi[i] + ",";
		}

		System.out.println(str);

		int i = str.indexOf("4");
		// System.out.println(i);
		str = str.substring(0, i) + str.substring(i + 2);
		System.out.println(str);

		String[] strsayilar = str.split(",");
		int[] sayilar = new int[strsayilar.length];

		for (int t = 0; t < strsayilar.length; t++) {

			sayilar[t] = Integer.parseInt(strsayilar[t]);
			System.out.println(sayilar[t]);
		}
	}
}
