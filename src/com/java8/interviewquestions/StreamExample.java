package com.java8.interviewquestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

		// Get the no of active threads
		int activeThreads = Thread.activeCount();
		System.out.println("no of active threads " + activeThreads);

		// check if it is main thread or not
		Thread currentThread = Thread.currentThread();

		if (currentThread.getName().equals("main")) {
			System.out.println(" This is main thread: ");
		} else {
			System.out.println(" Current Thread: " + currentThread.getName());
		}

		// sequential stream
		System.out.println("squential stream: ");
		numbers.stream().forEach(System.out::println);

		// parallel stream
		System.out.println("Parallel stream: ");
		numbers.parallelStream().forEach(number -> {
			Thread thread = Thread.currentThread();
			if (thread.getName().equals("main")) {
				System.out.println(number + " - This is the main thread");
			} else {
				System.out.println(number + " - Current Thread: " + thread.getName());
			}

		});

	}

}
