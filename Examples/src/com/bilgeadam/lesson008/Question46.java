package com.bilgeadam.lesson008;

import java.util.Scanner;

public class Question46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen dogum yilinizi girin");
		int dYili = sc.nextInt();

		int year = 2022;

		System.out.println(year);

		System.out.println("yasiniz : " + (year - dYili));

		System.out.println(((2022 / 100) + 1) + ". yy yasiyoruz");

	}

}
