package com.bilgeadam.lesson002;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int top = 50;
		int i = 1;
		boolean check = true;

		while (check) {

			sum += i;
			i++;
			check = (top > sum);
			System.out.println(sum);
		}

		System.out.println("bitti");
	}

}
