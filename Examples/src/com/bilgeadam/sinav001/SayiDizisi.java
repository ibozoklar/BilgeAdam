package com.bilgeadam.sinav001;

public class SayiDizisi {

	static int[] dizi = new int[0];

	public void arayaEkle(int index, int sayi) {

		int[] temp = new int[dizi.length + 1];

		for (int i = 0; i < index; i++) {
			temp[i] = dizi[i];
		}

		temp[index] = sayi;

		for (int i = index + 1; i < temp.length; i++) {
			temp[i] = dizi[i - 1];
		}

		dizi = temp;

	}

	public void ekle(int sayi) {

		int[] temp = new int[dizi.length + 1];

		for (int i = 0; i < dizi.length; i++) {
			temp[i] = dizi[i];
		}
		temp[temp.length - 1] = sayi;
		dizi = temp;

//		if (dizi == null) {
//
//			dizi[0] = sayi;
//		} else {
//
//			int[] temp = new int[dizi.length + 1];
//
//			for (int i = 0; i < dizi.length; i++) {
//				temp[i] = dizi[i];
//			}
//			temp[temp.length - 1] = sayi;
//			dizi = temp;
//		}
	}

	public void sil(int sayi) {

//		boolean sayiVarMi = false;
//		String strsayi = String.valueOf(sayi);
//		String str = "";
//
//		for (int i = 0; i < dizi.length; i++) {
//
//			str += dizi[i] + ",";
//		}
//		String[] strsayilar1 = str.split(",");
//		int[] sayilar1 = new int[strsayilar1.length];
//		for (int t = 0; t < strsayilar1.length; t++) {
//			sayilar1[t] = Integer.parseInt(strsayilar1[t]);
//			if (sayi == sayilar1[t]) {
//				sayiVarMi = true;
//			}
//		}
//
//		if (sayiVarMi) {
//			for (int t = 0; t < strsayilar1.length; t++) {
//
//				sayilar1[t] = Integer.parseInt(strsayilar1[t]);
//
//			}
//			dizi = sayilar1;
//
//		} else {
//
//			System.out.println("Lutfen var olan bi sayiyi silmeye calisin");
//		}

//*********************************************************		
		String strsayi = String.valueOf(sayi);
		String str = "";

		for (int i = 0; i < dizi.length; i++) {

			str += dizi[i] + ",";
		}

		int index = str.indexOf(strsayi);
		str = str.substring(0, index) + str.substring(index + 2);

		String[] strsayilar = str.split(",");
		int[] sayilar = new int[strsayilar.length];
		for (int t = 0; t < strsayilar.length; t++) {

			sayilar[t] = Integer.parseInt(strsayilar[t]);

		}
		dizi = sayilar;

	}

	public int[] listele() {

		return dizi;
	}

	public void bas() {

		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
	}
}
