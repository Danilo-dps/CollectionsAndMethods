package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		System.out.println("Exibindo pela primeira vez");
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Mostrando o tamanho: ");
		System.out.println(list.size());
		System.out.println();
		
		System.out.println("Mostrando a posição:");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println();
		
		System.out.println("Exibindo nomes que comecem com A:");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Filtrando até encontrar o primeiro com a letra A:");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println();
		System.out.println("Adicionando o nome Marco a posição 2 da lista:");
		list.add(2, "Marco");
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Removendo passando o nome Anna:");
		list.remove("Anna");
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Removendo passando a posição 1");
		list.remove(1);
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("Removendo usando IF:");
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}		
	}
}
