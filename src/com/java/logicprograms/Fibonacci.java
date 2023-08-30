package com.java.logicprograms;

//public class Fibonacci {
//
//	public static int fibonacci(int n) {
//		if (n <= 1) {
//			return n;
//		}
//		return fibonacci(n - 1) + fibonacci(n - 2);
//	}
//
//	public static void main(String[] args) {
//
//		int n = 10;
//		int result = fibonacci(n);
//		System.out.println(result);
//
//	}
//
//}

public class Fibonacci {
	public static long fibonacci(int n) {
		if (n <= 1) {
			return n;
		}

		long[][] baseMatrix = { { 1, 1 }, { 1, 0 } };
		long[][] resultMatrix = matrixPower(baseMatrix, n - 1);

		return resultMatrix[0][0];
	}

	public static long[][] matrixPower(long[][] matrix, int power) {
		if (power == 0) {
			return new long[][] { { 1, 0 }, { 0, 1 } };
		}

		if (power % 2 == 0) {
			long[][] halfPowerMatrix = matrixPower(matrix, power / 2);
			return matrixMultiply(halfPowerMatrix, halfPowerMatrix);
		} else {
			long[][] halfPowerMatrix = matrixPower(matrix, power / 2);
			long[][] resultMatrix = matrixMultiply(halfPowerMatrix, halfPowerMatrix);
			return matrixMultiply(resultMatrix, matrix);
		}
	}

	public static long[][] matrixMultiply(long[][] matrix1, long[][] matrix2) {
		int rows1 = matrix1.length;
		int cols1 = matrix1[0].length;
		int cols2 = matrix2[0].length;

		long[][] resultMatrix = new long[rows1][cols2];

		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < cols1; k++) {
					resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		return resultMatrix;
	}

	public static void main(String[] args) {
		int n = 10; // Change this value to get the N-th Fibonacci number
		long result = fibonacci(n);
		System.out.println("The " + n + "th Fibonacci number is: " + result);
	}
}
