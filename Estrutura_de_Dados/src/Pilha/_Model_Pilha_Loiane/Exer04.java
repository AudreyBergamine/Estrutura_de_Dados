package Pilha._Model_Pilha_Loiane;

import java.util.Stack;

public class Exer04 {

public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		livro1.setNome("Learning JavaScript Data Structures and Algorithms - Second Edition");
		livro1.setAutor("Loiane Groner");
		livro1.setAnoLancamento(2016);
		livro1.setIsbn("B01C2XX8Y2");
		
		Livro livro2 = new Livro();
		livro2.setNome("Learning JavaScript Data Structures and Algorithms");
		livro2.setAutor("Loiane Groner");
		livro2.setAnoLancamento(2014);
		livro2.setIsbn("B00OYTCT02");
		
		Livro livro3 = new Livro();
		livro3.setNome("Mastering Ext JS - Second Edition");
		livro3.setAutor("Loiane Groner");
		livro3.setAnoLancamento(2015);
		livro3.setIsbn("B00U01QQWU");
		
		Livro livro4 = new Livro();
		livro4.setNome("JavaScript Regular Expressions");
		livro4.setAutor("Loiane Groner");
		livro4.setAnoLancamento(2015);
		livro4.setIsbn("B00YHBVHGO");
		
		System.out.println("\n\n======================================================================== \n");
		System.out.println("Teste da Pilha do Java Chamada Stack: \n\n");
		Stack<Livro> pilha = new Stack<Livro>();
		
		System.out.println("Pilha de livros criada, pilha está vazia? "+ pilha.isEmpty() + "\n");
		
		System.out.println("Empilhando livros na pilha:");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		
		System.out.println( "\n" + pilha.size() + " livros foram empilhados:  \n");
		System.out.println(pilha);
		
		System.out.println( "\nPilha de livros criada, pilha está vazia? "+ pilha.isEmpty());
		
		System.out.println("\nEspiando o topo da pilha: " + pilha.peek());

		System.out.println("\nDesempilhando livros da pilha:");
		
		while (!pilha.isEmpty()){
			System.out.println("\nDesempilhando livro: " + pilha.pop());
		}
		
		System.out.println("\nTodos os livros foram desempilhandos, pilha vazia: " + pilha.isEmpty());
	}
}