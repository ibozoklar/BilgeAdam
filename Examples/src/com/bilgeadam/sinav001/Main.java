package com.bilgeadam.sinav001;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aritmetik arit = new Aritmetik();

		// arit.bolum();
		// arit.toplama();
		// arit.cikartma();
		// arit.toplama();
		// arit.ucgenAlaniHesapla();
		// arit.kareAlaniniHesapla();
		// arit.dikdortgenAlaniHesapla();

		SayiDizisi dizi = new SayiDizisi();
		dizi.ekle(2);
		dizi.ekle(1);
//		dizi.sil(1);
		dizi.ekle(10);
		dizi.ekle(33);
		dizi.arayaEkle(2, 123);
		dizi.sil(123);
		dizi.sil(123);

//		dizi.ekle(3);
//		dizi.bas();
//		System.out.println("....");
//		dizi.ekle(5);
//		dizi.bas();
//		System.out.println("....");
//		dizi.ekle(9);
//		dizi.bas();
//		System.out.println("....");
//		dizi.ekle(4);
//		dizi.bas();
//		System.out.println("....");
//		dizi.sil(4);
//		dizi.bas();
//		System.out.println("....");
//		dizi.arayaEkle(2, 10);
//		dizi.bas();

		for (int i : dizi.listele()) {
			System.out.println(i);
		}

//		CustomStringTr cstr = new CustomStringTr();
//
//		cstr.ifade = "deneme";
//		System.out.println(cstr.uzunluk());
//		System.out.println(cstr.degistir("e", "a"));

	}

}
