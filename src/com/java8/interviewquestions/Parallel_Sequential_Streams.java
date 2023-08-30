package com.java8.interviewquestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Parallel_Sequential_Streams {

	public static void main(String[] args) {

		List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

		// sequential stream
		System.out.println("Sequential stream");
		numbers.stream().forEach(System.out::println);

		System.out.println("Parallel stream");
		numbers.parallelStream().forEach(System.out::println);

		// Get the number of active threads

		int threads = Thread.activeCount();
		System.out.println("no of active threads : " + threads);
	}

}
