package br.com.acbueno.teste.teste9;

public class FoodFactory {

	private String textPattern = "The factory returned class ";

	public Food getFood(String food) {
		if (food == null) {
			return null;
		}

		if (food.equalsIgnoreCase("PIZZA")) {
			System.out.print(textPattern);
			return new Pizza();
		}

		if (food.equalsIgnoreCase("CAKE")) {
			System.out.print(textPattern);
			return new Cake();
		}
		return null;
	}

}
