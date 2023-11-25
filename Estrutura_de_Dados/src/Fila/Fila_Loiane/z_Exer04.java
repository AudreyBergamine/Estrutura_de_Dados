package Fila.Fila_Loiane;

import java.util.Random;

/* DESAFIO DA BATATA QUENTE
 Escreva um programa usando Filas que simule a brincadeira da "Batata Quente" 
 A brincadeira consiste de um grupo de crianças que fica em circulos, sentados ou em pé
 Uma criança fica fora da roda, de costas ou com olhos vendados, dizendo a frase "Batata quente, quente, quente...queimou!"
 Enquanto isso, os demias vão passando a bola de mão em mão, até ouvirem a palavra "queimou"
 Quem estiver com a bola nesse momento, sai da roda...
 Ganha o ultimo que sobrar
 */

public class z_Exer04 {

	public static void main(String[] args) {

		Fila<Integer> fila = new Fila<>();

		for (int i = 0; i < 10; i++) { // 10 Crianças
			fila.enfileira(i);
		}

		Random aleatorio = new Random(); // Simular o quente, quente, quente... de 0 a 10 
		int num = 0;
		while (num == 0) {
			num = aleatorio.nextInt(10);
		}

		System.out.println("Número: " + num + "\n");

		while (fila.tamanho() > 1) { // Precisa sobrar 1 criança na Fila, logo, enquanto for maior que 1... 
			for (int i = 0; i < num; i++) {
				fila.enfileira(fila.desenfileira()); // Para dar a impressão de Fila Circular... 
			}
			System.out.println("Eliminado: " + fila.desenfileira());
		}

		System.out.println("\nGanhador: " + fila.desenfileira());
	}

}