package com.bilgeadam.lesson006;
public class Question36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matris = { { 56, 23, 678, 231 }, { 234, 21, 78, 26 }, { 654, 33, 32, 67 }, { 189, 35, 56, 89 } };

		int index = 0;
		int size = 0;

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					size++;

				}
			}

		}

		int[] ayriDizi = new int[size];
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					ayriDizi[index] = matris[i][j];
					index++;

				}
			}

		}

		for (int i = 0; i < ayriDizi.length; i++) {

			System.out.println(ayriDizi[i]);

		}
	}

}
