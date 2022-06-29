package com.bilgeadam.lesson013.market;

public class MarketYonetimi extends Market {

	Urunlerimiz[] urunler = new Urunlerimiz[0];
	int adet = 0;

	public void marketeUrunEkle(Urunlerimiz urun) {

		Urunlerimiz[] temp = new Urunlerimiz[urunler.length + 1];

		for (int i = 0; i < urunler.length; i++) {
			temp[i] = urunler[i];
		}
		temp[temp.length - 1] = urun;
		urunler = temp;

		urunler[adet] = urun;
		adet++;

	}

	public void urunleriListele() {

		for (int i = 0; i < urunler.length; i++) {

			System.out.println("Urun: " + urunler[i].urunAdi);
		}

	}

}
