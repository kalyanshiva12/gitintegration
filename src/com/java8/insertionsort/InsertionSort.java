package com.java8.insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the array elements:");

		for (int i = 0; i < size; i++) {
			System.out.print("Enter element at index " + i + ": ");
			array[i] = scanner.nextInt();
		}

		// Sort the array using insertion sort algorithm
		for (int i = 1; i < size; i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = key;
		}

		System.out.println("Sorted array: " + Arrays.toString(array));

		scanner.close();

	}

}
