package br.com.acbueno.teste.teste6;

import java.util.stream.IntStream;

public class SumArray {

	public static void main(String[] args) {
		sumArray();
	}

	public static void sumArray() {
		int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = IntStream.of(intArray).sum();
		System.out.println("Value sum array " + sum);
	}
}
