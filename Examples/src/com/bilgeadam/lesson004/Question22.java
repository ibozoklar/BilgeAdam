package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sayfa = 0;
		int digerSayfa = 0;
		int aSayfası = 0;
		int bSayfası = 0;
		int cSayfası = 0;

		for (int i = 0; i < 5; i++) {
			String kelime = sc.nextLine();

			if (kelime.startsWith("a")) {
				aSayfası = 1;

			} else if (kelime.startsWith("b")) {

				bSayfası = 1;
			} else if (kelime.startsWith("c")) {

				cSayfası = 1;
			} else {

				digerSayfa = 1;
			}

		}
		System.out.println(digerSayfa + aSayfası + bSayfası + cSayfası);

	}

}
