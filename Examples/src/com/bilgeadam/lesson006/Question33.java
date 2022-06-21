package com.bilgeadam.lesson006;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 1, 4, 5, 6, 13, 5, 1, 1 };
		int toplam = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 13) {

				break;

			} else {

				toplam += nums[i];
			}

		}

		System.out.println(toplam);
	}

}
