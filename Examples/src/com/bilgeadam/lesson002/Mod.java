package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin: ");
		int sayı = sc.nextInt();
		System.out.println("Lutfen modu girin: ");
		int mod = sc.nextInt();

		System.out.println("Sonuc = " + (sayı % mod));
	}

}
