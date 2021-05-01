package br.com.acbueno.exercices.teste3;

public class BookImpl extends Book {

	@Override
	void setTitle(String value) {
		title = value;
		System.out.println("The title is " + super.getTitle());
	}

}
