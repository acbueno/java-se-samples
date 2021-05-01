package br.com.acbueno.exercices.teste5;

import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(new InputStreamReader(System.in))) {
			System.out.println("Type value x:");
			int valueX = scanner.nextInt();
			System.out.println("Type value y:");
			int valueY = scanner.nextInt();
			System.out.println("Value x: " + valueX + " Values Y " + valueY);

			executeOperationDivisor(valueX, valueY);
		} catch (InputMismatchException | java.lang.ArithmeticException  e) {
			System.out.println(e.toString());
		}
	}

	private static void executeOperationDivisor(int valueX, int valueY) {
		int valueOperation = valueX / valueY;
		System.out.println("Value Operation " + valueOperation);
	}

}
