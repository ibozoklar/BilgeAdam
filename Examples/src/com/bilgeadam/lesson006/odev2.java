package com.bilgeadam.lesson006;

public class odev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dizi = { 1, 2, 5, 3, 7, 4, 3, 5, 7, 8, 2, 3, 5, 6, 6, 42, 1, 3, 5, 6, 8 };
		boolean visited[] = new boolean[dizi.length];
		int count = 1;

		for (int i = 0; i < dizi.length; i++) {
			if (visited[i] == true) {
				continue;
			}

			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] == dizi[j]) {
					visited[j] = true;
					count++;
				}
			} // for j
			System.out.println(dizi[i] + " sayisindan " + count + " tane var.");
			count = 1;
		} // for i
	}
}
