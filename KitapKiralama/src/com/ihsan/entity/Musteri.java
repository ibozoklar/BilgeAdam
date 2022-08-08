package com.ihsan.entity;

import java.util.List;
import java.util.UUID;

public class Musteri extends Insan {

	private List<Kitap> kiralananKitaplar;
	private String id;

	public Musteri(String isim, List<Kitap> kiralananKitap) {
		super(isim);

		this.kiralananKitaplar = kiralananKitap;
		UUID.randomUUID().toString();
	}

	public Musteri(String isim) {
		super(isim);

		this.id = UUID.randomUUID().toString();
	}

	public void kiralananKitapEkle(Kitap kitap) {
		kiralananKitaplar.add(kitap);
	}

	public List<Kitap> getKiralananKitaplar() {
		return kiralananKitaplar;
	}

	public void setKiralananKitaplar(List<Kitap> kiralananKitaplar) {
		this.kiralananKitaplar = kiralananKitaplar;
	}

	public String getId() {
		return id;
	}

}
