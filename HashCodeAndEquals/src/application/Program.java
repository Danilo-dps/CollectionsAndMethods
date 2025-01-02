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
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); 
		System.out.println("Tipo referência:");
		System.out.println(c1 == c2); //aqui vai ser false porque as referêcias de mémoria são diferentes
		System.out.println(s3 == s4);
		System.out.println("Tipo primitivo:");
		System.out.println(s1 == s2);	
	}
}
