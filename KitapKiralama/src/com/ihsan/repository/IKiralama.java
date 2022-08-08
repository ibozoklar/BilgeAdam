package com.ihsan.repository;

import java.util.List;

import com.ihsan.entity.Kitap;
import com.ihsan.entity.Musteri;

public interface IKiralama {

	public Kitap kitapAra(String kitapIsmi, String kitapYazarIsmi);

	public List<Kitap> kiralananKitapListesi(Musteri musteri);

	public void kiralamaYap(Musteri musteri, Kitap kitap);

	public Musteri musteriAra(String musteriIsmi);
}
