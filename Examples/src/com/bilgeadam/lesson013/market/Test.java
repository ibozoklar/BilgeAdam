package com.bilgeadam.lesson013.market;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Market market = new Market();

		market.acilisSaati = 9;
		market.kapanisSaati = 22;
		market.marketAdi = "Migros";

		market.anons();

		EtUrunleri urun1 = new EtUrunleri();
		urun1.hayvanTuru = "Kuzu";
		urun1.urunAdi = "Pirzola";
		urun1.uretimTarihi = 15 / 06 / 2022;
		urun1.sonKullanmaTarihi = 20 / 07 / 2022;

		SutUrunleri urun2 = new SutUrunleri();
		urun2.marka = "Sakipaga";
		urun2.urunAdi = "peynir";
		urun2.uretimTarihi = 15 / 06 / 2022;
		urun2.sonKullanmaTarihi = 20 / 07 / 2022;

		MarketYonetimi yonetim = new MarketYonetimi();

		yonetim.marketeUrunEkle(urun1);
		yonetim.marketeUrunEkle(urun2);

		yonetim.urunleriListele();

	}

}
