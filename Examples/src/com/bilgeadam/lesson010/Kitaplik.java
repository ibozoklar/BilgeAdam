package com.bilgeadam.lesson010;

import java.util.Scanner;

public class Kitaplik {

	String[] kitaplik;
	int index;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Kitaplik kitaplik = new Kitaplik();

		int input = 0;

		kitaplik.kitaplik = kitaplik.kitaplikOlustur();

		do {
			System.out.println("1-Kitap Ekle");
			System.out.println("2-Kitap Ismi Ara");
			System.out.println("3-Yazar Ismi Ara");
			System.out.println("4-Kitaplari Listele");
			input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				kitaplik.kitapEkle();
				break;
			case 2:
				kitaplik.kitapIsmiArama();
				break;
			case 3:
				kitaplik.yazarIsmiArama();
				break;
			case 4:
				kitaplik.kitaplariListele();
				break;
			default:
				break;
			}

		} while (input != 0);

	}

	public void kitaplariListele() {

		for (int i = 0; i < kitaplik.length; i++) {
			int j = kitaplik[i].indexOf(",");
			System.out.println(kitaplik[i].substring(0, j));
		}
	}

	public void yazarIsmiArama() {
		System.out.println("Lutfen aranacak kitabin yazar adini giriniz...:");
		String yazarIsmi = scanner.nextLine().trim().toUpperCase();
		for (int i = 0; i < kitaplik.length; i++) {
			if (kitaplik[i].contains(yazarIsmi)) {
				System.out.println("Var");
			} else {
				System.out.println("Yok");
			}
		}
	}

	public void kitapIsmiArama() {
		System.out.println("Lutfen aranacak kitabin adini giriniz...:");
		String kitapIsmi = scanner.nextLine().trim().toUpperCase();
		for (int i = 0; i < kitaplik.length; i++) {
			if (kitaplik[i].contains(kitapIsmi)) {
				System.out.println("Var");
			} else {
				System.out.println("Yok");
			}
		}
	}

	public void kitapEkle() {

		if (index < kitaplik.length) {

			System.out.println("Lütfen Yazar simini giriniz");
			String yazarIsmi = scanner.nextLine().trim().toUpperCase();
			System.out.println("Lütfen Kitap ismini Giriniz");
			String kitapIsmı = scanner.nextLine().trim().toUpperCase();
			kitaplik[index] = yazarIsmi + "," + kitapIsmı;
			index++;
			for (String string : kitaplik) {
				System.out.println(string);
			}

		} else {
			System.out.println("Kitaplığımız Dolmuştur");
		}

	}

	public void kitapBilgileriniOlustur() {

		for (int i = 0; i < kitaplik.length; i++) {
			System.out.println("Lütfen Yazar simini giriniz");
			String yazarIsmi = scanner.nextLine().trim().toUpperCase();
			System.out.println("Lütfen Kitap ismini Giriniz");
			String kitapIsmı = scanner.nextLine().trim().toUpperCase();
			kitaplik[i] = yazarIsmi + "," + kitapIsmı;
		}
		for (String string : kitaplik) {
			System.out.println(string);
		}
	}

	public String[] kitaplikOlustur() {

		System.out.println("Lütfen kitaplığın boyutunu giriniz");
		int kitaplikBoyutu = scanner.nextInt();
		scanner.nextLine();
		kitaplik = new String[kitaplikBoyutu];
		return kitaplik;
	}
}
