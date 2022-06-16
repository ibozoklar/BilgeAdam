package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir GUN girin: ");
		int gün = sc.nextInt();
		System.out.println("Lutfen bir AY girin: ");
		int ay = sc.nextInt();

		switch (ay) {
		case 1:

			if (gün >= 1 && gün <= 21) {
				System.out.println("OĞLAK");
			} else {
				System.out.println("KOVA");
			}

			break;
		case 2:
			if (gün <= 19) {
				System.out.println("KOVA");
			} else {
				System.out.println("BALIK");
			}
			break;
		case 3:
			if (gün <= 20) {
				System.out.println("BALIK");
			} else {
				System.out.println("KOÇ");
			}
			break;
		case 4:
			if (gün <= 21) {
				System.out.println("KOÇ");
			} else {
				System.out.println("BOĞA");
			}
			break;
		case 5:
			if (gün <= 21) {
				System.out.println("BOĞA");
			} else {
				System.out.println("İKİZLER");
			}
			break;
		case 6:
			if (gün <= 22) {
				System.out.println("İKİZLER");
			} else {
				System.out.println("YENGEC");
			}
			break;
		case 7:
			if (gün <= 22) {
				System.out.println("YENGEC");
			} else {
				System.out.println("ASLAN");
			}

			break;
		case 8:
			if (gün <= 22) {
				System.out.println("ASLAN");
			} else {
				System.out.println("BASAK");
			}
			break;

		case 9:
			if (gün <= 22) {
				System.out.println("BASAK");
			} else {
				System.out.println("TERAZI");
			}
		}

	}

}
