package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		//Meu código:
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n1 = sc.nextInt();
		
		for(int i = 0; i < n1; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		int n2 = sc.nextInt();
		
		for(int i = 0; i < n2; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		int n3 = sc.nextInt();
		
		for(int i = 0; i < n3; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("Total students: " + set.size());
		sc.close();
	}
}

/*Código do Nelio:
 * public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			b.add(number);
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			c.add(number);
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());

		sc.close();
	}
}
 */
