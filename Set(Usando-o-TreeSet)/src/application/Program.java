package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Set<Product> set = new TreeSet<>();
		/*
		 * Quando se usa o TreeSet, a classe do conjunto tem que usar a interface
		 * Comparable para poder usar o método comparableTo
		 */

		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		for (Product p : set) {
			System.out.println(p);
		}
	}
}