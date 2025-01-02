package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		String s1 = "Test";
		String s2 = "Test";

		String s3 = new String("Test");
		String s4 = new String("Test");
		
		System.out.println();
		System.out.println("Usando o hashCode com c1 e c2:");
		System.out.printf("c1 hashCode é %d%n", c1.hashCode());
		System.out.printf("c2 hashCode é %d%n", c2.hashCode());

		System.out.println();
		System.out.println("Usando o equals:");
		System.out.printf("c1 e c2 têm as mesmas informações? %b%n", c1.equals(c2));

		System.out.println();
		System.out.println("Tipo referência:");
		System.out.printf("c1 e c2 são a mesma referência? %b%n", c1 == c2);
		
		System.out.println();
		System.out.println("Comparando s3 e s4 com ==:");
		System.out.printf("s3 e s4 são a mesma referência? %b%n", s3 == s4);

		System.out.println();
		System.out.println("Comparando s3 e s2 com equals(), tendo em vista a mémoria pool das Strings literais:");
		System.out.printf("s3 e s2 têm o mesmo conteúdo? %b%n", s3.equals(s2));
		
		System.out.println();
		System.out.println("Tipo primitivo:");
		System.out.printf("s1 e s2 são a mesma referência? %b%n", s1 == s2);
	}
}
