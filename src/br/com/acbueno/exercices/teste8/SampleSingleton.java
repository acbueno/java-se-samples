package br.com.acbueno.exercices.teste8;

public class SampleSingleton {

	private static SampleSingleton INSTANCE = null;
	private static String info = "Inicial info class";

	private SampleSingleton() {

	}

	public static String printInfo() {
		return info;
	}

	public static SampleSingleton getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new SampleSingleton();
		}
		return INSTANCE;
	}

}
