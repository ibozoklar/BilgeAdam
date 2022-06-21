package com.bilgeadam.lesson006;

public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;07-Antalya;08-Artvin;09-Aydın;10-Balıkesir";
		String[] array = sehirler.split(";");

		for (int i = 0; i < array.length; i++) {

			int index = array[i].indexOf("-");

			System.out.println(
					array[i].substring(index + 1) + " adli sehrin plaka kodu: " + array[i].substring(index + 1));

		}

	}

}
