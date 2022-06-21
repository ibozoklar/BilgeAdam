package com.bilgeadam.lesson006;

import java.util.Scanner;

public class odev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Lutfen tek bir sayi giriniz.....:");
		int sayi = sc.nextInt();
		System.out.println("Lutfen satir sayisini giriniz...:");
		int satir = sc.nextInt();
		System.out.println("Lutfen sutun sayisini giriniz...:");
		int sutun = sc.nextInt();
		int orta = (sayi + 1) / 2;
		int index = 0;

		int[][] matris = new int[satir][sutun];

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (index == j) {
					System.out.print(orta + " ");
				} else if (j < index) {
					System.out.print("1 ");
				} else if (j > index) {
					System.out.print(sayi + " ");
				}
			}
			System.out.println("");
			index++;
		}
		System.out.println();
	}
}
