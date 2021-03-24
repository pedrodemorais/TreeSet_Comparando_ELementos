package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		//quando se usa o TreeSet, obrigatoriamente a classe tem que usar implements comparable<Classe>
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Geladeira", 700.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for(Product p: set) {
			System.out.println(p);
			
		}
		
		
	}
}
