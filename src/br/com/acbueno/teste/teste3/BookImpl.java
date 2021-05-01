package br.com.acbueno.teste.teste3;

public class BookImpl extends Book {

	@Override
	void setTitle(String value) {
		title = value;
		System.out.println("The title is " + super.getTitle());
	}

}
