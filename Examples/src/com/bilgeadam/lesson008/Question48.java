package com.bilgeadam.lesson008;

/*
 * 1.method Dışarıdan girilen harfle başlayan illeri yazdır.
 * 2.method illeri plaka kodları ile yazdıran method 01-Adana,02-Adıyaman,03-Afyon 
 * 3.Girdiğimiz şehrin ismine göre plaka dönen methodu yazalım.
 * 4.İlk harf hariç sesli harfleri silip yazdıran fonksiyon.
 * 5.method bir önceki methoddan dönen Dğerlerin ilk üç harfini alın ve sonuna ... 
 * nokta ekleyin Adn... Ady... gibi
 * 
 * 
 * 
 */
public class Question48 {
	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };

	public static void main(String[] args) {

//		ilBul("B");
//		plakalarıYazdır();
//		plakaBul("Ankara", "Bolu", "Kars");

		// String[] yeniDizi = sesliHarfleriSil();
		// String[] deneme = { "Cankiri", "Tarik", "Erzincan" };

		ilkUcHarf(iller);

//		kisaltma(yeniDizi);

		// bBasinaEkle(yeniDizi);

	}

	public static void bBasinaEkle(String[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].startsWith("B")) {
				System.out.println((i + 1) + "-" + dizi[i]);
			} else {
				System.out.println(dizi[i]);
			}
		}
	}

	public static void ilkUcHarf(String[] dizi) {

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].charAt(1) == 'a') {
				String out = "";
				for (int j = 0; j < 3; j++) {
					out += Character.toUpperCase((dizi[i].charAt(j)));
				}
				System.out.println(out);
			} else {
				System.out.println(dizi[i]);
			}
		}

	}

	public static void kisaltma(String[] dizi) {

		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i].length() > 2) {
				System.out.println(dizi[i].substring(0, 3) + "...");

			} else {
				System.out.println(dizi[i] + "...");
			}
		}
	}

	public static String[] sesliHarfleriSil() {
		String[] sesliHarfler = { "a", "e", "ı", "i", "o", "ö", "u", "ü" };
		String[] yeniDizi = new String[iller.length];
		for (int i = 0; i < iller.length; i++) {

			for (int j = 0; j < sesliHarfler.length; j++) {

				if (iller[i].contains(sesliHarfler[j])) {
					iller[i] = iller[i].replace(sesliHarfler[j], "");

				}

			}
			yeniDizi[i] = iller[i];
		}

		return yeniDizi;

	}

	public static void ilBul(String harf) {

//		for (int i = 0; i < iller.length; i++) {
//
//			if (iller[i].startsWith(harf.toUpperCase().substring(0, 1))) {
//				System.out.println(iller[i]);
//			}
//
//		}

		for (String il : iller) {

			if (il.startsWith(harf.toUpperCase().substring(0, 1))) {
				System.out.println(il);

			}

		}

	}

	public static void plakalarıYazdır() {

//		for (int i = 0; i < iller.length; i++) {
//
//			if (i < 9) {
//				System.out.println("0" + (i + 1) + "-" + iller[i]);
//			} else {
//				System.out.println((i + 1) + "-" + iller[i]);
//			}
//
//		}

		int i = 1;

		for (String il : iller) {

			if (i < 10) {
				System.out.println("0" + i + "-" + il);
			} else {
				System.out.println(i + "-" + il);
			}

			i++;
		}

	}

	public static void plakaBul(String... il) {

		for (int i = 0; i < iller.length; i++) {

			for (int j = 0; j < il.length; j++) {
				if (iller[i].equalsIgnoreCase(il[j].trim())) {
					if (i < 9) {
						System.out.println(iller[i] + "-0" + (i + 1));
					} else {
						System.out.println(iller[i] + "-" + (i + 1));
					}

				}

			}

		}

	}

}
