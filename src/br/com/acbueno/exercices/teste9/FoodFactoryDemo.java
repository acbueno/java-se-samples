package br.com.acbueno.exercices.teste9;

public class FoodFactoryDemo {

	public static void main(String[] args) {

		FoodFactory foodFactory = new FoodFactory();

		Food foodPizza = foodFactory.getFood("Pizza");

		System.out.println(foodPizza.getType());

		Food foodCake = foodFactory.getFood("Cake");

		System.out.println(foodCake.getType());

	}

}
