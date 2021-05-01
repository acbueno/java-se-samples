package br.com.acbueno.exercices.teste11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteGeneric {

	static Integer[] intArray = {1, 2, 3, 4, 5};

	static String[] stringArray  = {"Beans", "Rice", "apple"};

	public static void main(String[] args) {

		System.out.println(fromArrayToList(intArray));
		System.out.println(fromArrayToList(stringArray));
	}

	public static <T> List<T> fromArrayToList(T[] a) {
	    return Arrays.stream(a).collect(Collectors.toList());
	}

}
