package com.ihsan.utility;

import java.util.ArrayList;
import java.util.List;

import com.ihsan.entity.Kitap;
import com.ihsan.entity.Musteri;

public class DataBase {

	public static List<Kitap> kitapListesi = new ArrayList<>() {
		{
			add(new Kitap("Robotlarin Iktidari", "Martin Ford"));
			add(new Kitap("Kazanma Ekisi", "Ian Robertson"));
			add(new Kitap("Bir Yaz Boyunca", "Tessa Bailey"));
			add(new Kitap("Bir Bahar Aksami", "Kubra Nur"));
			add(new Kitap("Kaplanin Sirtinda", "Zulfu Livaneli"));
			add(new Kitap("Matem Cicekleri", "Beyza Aksoy"));
			add(new Kitap("Gelibolu", "Buket Uzuner"));
			add(new Kitap("Kumdan Kale", "Einat Tsarfati"));
		}
	};

	public static List<Musteri> musteriListesi = new ArrayList<>() {
		{
			add(new Musteri("Ihsan Can Bozoklar"));
			add(new Musteri("Elon Musk"));
			add(new Musteri("James Bond"));
			add(new Musteri("Ahmet Alkis"));
		}
	};

}
