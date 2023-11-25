package Fila.Fila_Loiane;

import java.util.LinkedList;
import java.util.Queue;

public class y_Aula23 {

	public static void main(String[] args) {

		Queue<Integer> fila = new LinkedList<>(); // Queue > Interface		
		fila.add(1); //enqueue - enfileirar
		fila.add(2);

		System.out.println("Fila atual: " + fila + "\n");

		System.out.println("Espiando o 1º da Fila:  " + fila.peek()); //espiar

		System.out.println("Removendo da fila: " + fila.remove() + "\n"); //dequeue - desenfileirar

		System.out.println("Fila atual: " + fila);
	}
}


//public static void main(String[] args) {
//
//	Fila<Integer> fila = new Fila<>(); // Usando sua classe Fila
//
//	fila.enfileira(1); // enqueue - enfileirar
//	fila.enfileira(2);
//
//	System.out.println("Fila atual: " + fila + "\n");
//
//	System.out.println("Espiando o 1º da Fila:  " + fila.espiar()); // espiar
//
//	System.out.println("Removendo da fila: " + fila.desenfileira() + "\n"); // dequeue - desenfileirar
//
//	System.out.println("Fila atual: " + fila);
//}
//}