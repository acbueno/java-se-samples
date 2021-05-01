package br.com.acbueno.teste.teste4;

import java.io.InputStreamReader;
import java.util.Scanner;

public class AdvancedArithmeticTest {

	public static void main(String[] args) {
        AdvancedArithmeticImpl advancedArithmeticImpl = new AdvancedArithmeticImpl();
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Type number for sum divisor: ");
        int numberDivisor = scanner.nextInt();

        int sumDivisor = advancedArithmeticImpl.divisorSum(numberDivisor);
        System.out.println("Value sum number : " + numberDivisor + " is " + sumDivisor );
	}

}
