package br.com.acbueno.teste.teste8;

public class TesteSampleSingleton {

	public static void main(String[] args) {
	     SampleSingleton singleton=	SampleSingleton.getInstance();
	     System.out.println("Run SampleSingleton " + singleton.printInfo());
	}

}
