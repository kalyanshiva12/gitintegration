package com.java.logicprograms;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter year: ");

		Integer num = sc.nextInt();

		String result = check_leap(num) ? num + " is a leap year." : num + " is not a leap year.";
		System.out.println(result);

	}

	public static boolean check_leap(Integer num) {

		if (num % 4 == 0 || num % 100 == 0 && num % 400 == 0) {
			return true;
		} else
			return false;
	}

}
