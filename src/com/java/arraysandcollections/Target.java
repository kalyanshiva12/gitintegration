package com.java.arraysandcollections;

public class Target {

	public static void find_Target(int[] a, int target) {

		int length = a.length;

		for (int i = 0; i < length - 1; i++) {
			if (a[i] + a[i + 1] == target) {
				System.out.println(a[i] + " " + a[i + 1]);
			}
		}

	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };
		int target = 50;
		find_Target(a, target);

	}

}
