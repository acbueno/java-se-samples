package br.com.acbueno.exercices.teste7;

import java.util.Scanner;

public class TwoCharacters {

	;

	public static void main(String[] args) {

		String initialString = "abaacdabd";
		String target = "ab";
		String regexTarget = "(ab)$";
	    String 	newStr = initialString.replaceAll(regexTarget, "");

		System.out.println(newStr);



	}

}
