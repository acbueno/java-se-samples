package br.com.acbueno.teste.teste1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

	private static Scanner inputOption;

	public static void main(String[] args) throws IOException {
		Map<String, Integer> mapaNomes = new HashMap<>();
		boolean run = true;

		while (run) {
			System.out.println("Type 1 to register, 2 to search or 3 to exit");
			inputOption = new Scanner(System.in);
			int option = inputOption.nextInt();
			switch (option) {
			case 1:
				registerPhone(mapaNomes);
				break;
			case 2:
				findPhone(mapaNomes);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Not Found");
				break;
			}

		}

	}

	private static void findPhone(Map<String, Integer> mapaNomes) {
		String nameSearch = new Scanner(System.in).nextLine();
		if (mapaNomes.containsKey(nameSearch)) {
			System.out.println("Value search " + nameSearch + " = " + mapaNomes.get(nameSearch));
		} else {
			System.err.println("Not Found");
		}
	}

	private static void registerPhone(Map<String, Integer> mapaNomes) {

		boolean runRegister = true;

		while (runRegister) {
			Scanner in = new Scanner(System.in);
			System.out.println("Type name");
			String name = in.nextLine().toLowerCase();
			System.out.println("\n");
			System.out.println("You entered name\n" + name);
			System.out.println("\n");
			System.out.println("Type phone number");
			Integer numberPhone = in.nextInt();
			System.out.println("You entered integer\n " + numberPhone);
			mapaNomes.put(name, numberPhone);
			System.out.println(mapaNomes);

			System.out.println("Do you want to include another YES or NO registration?");
			boolean continueRegister = in.nextBoolean();
			runRegister = continueRegister;
		}

	}

}
