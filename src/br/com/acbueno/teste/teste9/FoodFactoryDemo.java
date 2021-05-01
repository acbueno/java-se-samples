package br.com.acbueno.teste.teste9;

public class FoodFactoryDemo {

	public static void main(String[] args) {

		FoodFactory foodFactory = new FoodFactory();

		Food foodPizza = foodFactory.getFood("Pizza");

		System.out.println(foodPizza.getType());

		Food foodCake = foodFactory.getFood("Cake");

		System.out.println(foodCake.getType());

	}

}
