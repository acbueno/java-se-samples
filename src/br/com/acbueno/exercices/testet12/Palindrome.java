package br.com.acbueno.exercices.testet12;

public class Palindrome {

	public boolean isPolindrome(String word) {
		String transformWorldRevere = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			transformWorldRevere = transformWorldRevere + word.charAt(i);
		}

		return word.equalsIgnoreCase(transformWorldRevere);
	}

}
