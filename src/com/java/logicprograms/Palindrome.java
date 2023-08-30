package com.java.logicprograms;

public class Palindrome {

	public static void check_palindrome(String s) {
		String rev = "";
		s = "";

		int length = s.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

			if (s.equals(rev))
				System.out.println(s + " is a palindrome");

			else
				System.out.println(s + " is not a palindrome ");

		}

	}

	public static void main(String[] args) {
		check_palindrome("aaa");
	}

}
