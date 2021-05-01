package br.com.acbueno.exercices.teste2;

public class Mortorcicle extends Bicycle {

	public Mortorcicle() {
		System.out.println("Hello I am a motorcycle, I am " + defineMe());
		String temp = super.defineMe();
		System.out.println("My ancestor is cycle who is " + temp);
	}

	@Override
	public String defineMe() {
		return "a vehicle with engine.";
	}

}
