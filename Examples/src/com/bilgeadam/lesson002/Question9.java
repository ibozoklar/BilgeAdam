package com.bilgeadam.lesson002;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		int y = 1;

		for (int i = 0; i < 12; i++) {

			System.out.println(x);

			int z = x + y;
			x = y;
			y = z;

		}

	}

}
