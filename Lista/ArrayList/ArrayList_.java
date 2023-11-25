package Lista.ArrayList;


import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayList_ {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Marcos");
		lista.add("Juliana");
		lista.add("Ana");
		lista.add("Maria");
		lista.add("Jose");
		lista.add("Daniela");
		lista.add("Danada");
		
		for(String x: lista) {
			System.out.println(x);
			
		}
		System.out.println("-------------------------------------------");
		lista.remove(1);
		for(String x: lista) {
			System.out.println(x);
		}
		System.out.println("-------------------------------------------");
		lista.removeIf(x -> x.charAt(0) == 'M');
		for(String x: lista) {
			System.out.println(x);
		}
		System.out.println("-------------------------------------------");
		lista.add(1, "Danilo");
		for(String x: lista) {
			System.out.println(x);
		}
		System.out.println("-------------------------------------------");
		System.out.println("Index of Danilo: "+lista.indexOf("Danilo"));
		System.out.println("Index of Jessica: "+lista.indexOf("Jessica"));
		System.out.println("-------------------------------------------");
		
		// agora criar uma nova lista a partir da lista atual
		// criar um novo objeto 1 converte pra lista 2 faca a operacao 3 volta pra list
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList()); // convertento pra string usando .collect
		for(String x: result) {
			System.out.println(x);
		}
		// enontrar o elemento com o predicado primeiro valor com o filtro 
		System.out.println("-------------------------------------------");
		String nome = lista.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null); // criando uma variavel
		System.out.println(nome);
		
	} 
}	



