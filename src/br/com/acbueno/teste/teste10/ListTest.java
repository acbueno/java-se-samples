package br.com.acbueno.teste.teste10;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		addAndRemoveAndPrintList();
	}

	private static void addAndRemoveAndPrintList() {
		List<Integer> llist = new LinkedList<Integer>();

		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(1000);
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		llist.add(2);
		llist.add(3);
		llist.add(4);

		llist.remove(3);

		System.out.println("LinkedList before remove : " + llist.toString());
		System.out.println("LinkedList after : " + llist.toString());
	}

}
