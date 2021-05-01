package br.com.acbueno.exercices.testet12;

import java.util.Scanner;

public class PolidromeTest {

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		checkPolidrome(palindrome);
	}

	private static void checkPolidrome(Palindrome palindrome) {
		boolean isPolindrome = palindrome.isPolindrome(inputWord());

		if(isPolindrome) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static String inputWord()  {
		try (Scanner scanner = new Scanner(System.in)) {
			String wordCheckPolidrome = scanner.next();
			return wordCheckPolidrome;
		}
	}
}
