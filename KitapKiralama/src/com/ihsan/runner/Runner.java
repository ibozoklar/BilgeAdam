package com.ihsan.runner;

import java.util.List;
import java.util.stream.Collectors;

import com.ihsan.entity.Kitap;
import com.ihsan.entity.Musteri;
import com.ihsan.repository.Kiralama;
import com.ihsan.utility.DataBase;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataBase.musteriListesi.add(new Musteri("Jeff Bezos"));

		Kiralama kiralama = new Kiralama();

		Musteri jeff = kiralama.musteriAra("Jeff Bezos");
		Kitap gelibolu = kiralama.kitapAra("Gelibolu", "Buket Uzuner");

		kiralama.kiralamaYap(jeff, gelibolu);

		kiralama.kiralananKitapListesi(jeff);

		gelibolu.getKiralayanMusteriler().forEach(m -> System.out.println("Kiralayan musteriler  ::::" + m.getIsim()));

		List<Kitap> kiralananKitapListesi = kiralama.kiralananKitapListesi(jeff);

		kiralananKitapListesi.forEach(k -> System.out.println(k.getIsim()));

		// Soru 5

		// ahm ile başlayan müşterilerin listesini bulunuz
		ahmIleBaslayanMusterileriYaz();

		// id bilgisi verilmiş olan Kitap kim tarafından kiralanmış?
		String geliboluID = gelibolu.getId();
		kitapKimTarafindanKiralanmisYaz(geliboluID);

		// adı verilen kitap daha önce kimler tarafından kiralanmış
		Kitap adiverilenkitap = kiralama.kitapAra("Gelibolu", "Buket Uzuner");
		kitapKimlerTarafindanKiralanmis(adiverilenkitap);

		// id verilen müşterinin kiraladığı kitapların listesini bulunuz?
		String jeffID = jeff.getId();
		musterininKiraladigiKitapListesiYaz(jeffID);

	}

	private static void musterininKiraladigiKitapListesiYaz(String jeffID) {
		List<List<Kitap>> idMusteriKitapListesi = DataBase.musteriListesi.stream().filter(m -> m.getId().equals(jeffID))
				.map(m -> m.getKiralananKitaplar()).collect(Collectors.toList());
		idMusteriKitapListesi.forEach(k -> k.forEach(kk -> System.out.println(kk.getIsim())));

	}

	private static void kitapKimlerTarafindanKiralanmis(Kitap adiverilenkitap) {
		String kitapadi = adiverilenkitap.getIsim();
		List<List<Musteri>> kimlerKiralamis = DataBase.kitapListesi.stream().filter(k -> k.getIsim().equals(kitapadi))
				.map(k -> k.getKiralayanMusteriler()).collect(Collectors.toList());
		kimlerKiralamis.forEach(m -> m.forEach(
				mm -> System.out.println("adi verilen kitap daha once kimler tarafindan kiralanmis?" + mm.getIsim())));

	}

	private static void kitapKimTarafindanKiralanmisYaz(String geliboluID) {
		// TODO Auto-generated method stub
		List<Musteri> idkitapKimde = DataBase.kitapListesi.stream().filter(k -> k.getId().equals(geliboluID))
				.map(k -> k.getSuAnKimde()).collect(Collectors.toList());
		idkitapKimde.forEach(
				m -> System.out.println("id bilgisi verilmis olan Kitap kim tarafindan kiralanmis?" + m.getIsim()));

	}

	public static void ahmIleBaslayanMusterileriYaz() {
		List<Musteri> ahmIleBaslayanlar = DataBase.musteriListesi.stream()
				.filter(m -> m.getIsim().toLowerCase().startsWith("ahm")).collect(Collectors.toList());
		System.out.println("ahm ile başlayanlar--------");
		ahmIleBaslayanlar.forEach(k -> System.out.println(k.getIsim()));
	}
}
