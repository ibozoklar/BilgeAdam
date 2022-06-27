package com.bilgeadam.lesson009;

public class Question51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 10, 7, 4, 5, 6, 8, 20, 5 };
		int[] arr = { 1, 2, 200, 499, 5959 };

		System.out.println(sirali(nums));
		System.out.println(sirali(arr));

	}

	public static boolean sirali(int[] dizi) {

		for (int i = 0; i < dizi.length - 2; i++) {
			if (dizi[i + 2] - dizi[i + 1] == 1 && dizi[i + 1] - dizi[i] == 1) {

				return true;
			}
		}

		return false;
	}
}
