package com.bilgeadam.lesson006;

public class Question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 2;
		int end = 22;

		for (int i = start; i <= end; i++) {

			if (i % 3 == 0 && i % 5 == 0) {

				System.out.println("bilgeadam");
			} else if (i % 3 == 0) {

				System.out.println("bilge");

			} else if (i % 5 == 0) {
				System.out.println("adam");

			} else {

				System.out.println(i);
			}

		}

	}

}
