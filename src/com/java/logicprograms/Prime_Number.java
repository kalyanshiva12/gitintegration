package com.java.logicprograms;

public class Prime_Number {

	public static void get_prime(int n) {

		boolean check_Prime = false;
		if (n <= 1) {
			check_Prime = true;
		}

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				check_Prime = true;
			}

		}

		if (!check_Prime == true) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}

	}

	public static void main(String[] args) {
		get_prime(1);
		get_prime(10);
		get_prime(15);
		get_prime(23);
		get_prime(97);
	}

}
