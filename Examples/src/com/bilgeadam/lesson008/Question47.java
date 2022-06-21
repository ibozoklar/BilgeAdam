package com.bilgeadam.lesson008;

import java.util.Random;
import java.util.Scanner;

public class Question47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Lutfen yaratmak istediginiz dzinin eleman sayisini girin....:");
		int uzunluk = sc.nextInt();

		int[] dizi = new int[uzunluk];

		for (int i = 0; i < dizi.length; i++) {

			dizi[i] = randomSayi();
		}

		System.out.println(ortalamaAl(dizi));

	}

	public static int ortalamaAl(int[] dizi) {
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {

			toplam += dizi[i];
		}

		return toplam / dizi.length;
	}

	public static int randomSayi() {

		Random rnd = new Random();

		return rnd.nextInt(500);

	}
}
