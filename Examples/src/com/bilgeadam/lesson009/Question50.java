package com.bilgeadam.lesson009;

public class Question50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 6, 7 };

		tersineCevir(arr);
	}

	public static void tersineCevir(int[] arr) {

		int[] ters = new int[arr.length];
		int j = 0;

		for (int i = ters.length - 1; i >= 0; i--) {

			ters[j] = arr[i];
			System.out.println(ters[j]);
			j++;

		}
	}
}
