package com.ihsan.repository;

import java.util.ArrayList;
import java.util.List;

import com.ihsan.entity.Kitap;
import com.ihsan.entity.Musteri;
import com.ihsan.utility.DataBase;

public class Kiralama implements IKiralama {

	public List<Kitap> kiralananKitapListesi(Musteri musteri) {

		if (musteri.getKiralananKitaplar() != null) {
			return musteri.getKiralananKitaplar();
		} else {
			System.out.println("Kiralanan hiç kitap yok");
			return null;
		}

	}

	public void kiralamaYap(Musteri musteri, Kitap kitap) {

		if (kitap.isMusaitMi() == true) {
			System.out.println("Kiralama islemi basliyor");

			if (musteri.getKiralananKitaplar() == null) {
				musteri.setKiralananKitaplar(new ArrayList<>() {
					{
						add(kitap);
					}
				});
			} else {
				musteri.kiralananKitapEkle(kitap);
			}

			if (kitap.getKiralayanMusteriler() == null) {

				kitap.setKiralayanMusteriler(new ArrayList<>() {
					{
						add(musteri);
					}
				});

			} else {
				kitap.kiralayanMusteriEkle(musteri);
			}

			kitap.setMusaitMi(false);
			kitap.setKiralanmaSayisi(kitap.getKiralanmaSayisi() + 1);
			kitap.setSuAnKimde(musteri);
			System.out.println("Kitap kiralandi");
		} else {
			System.out.println("Bu kitap kiralanmak icin musait degil");
		}

	}

	public Kitap kitapAra(String kitapIsmi, String kitapYazarIsmi) {
		for (int i = 0; i < DataBase.kitapListesi.size(); i++) {
			if (DataBase.kitapListesi.get(i).getIsim().equals(kitapIsmi)
					&& DataBase.kitapListesi.get(i).getYazar().equals(kitapYazarIsmi)) {
				System.out.println("Kitap bulundu");
				return DataBase.kitapListesi.get(i);
			}
		}
		System.out.println("Kitap bulunamdi");
		return null;
	}

	public Musteri musteriAra(String musteriIsmi) {
		for (int i = 0; i < DataBase.musteriListesi.size(); i++) {
			if (DataBase.musteriListesi.get(i).getIsim().equals(musteriIsmi)) {
				System.out.println("Musteri bulundu");
				return DataBase.musteriListesi.get(i);
			}
		}
		System.out.println("Musteri bulunamdi");
		return null;
	}

}
