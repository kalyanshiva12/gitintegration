package com.java8.interviewquestions;

import java.util.List;

public class Function2 {
	
	public static int sample(int n) {
		return n * 2;
	}

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static void main(String[] args) {
		var num = List.of(1, 2, 3, 4, 5, 6);

		num.stream().filter(Function2::isEven).map(Function2::sample).limit(1).forEach(System.out::println);

		System.out.println("--------------------");
	}
}
